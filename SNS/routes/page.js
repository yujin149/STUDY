const express = require('express');
const { renderProfile, renderJoin, renderMain, renderHashtag } = require('../controllers/page');

const router = express.Router();

/*router.use((req, res, next) => {
  //res.locals로 값을 설정하는 이유는 user와 followingCount, followerCount, followingIdList 변수는 모든 템플릿 엔진에서 공통으로 사용하기 때문.
  res.locals.user = null; 
  res.locals.followerCount = 0;
  res.locals.followingCount = 0;
  res.locals.followingIdList = [];
  next();
});*/

router.use((req, res, next) => {
  res.locals.user = req.User; 
  //?.는 null이여도 에러가 안남. 
  res.locals.followerCount = req.user?.Followers?.length || 0;
  res.locals.followingCount = req.user?.Followings?.length || 0;
  res.locals.followingIdList = req.user?.Followings?.map(f => f.id) || [];
  next();
});



router.get('/profile', renderProfile);
router.get('/join', renderJoin);
router.get('/', renderMain);

/*
router.get('/profile', isLoggedIn ,renderProfile);
router.get('/join', isNotLoggendIn, renderJoin);
router.get('/', renderMain);
*/

module.exports = router;
