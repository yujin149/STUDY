const express = require('express');
const path = require('path');

const app = express();


app.set('port', process.env.PORT || 3000); //process.env.PORT에 포트가 있으면 이거 쓰고, 아니면 3000번을 쓴다.


/**미들웨어 사용하기 */
app.use((req,res,next) =>{
console.log('모든 요청에 다 실행됩니다.');
next();
});


app.get('/', (req, res, next) => {
  // res.send('Hello, Express');
  //res.sendFile(path.join(__dirname, '/index.html'));
  console.log("/GET");
  next();
},(req, res) => {
  throw new Error('에러');
});

app.use((err, req,res,next)=>{
console.error(err);
res.status(500).send(err.message);
});

app.listen(app.get('port'), () => {
  console.log(app.get('port'), '번 포트에서 대기 중');
});
