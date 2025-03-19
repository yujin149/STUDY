const fs = require('fs');

const readStream = fs.createReadStream('./readme3.txt', { highWaterMark: 16 }); //createReadStrem으로 읽기 스트림을 만든다.
//highWaterMark는 버퍼의 크기(바이트 단위)를 정할 수 있는 옵션/ 기본값은 64KB
const data = [];

readStream.on('data', (chunk) => {  
  data.push(chunk); // 하나씩 push
  console.log('data :', chunk, chunk.length);
});

readStream.on('end', () => {
  console.log('end :', Buffer.concat(data).toString()); //concat으로 문자열 합침.
});

readStream.on('error', (err) => {
  console.log('error :', err);
});
