const { Post, Hashtag } = require('../models');

exports.afterUploadImage = (req, res) => {
  console.log(req.file);
  res.json({ url: `/img/${req.file.filename}` });
};

exports.uploadPost = async (req, res, next) => {
  try {
    const post = await Post.create({
      content: req.body.content,
      img: req.body.url,
      UserId: req.user.id,
    });
    const hashtags = req.body.content.match(/#[^\s#]*/g); //#으로 시작해서 문장
    if (hashtags) {
      const result = await Promise.all(
        hashtags.map(tag => { //#으로 나오는 개 여러개 일수도 있으므로, 
          return Hashtag.findOrCreate({ //있으면 찾는
            where: { title: tag.slice(1).toLowerCase() }, 
          })
        }),
      );
      await post.addHashtags(result.map(r => r[0])); //추가
    }
    res.redirect('/');
  } catch (error) {
    console.error(error);
    next(error);
  }
};