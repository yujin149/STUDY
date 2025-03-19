const { Worker, isMainThread, parentPort, workerData } = require('worker_threads');

const min = 2; // 소수를 찾기 시작하는 최소값
let primes = []; // 소수를 저장할 배열

// 주어진 범위(start, end)에서 소수를 찾는 함수
function findPrimes(start, end) {
  let isPrime = true;
  for (let i = start; i <= end; i++) {
    for (let j = min; j < Math.sqrt(end); j++) {
      if (i !== j && i % j === 0) { // i가 j로 나누어 떨어지면 소수가 아님
        isPrime = false;
        break;
      }
    }
    if (isPrime) { // 소수인 경우 배열에 추가
      primes.push(i);
    }
    isPrime = true; // 다음 숫자에 대해서는 다시 소수 여부를 체크
  }
}

if (isMainThread) { // 메인 스레드일 때
  const max = 10000000; // 찾을 소수의 최대값
  const threadCount = 8; // 사용할 스레드 수
  const threads = new Set(); // 워커 스레드를 관리할 Set
  const range = Math.floor((max - min) / threadCount); // 각 스레드가 처리할 범위의 크기
  let start = min; // 각 스레드에서 소수를 찾기 시작할 시작 값
  console.time('prime'); // 소수 찾기 시간 측정 시작

  // 워커 스레드를 생성하여 소수를 찾도록 분할 작업
  for (let i = 0; i < threadCount - 1; i++) {
    const end = start + range - 1; // 각 스레드의 끝 범위
    threads.add(new Worker(__filename, { workerData: { start, range: end } })); // 워커 스레드 생성
    start += range; // 다음 워커가 처리할 범위의 시작값 설정
  }

  // 마지막 워커 스레드, 최대값까지 포함하도록 설정
  // 총 9개 워크 -> 하나씩 빼면서 세팅
  threads.add(new Worker(__filename, { workerData: { start, range: max } }));

  // 각 워커의 이벤트 처리
  for (let worker of threads) {
    //on 리스너를 각자 워커 쓰레드에 장착
    worker.on('error', (err) => { // 워커에서 오류가 발생하면 예외 처리
      throw err;
    });
    worker.on('exit', () => { // 워커가 종료되면 처리
      threads.delete(worker); // 종료된 워커를 Set에서 제거
      if (threads.size === 0) { // 모든 워커가 종료되었을 때
        console.timeEnd('prime'); // 소수 찾기 시간 종료
        console.log(primes.length); // 찾은 소수의 개수를 출력
      }
    });
    worker.on('message', (msg) => { // 워커가 보낸 메시지를 처리
      primes = primes.concat(msg); // 워커가 찾은 소수를 배열에 합침
    });
  }
} else { // 워커 스레드일 때
  // 부모로부터 전달받은 범위에서 소수 찾기
  findPrimes(workerData.start, workerData.range);
  parentPort.postMessage(primes); // 부모에게 찾은 소수를 메시지로 전송
}
