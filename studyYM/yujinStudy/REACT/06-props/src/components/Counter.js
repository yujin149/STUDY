// Counter.js (자식)
/** 
 //기본 사용법법

import React, { useState } from 'react';

const Counter = (props) => {
  // 부모로부터 전달된 initialValue를 상태의 초기값으로 사용
  const [count, setCount] = useState(props.initialValue);  

  const onIncrease = () => {
    setCount(count + 1);  // 숫자 증가
  };

  const onDecrease = () => {
    setCount(count - 1);  // 숫자 감소
  };

  return (
    <div>
      <h2>{count}</h2>
      <button onClick={onIncrease}>+</button>
      <button onClick={onDecrease}>-</button>
    </div>
  );
};

export default Counter;
*/

//여러 값 전달하기기
/* import React, { useState } from 'react';

// 비구조화 할당으로 props에서 초기값만 받아옴
const Counter = ({ initialValue }) => {
  const [count, setCount] = useState(initialValue);  // 전달받은 initialValue로 상태 초기화
  
  const onIncrease = () => {
    setCount(count + 1);  // 값 증가
  };

  const onDecrease = () => {
    setCount(count - 1);  // 값 감소
  };

  return (
    <div>
      <h2>{count}</h2>  // 상태 값 표시 
      <button onClick={onIncrease}>+</button>  //증가 버튼 
      <button onClick={onDecrease}>-</button>  // 감소 버튼 
    </div>
  );
};

export default Counter;
*/



//기본값 설정하기
import React, { useState } from 'react';

const Counter =  ({ initialValue }) => {	// 값 전달 받음
  const [count, setCount] = useState(0);
  const onIncrease = () => { setCount(count + 1); }
  const onDecrease = () => { setCount(count - 1); }

  return (
      <div>
          <h2>{count}</h2>
          <button onClick={onIncrease}>+</button>
          <button onClick={onDecrease}>-</button>
      </div>
  );
};


// defaultProps로 기본값 설정
Counter.defaultProps = {
  initialValue: 0  // initialValue가 전달되지 않으면 기본값 0 사용
};

export default Counter;


