import React, {useState} from 'react';
import styled from 'styled-components/native';
import Button from './Button';

const StyledText = styled.Text`
  font-size:24px;
  margin:10px;
`;

const Counter = () => {
  const [count, setCount] = useState(0);
  return(
    <>
      <StyledText>count : {count}</StyledText>
      <Button 
        title="+"
        onPress={() => {
          /*
          2씩 증가X
          setCount(count + 1);
          setCount(count + 1);
          console.log(`count : ${count}`);
          */
         setCount(preCount => preCount + 1);
         setCount(preCount => preCount + 1);
         console.log(`count : ${count}`);
        }}
      />
      <Button
        title = "-"
        onPress={() => {
          setCount(count - 1);
        }}
      />
    </>
  );
};

export default Counter;

