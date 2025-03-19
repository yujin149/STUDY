const express = require('express');

const router = express.Router();

// GET / 라우터
/*
router.get('/', (req, res) => {
  res.send('Hello, Express');
});
*/

router.get('/', (req, res) => {
  res.render('index',{title: '호랑이'}); //index.html
});


router.get('/abc', (req, res) => { // /abc
  res.send('Hello, abc');
});



module.exports = router;
