// App.js (부모)
import React from 'react';
import Counter from './components/Counter';  // Counter 컴포넌트 불러오기

function App() {
  //기본 사용법
  {/**
    return (
    <div className="App">
      <h1 id="title">계산기</h1>
      <Counter initialValue={5} />  // initialValue 값을 전달
    </div>
  );
  */}


  // 여러 값 전달하기
  {/* const counterProps = {
    a :1,
    b :2,
    c :3,
    d :4,
    initialValue : 5
  }
  console.log(counterProps);
  return (
    <div className="App">
      <h1 id="title">계산기</h1>
      <Counter {...counterProps} />
    </div>
  );

  */}


  // 기본값 설정하기
const counterProps = {
  a: 1,
  b: 2,
  c: 3,
  d: 4
  // initialValue는 전달되지 않음
};

return (
  <div className="App">
    <h1 id="title">계산기</h1>
    <Counter {...counterProps} />  {/* initialValue 없이 전달 */}
  </div>
);


}

export default App;
