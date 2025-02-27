import React from 'react';
import styled from 'styled-components/native';
import Counter from './components/Counter';
// import Form from './components/Form';

/**
 * useState : 상태관리
 * const [state, setState] = useState(초기값);
 * 값을 변경 setState(값)
 */

const Container = styled.View`
  flex:1;
  background-color:#fff;
  justify-content:center;
  align-items: center;
`;

const App = () => {
  return (
  <Container>
    <Counter/>
    {/* <Form /> */}
  </Container>
  )
};

export default App;