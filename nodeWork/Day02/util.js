const util = require('util');
const crypto = require('crypto');

const dontUseMe = util.deprecate((x, y) => {
  console.log(x + y);
}, 'dontUseMe 함수는 deprecated되었으니 더 이상 사용하지 마세요!');
dontUseMe(1, 2);

const randomBytesPromise = util.promisify(crypto.randomBytes);
randomBytesPromise(64) //암호화 받아서
  .then((buf) => {
    console.log(buf.toString('base64')); //여기서 암호화
  })
  .catch((error) => {
    console.error(error);
  });
