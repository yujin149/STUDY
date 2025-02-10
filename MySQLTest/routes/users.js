const express = require('express');
const User = require('../models/user');
const Comment = require('../models/comment');

const router = express.Router();

router.route('/')
  .get(async (req, res, next) => {
    try {
      const users = await User.findAll();
      res.json(users);
    } catch (err) {
      console.error(err);
      next(err);
    }
  })
  .post(async (req, res, next) => { //submit 눌렀을때,
    try {
      const user = await User.create({ //이때 db들어감.
        name: req.body.name,
        age: req.body.age,
        married: req.body.married,
      });
      console.log(user);
      res.status(201).json(user); //성공
    } catch (err) {
      console.error(err);
      next(err);
    }
  });

router.get('/:id/comments', async (req, res, next) => { //users/id값/comments 
  try {
    const comments = await Comment.findAll({
      include: {
        model: User,
        where: { id: req.params.id }, //:id로 받은 아이디 값 / req.params.id로 값을 가져올 수 있다.
      },
    });
    console.log(comments);
    res.json(comments);
  } catch (err) {
    console.error(err);
    next(err);
  }
});

module.exports = router;
