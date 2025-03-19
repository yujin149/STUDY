const passport = require('passport');
const local = require('./localStrategy');
const kakao = require('./kakaoStrategy');
const User = require('../models/user');

module.exports = () => {
  passport.serializeUser((user, done) => { //연결
    done(null, user.id); 
  });

  passport.deserializeUser((id, done) => { //끊기
    /*
    User.findOne({ where: { id } })
      .then(user => done(null, user))
      .catch(err => done(err));
    */
      User.findOne({
        where: { id },
        include: [{
          model: User,
          attributes: ['id', 'nick'],
          as: 'Followers',
        }, {
          model: User,
          attributes: ['id', 'nick'],
          as: 'Followings',
        }],
      })
        .then(user => done(null, user))
        .catch(err => done(err));
  });

  local(); //일반 로그인
  kakao(); //카카오 로그인
};
