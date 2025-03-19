const express = require('express');
const morgan = require('morgan');
const cookieParser = require('cookie-parser');
const session = require('express-session');
const dotenv = require('dotenv');
const path = require('path');

dotenv.config();
const app = express();
app.set('port', process.env.PORT || 3000);

app.use(morgan('dev'));
app.use('/', express.static(path.join(__dirname, 'public')));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser(process.env.COOKIE_SECRET));
app.use(session({
  resave: false, //다시 저장하는 것을 막아준다.
  saveUninitialized: false, //초기화하는 저장을 안한다.
  secret: process.env.COOKIE_SECRET, //.env를 쓴다.
  cookie: {
    httpOnly: true, 
    secure: false, //https는 true를 사용하는게 좋음.
  },
  name: 'session-cookie',
}));


const multer = require('multer');
const fs = require('fs');

try {
  fs.readdirSync('uploads');
} catch (error) {
  console.error('uploads 폴더가 없어 uploads 폴더를 생성합니다.');
  fs.mkdirSync('uploads');
}
const upload = multer({
  storage: multer.diskStorage({
    destination(req, file, done) { //업로드할 목적지지
      done(null, 'uploads/'); //uploads 폴더에 들어간다.
    },
    filename(req, file, done) {
      const ext = path.extname(file.originalname); //확장자명
      done(null, path.basename(file.originalname, ext) + Date.now() + ext); //파일명 + 날짜 + 확장자명
    },
  }),
  limits: { fileSize: 5 * 1024 * 1024 }, //5메가로 제한한
});

app.get('/upload', (req, res) => { //화면나오게
  res.sendFile(path.join(__dirname, 'multipart.html'));
});
app.post('/upload', upload.array('many'), (req, res) => { //이미지 하나 받는다.
  console.log(req.file);
  res.send('ok');
});

app.get('/', (req, res, next) => {
  console.log('GET / 요청에서만 실행됩니다.');
  next();
}, (req, res) => {
  throw new Error('에러는 에러 처리 미들웨어로 갑니다.')
});
app.use((err, req, res, next) => {
  console.error(err);
  res.status(500).send(err.message);
});

app.listen(app.get('port'), () => {
  console.log(app.get('port'), '번 포트에서 대기 중');
});

