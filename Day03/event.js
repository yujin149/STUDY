const EventEmitter = require('events');

const myEvent = new EventEmitter();
myEvent.addListener('event1', () => {
  console.log('이벤트 1');
});
myEvent.on('event2', () => {
  console.log('이벤트 2');
});
myEvent.on('event2', () => {
  console.log('이벤트 2 추가');
});
myEvent.once('event3', () => {
  console.log('이벤트 3');
}); // 한 번만 실행됨

myEvent.emit('event1'); // 이벤트 호출 //emit은 강제로 실행.
myEvent.emit('event2'); // 이벤트 호출

myEvent.emit('event3');
myEvent.emit('event3'); // 실행 안 됨 //once는 한번만 부르기때문에, 실행이 되지 않는다.

myEvent.on('event4', () => {
  console.log('이벤트 4');
});
myEvent.removeAllListeners('event4'); //리스너를 지움. 따라서 실행 안됨.
myEvent.emit('event4'); // 실행 안 됨

const listener = () => { //함수라고 보면 됨.
  console.log('이벤트 5');
};
myEvent.on('event5', listener);
myEvent.removeListener('event5', listener); //여기서 지웠기 때문에 실행이 안되는 거임.
myEvent.emit('event5'); // 실행 안 됨

console.log(myEvent.listenerCount('event2')); //몇번 불렸는지
