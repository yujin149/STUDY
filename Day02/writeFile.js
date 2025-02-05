const fs = require('fs');

fs.writeFile('./writeme.txt', '글이 입력됩니다', (err) => { //쓰고
  if (err) {
    throw err;
  }
  fs.readFile('./writeme.txt', (err, data) => { //읽기
    if (err) {
      throw err;
    }
    console.log(data.toString());
  });
});
