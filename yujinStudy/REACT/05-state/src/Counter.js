import React, { useState } from 'react';  // React와 useState import

const Counter = () => {
  // useState로 상태 초기화: count는 0으로 초기화
  const [count, setCount] = useState(0);

  // 숫자 증가
  const onIncrease = () => { 
    setCount(count + 1); 
  }

  // 숫자 감소
  const onDecrease = () => { 
    setCount(count - 1); 
  }

  return (
    <div>
      <h2>{count}</h2> {/* count 값을 화면에 출력 */}
      <button onClick={onIncrease}>+</button>  {/* 증가 버튼 */}
      <button onClick={onDecrease}>-</button>  {/* 감소 버튼 */}
    </div>
  )
}

export default Counter;
