const {
  Worker, isMainThread, parentPort, // 'worker_threads' 모듈에서 Worker, isMainThread, parentPort를 구조 분해 할당.
} = require('worker_threads');

if (isMainThread) { // 메인 스레드일 때
  const worker = new Worker(__filename); // 현재 파일을 워커 스레드에서 실행.
  worker.on('message', message => console.log('from worker', message)); // 워커로부터 메시지를 받으면 콘솔에 출력.
  worker.on('exit', () => console.log('worker exit')); // 워커가 종료되면 'worker exit' 메시지 출력.
  worker.postMessage('ping'); // 워커에 'ping' 메시지를 전송.
} else { // 워커 스레드일 때
  parentPort.on('message', (value) => { // 부모(메인 스레드)로부터 메시지를 받음.
    console.log('from parent', value); // 부모로부터 받은 메시지를 콘솔에 출력.
    parentPort.postMessage('pong'); // 부모에게 'pong' 메시지를 전송.
    parentPort.close(); // 부모와 워커 간의 연결을 종료.
  });
}
