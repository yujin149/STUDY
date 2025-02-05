const zlib = require('zlib'); // zlib 모듈을 불러옴. 이 모듈은 압축 관련 작업을 처리함.
const fs = require('fs'); // 파일 시스템 모듈을 불러옴. 파일을 읽고 쓰는 데 사용됨.

const readStream = fs.createReadStream('./readme4.txt'); // 'readme4.txt' 파일을 읽기 스트림으로 연다.
const zlibStream = zlib.createGzip(); // 'createGzip' 메서드를 사용하여 GZIP 압축 객체를 만든다다.
const writeStream = fs.createWriteStream('./readme4.txt.gz'); // 압축된 데이터를 쓸 'readme4.txt.gz' 파일을 쓰기 스트림으로 연다.

// 파이프를 사용하여 데이터의 흐름을 연결한다.
// readStream에서 데이터를 읽고, zlibStream을 통해 데이터를 압축하고, writeStream을 통해 압축된 데이터를 파일로 저장한다.
readStream.pipe(zlibStream).pipe(writeStream);
