const http = require('http');
const fs = require('fs').promises;
const path = require('path');

//무조건 이거부터 실행행
const parseCookies = (cookie = '') => // 쿠키가 없으면 ''으로 defalut값 넣기
  
  cookie
    .split(';') //;기준으로 자른다.
    .map(v => v.split('='))
    .reduce((acc, [k, v]) => { //acc는 데이터를 담는 객체 {}이 부분이 들어간다. k는 키 v는 값
      acc[k.trim()] = decodeURIComponent(v); //빈공간 다 삭제 //v를 디코딩
      return acc; 
    }, {}); //여기서의 {}가 acc가 들어감.

http.createServer(async (req, res) => {
  console.log(req.headers.cookie); //쿠키 확인
  const cookies = parseCookies(req.headers.cookie); // { mycookie: 'test' }
  // 주소가 /login으로 시작하는 경우
  if (req.url.startsWith('/login')) {
    const url = new URL(req.url, 'http://localhost:8084');
    const name = url.searchParams.get('name'); 

    //구조분할 할당으로 query문에서 name을 추출
    //const{ query } = url.parse(req.url);
    //const{ name } = qs.parse('query'); 
    const expires = new Date();
    // 쿠키 유효 시간을 현재시간 + 5분으로 설정
    expires.setMinutes(expires.getMinutes() + 5);
    res.writeHead(302, {
      Location: '/',
      'Set-Cookie': `name=${encodeURIComponent(name)}; Expires=${expires.toGMTString()}; HttpOnly; Path=/`,
    });
    res.end();
  // name이라는 쿠키가 있는 경우
  } else if (cookies.name) {
    res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
    res.end(`${cookies.name}님 안녕하세요`);
  } else {
    try {
      const data = await fs.readFile(path.join(__dirname, 'cookie2.html'));
      res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
      res.end(data);
    } catch (err) {
      res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' });
      res.end(err.message);
    }
  }
})
  .listen(8084, () => {
    console.log('8084번 포트에서 서버 대기 중입니다!');
  });
