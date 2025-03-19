var Human = function(type){ //클래스명 //클래스 선언한거
  this.type = type || 'human'; // 생성자
};

  Human.isHuman = function(human){ //static 함수
    return human instanceof Human; //그 안에 객체가 있으면 true //instanceof 객체가 있는지 없는지 확인인
  }

  Human.prototype.breathe = function(){ //멤버 함수
    alert('h-a-a-a-m');
  };

  var Zero = function( type, firstName, lastName){ //클래스명
    Human.apply(this.arguments); //Zero가 Human 상속 받은거
    this.firstName = firstName;
    this.lastName = lastName;
  };

  Zero.prototype = Object.create(Human.prototype); //상속 하는 부분
  Zero.prototype.constructor = Zero; //상속하는 부분
  Zero.prototype.sayName = function(){ // 멤버 함수 (static 안붙은 거)
    alert(this.firstName + ' ' + this.lastName);
  };

var oldZero = new Zero('a', 'Zero', 'Cho');
console.log(Human.isHuman(oldZero)); //true
console.log(oldZero.firstName);
console.log(oldZero.lastName);
console.log(oldZero.type);
