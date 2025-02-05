var candyMachine = {
  status : {
    name : 'node',
    count : 5,
  },
  getCandy : function (){
    this.status.count--;
    return this.status.count;
  },
};
var getCandy = candyMachine.getCandy; //구조 분해 할당
console.log(candyMachine.getCandy());
var count = candyMachine.status.count;
console.log(count);

console.log(getCandy); //[Function: getCandy]