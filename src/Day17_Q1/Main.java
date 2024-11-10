package Day17_Q1;


abstract class Unit {
    String name;
    int attack;
    int hp;

    Unit(String name, int attack, int hp) {
        this.name = name;
        this.attack = attack;
        this.hp = hp;
    }
}

class Knight extends Unit {
    Knight() {
        super("기사", 50, 2000);
    }
}

class Villain extends Unit {
    Villain() {
        super("악마", 80, 1200);
    }
}

class Burf {
    int incAttack; //공격력 증가
    int heal; //힐
    int debuff; //디버프
}

public class Q1 {

}
