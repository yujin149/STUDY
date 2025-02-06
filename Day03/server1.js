const http = require('http');

http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' }); //res는 responsive //200 요청이 완료된
  res.write('<h1>Hello Node!</h1>'); // 8080이라는 게 들어오면 이게 뜸.
  res.end('<p>Hello Server!</p>'); // 8080이라는 게 들어오면 이게 뜸.
})
  .listen(8080, () => { // 서버 연결 
    console.log('8080번 포트에서 서버 대기 중입니다!');
  });
