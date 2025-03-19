package Day16;

interface Repairable {
}

interface Heal {
}

class Unit1 {
    int attack;
    int hitPoint;
    final int MAX_HP;

    Unit1(int hp, int attack) {
        MAX_HP = hp;
        hitPoint = MAX_HP;
        this.attack = attack;
    }
}

class GroundUnit extends Unit1 {
    GroundUnit(int hp, int attack) {
        super(hp, attack);
    }
}

class AirUnit extends Unit1 {
    AirUnit(int hp, int attack) {
        super(hp, attack);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150, 10);
    }

    @Override
    public String toString() { //object 클래스 최상단 부모
        //여기에 있는 메소드가 toString
        //객체 print -> 메모리주소 object class public String toString() 정의
        //재정의
        //많이 쓴다~
        return "Tank";
    }
}

class SCV extends GroundUnit implements Repairable, Heal {
    SCV() {
        super(60, 5);
    }

    void repair(Repairable r) {
        if (r instanceof Unit1) {
            Unit1 u = (Unit1) r; //형변환을 통해서 실객체로 바꿔준다
            if (u != null && u.MAX_HP != u.hitPoint) {
                System.out.println(u + "에너지 1증가");
                u.hitPoint++;
            }
        }
    }
}

class Marine1 extends GroundUnit implements Heal {
    Marine1() {
        super(40, 6);
    }
}

class Madic extends GroundUnit implements Heal {
    Madic() {
        super(80, 0);
    }

    void Heal(Heal h) {
        if (h instanceof Unit1) {
            Unit1 u = (Unit1) h;
            if (u != null && u.MAX_HP != u.hitPoint) {
                u.hitPoint += 2;
            }
        }
    }
}

public class LastAbstract {
    public static void main(String[] args) {
        Tank t = new Tank();
        Marine1 m = new Marine1();
        SCV scv = new SCV();
        t.hitPoint = 20;
        System.out.println(t);

        //scv.repair(m) 마린은 힐이기 때문에 에러
        while (t.hitPoint != t.MAX_HP) {
            scv.repair(t);
        }
        m.hitPoint = 10;
        Madic md = new Madic();
        md.Heal(m);
        //여기에 탱크를 넣으면 힐이 없기 때문에 에러가 난다
    }
}