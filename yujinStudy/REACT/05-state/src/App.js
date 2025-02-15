import React from 'react';
import './App.css';
import Counter from './Counter';  // Counter 컴포넌트 import

function App() {
  return (
    <div className="App">
      <h1>계산기</h1>
      <Counter />  {/* Counter 컴포넌트를 여기에 삽입 */}
    </div>
  );
}

export default App;
