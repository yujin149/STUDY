import React from 'react';
import { View, Text } from 'react-native';
import { viewStyles, textStyles } from './style';
import { Header, Contents, Footer } from './components/Layout';
import ShadowBox from './components/ShadowBox';

const App = () => {
  return (
    <View style={viewStyles.container}>
      {/*<Text style={textStyles.text}>
        Inline Styling - Text</Text>
      <Text style={[textStyles.text, textStyles.error]}>
        Inline Styling - Error
      </Text>*/}
      {/** 
      <Header />
      <Contents />
      <Footer />
      */}
      <ShadowBox />
    </View> 
  );
};


export default App;