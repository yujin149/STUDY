const candyMachine = {
  status : {
    name : 'node',
    count : 5,
  },
  getCandy(){
    this.status.count--;
    return this.status.count;
  },

};

const {getCandy, status:{ count }} = candyMachine;

console.log(candyMachine.getCandy());
console.log(candyMachine.status.name);
