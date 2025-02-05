var sayNode = function(){ 
  console.log('Node');
}; //sayNode(){}랑 동일
var es = 'ES';
var oldObject = {
  sayJS : function(){
    console.log('JS');
  }, //sayJS(){} 
  sayNode : sayNode,
  //ES6 : 'Fantastic'
};
//        ES6 = 'Fantastic'
oldObject[es + 6] = 'Fantastic';
oldObject.sayNode(); //Node
oldObject.sayJS(); //JS
console.log(oldObject.ES6); //Fantastic




const newObject = {
  sayJS(){
    console.log('JS');
  },
  sayNode,
  [es + 6]:'Fantastic',
};
newObject.sayNode(); //Node
newObject.sayJS(); //JS
console.log(newObject.ES6); //Fantastic


