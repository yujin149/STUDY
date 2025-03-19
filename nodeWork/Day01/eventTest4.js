function lrt(){
  console.log("작업 끝");
}

//논 블로킹
console.log('시작');
setTimeout(lrt,0);
console.log('다음작업');