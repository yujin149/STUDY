exports.renderProfile = (req, res) => {
  res.render('profile', { title: '내 정보 - NodeBird' }); //html -> profile.html
};

exports.renderJoin = (req, res) => {
  res.render('join', { title: '회원가입 - NodeBird' });
};

exports.renderMain = (req, res, next) => { //메인페이지를 렌더링하면서 넌적스에 twits(게시글 목록)를 전달.
  const twits = [];
  res.render('main', {
    title: 'NodeBird',
    twits,
  });
};
