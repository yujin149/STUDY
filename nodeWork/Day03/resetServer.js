const http = require('http');
const fs = require('fs').promises;
const path = require('path');

const users = {}; // 데이터 저장용

http.createServer(async (req, res) => {
  try {
    if (req.method === 'GET') { //req.method로 http 요청 메서드를 구분. //GET이면 req.url로 요청 주소를 구분한다.
      if (req.url === '/') { // restFront.html을 제공.
        const data = await fs.readFile(path.join(__dirname, 'restFront.html'));
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        return res.end(data);
      } else if (req.url === '/about') { // about.html 파일을 제공.
        const data = await fs.readFile(path.join(__dirname, 'about.html'));
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        return res.end(data);
      } else if (req.url === '/users') { // 현재 저장된 데이터(users)를 JSON형식으로 반환.
        res.writeHead(200, { 'Content-Type': 'application/json; charset=utf-8' });
        return res.end(JSON.stringify(users));
      }
      // /도 /about도 /users도 아니면
      try {
        const data = await fs.readFile(path.join(__dirname, req.url));
        return res.end(data);
      } catch (err) {
        // 주소에 해당하는 라우트를 못 찾았다는 404 Not Found error 발생
      }
    } else if (req.method === 'POST') { // POST 요청이 /user 경로로 들어오면, 요청 본문을 받아 users객체에 새로운 사용자 데이터 추가.
      if (req.url === '/user') {
        let body = '';
        // 요청의 body를 stream 형식으로 받음
        req.on('data', (data) => { //req.on('data') 요청의 본문에 들어 있는 데이터를 꺼내기 위한 작업 //스트리밍 방식으로 처리
          body += data;
        });
        // req.on('end', () => { ... })HTTP 요청의 body를 다 받은 후 실행됨
        return req.on('end', () => { //req.on('end') 요청의 본문에 들어 있는 데이터를 꺼내기 위한 작업 
          console.log('POST 본문(Body):', body);
          const { name } = JSON.parse(body); //받은 데이터는 문자열이므로 JSON으로 만드는 JSON.parse 과정이 필요하다.
          const id = Date.now();
          users[id] = name; //user[id] 가 키 name 이 값이 됨.
          res.writeHead(201, { 'Content-Type': 'text/plain; charset=utf-8' });
          res.end('등록 성공');
          
        });
      }
    } else if (req.method === 'PUT') { //PUT 요청이 /user/로 시작하는 경로로 들어오면 해당 사용자의 데이터를 수정.
      if (req.url.startsWith('/user/')) {
        const key = req.url.split('/')[2];
        let body = '';
        req.on('data', (data) => { //PUT 요청에서 본문 데이터를 받아 처리.
          body += data;
        });
        return req.on('end', () => { 
          console.log('PUT 본문(Body):', body); 
          users[key] = JSON.parse(body).name; //이 데이터는 문자열이기 때문에 JSON으로 변경 // name속성을 추출하여 users객체의 key에 새로운 이름 할당.
          res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
          return res.end(JSON.stringify(users)); // users 객체를 JSON 문자열로 변환하여 전달. //JSON형식으로 받을 수 있다.
        });
      }
    } else if (req.method === 'DELETE') { //DELETE 요청이 /user/로 시작하는 경로로 들어오면 해당 사용자의 데이터를 삭제.
      if (req.url.startsWith('/user/')) {
        const key = req.url.split('/')[2]; //요청 URL을 /로 나누고, 세 번째 요소인 사용자 ID를 key 변수에 할당하는 코드
        delete users[key]; //users 객체에서 key에 해당하는 사용자 데이터를 삭제.
        res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
        return res.end(JSON.stringify(users));
      }
    }
    res.writeHead(404); // 요청한 URL이 어떤 라우트에도 매칭되지 않으면 404에러.
    return res.end('NOT FOUND');
  } catch (err) {
    console.error(err);
    res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' });
    res.end(err.message);
  }
})
  .listen(8082, () => {
    console.log('8082번 포트에서 서버 대기 중입니다');
  });
