const {
  Worker, isMainThread, parentPort, workerData,
} = require('worker_threads');

if (isMainThread) { // 메인 스레드일 때 (부모 스레드)
  const threads = new Set(); // 워커 스레드를 관리할 Set 생성

  // 두 개의 워커를 생성하고 workerData로 데이터를 전달
  threads.add(new Worker(__filename, {
    workerData: { start: 1 }, // 첫 번째 워커에 전달할 데이터
  }));
  threads.add(new Worker(__filename, {
    workerData: { start: 2 }, // 두 번째 워커에 전달할 데이터
  }));

  // 각 워커에 대한 메시지와 종료 이벤트 처리
  for (let worker of threads) {
    worker.on('message', message => console.log('from worker', message)); // 워커로부터 메시지를 받으면 출력
    worker.on('exit', () => {
      threads.delete(worker); // 워커가 종료되면 threads에서 제거
      if (threads.size === 0) { // 모든 워커가 종료되었으면
        console.log('job done'); // 모든 작업이 완료되었다는 메시지 출력
      }
    });
  }
} else { // 워커 스레드일 때
  const data = workerData; // 부모로부터 전달받은 데이터를 변수에 저장
  parentPort.postMessage(data.start + 100); // 부모 스레드에 데이터(start 값 + 100)를 전달
}
