import React from 'react';
import styled from 'styled-components/native';

const StyledInput = styled.TextInput.attrs(props => ({
  placeholder: "Enter a text...",
  placeholderTextColor: props.borderColor, 
}))`
  width: 200px;
  height: 60px;
  margin: 5px;
  padding: 10px;
  border-radius: 10px;
  border: 2px solid;
  border-color: ${props => props.borderColor}; 
`;

const Input = ({ borderColor }) => {
  return <StyledInput borderColor={borderColor} />;
};

export default Input;
