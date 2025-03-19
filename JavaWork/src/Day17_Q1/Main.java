package Day17_Q1;

import java.util.Random;

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
    int maxHp = 2000;

    Knight() {
        super("기사", 50, 2000);
    }
}

class Villain extends Unit {
    int maxHp = 1200;

    Villain() {
        super("악마", 80, 1200);
    }
}

class Burf {
    int incAttack; //공격력 증가
    int heal; //힐
    int debuff; //디버프
}

class Battle {
    Knight knight;
    Villain villain;
    Burf burf;

    Battle() {
        knight = new Knight();
        villain = new Villain();
        burf = new Burf();
        Random r = new Random();

        int count = 0;
        while (knight.hp > 0 && villain.hp > 0) {
            System.out.println("======================================");
            System.out.println((count++) + "번째 경기가 시작됩니다.");
            System.out.println("======================================");

            int burfRan = r.nextInt(3) + 1;
            if (burfRan == 1) {
                burf.incAttack = r.nextInt(101) + 50; //50~150
                if (count % 2 == 0) {
                    System.out.println("버프 : 기사의 공격력이 " + burf.incAttack + "만큼 증가하였다.");
                    knight.attack += burf.incAttack;
                    System.out.println("기사의 공격!!");
                    villain.hp -= knight.attack;
                    System.out.println("악마의 체력이 " + villain.hp + "남았다.");
                    knight.attack = 50;
                } else {
                    System.out.println("버프 : 악마의 공격력이 " + burf.incAttack + "만큼 증가하였다.");
                    villain.attack += burf.incAttack;
                    System.out.println("악마의 공격!!");
                    knight.hp -= villain.attack;
                    System.out.println("기사의 체력이 " + knight.hp + "남았다.");
                    villain.attack = 80;
                }
            } else if (burfRan == 2) {
                burf.heal = r.nextInt(301); //0~100
                if (count % 2 == 0) {
                    System.out.println("버프 : 기사의 체력이 " + burf.heal + "만큼 증가하였다.");
                    knight.hp += burf.heal;
                    if (knight.hp > 2000) {
                        knight.hp = 2000;
                    }
                    System.out.println("기사의 공격!!");
                    villain.hp -= knight.attack;
                    System.out.println("악마의 체력이 " + villain.hp + "남았다.");
                } else {
                    System.out.println("버프 : 악마의 체력이 " + burf.heal + "만큼 증가하였다.");
                    villain.hp += burf.heal;
                    if (villain.hp > 1200) {
                        villain.hp = 1200;
                    }
                    System.out.println("악마의 공격!!");
                    knight.hp -= villain.attack;
                    System.out.println("기사의 체력이 " + knight.hp + "남았다.");
                }

            } else {
                burf.debuff = r.nextInt(200) + 100; //100 ~300
                if (count % 2 == 0) {
                    System.out.println("디버프 : 기사의 체력이 " + burf.debuff + "만큼 감소하였다.");
                    knight.hp -= burf.debuff;
                    System.out.println("기사의 공격!!");
                    villain.hp -= knight.attack;
                    System.out.println("악마의 체력이 " + villain.hp + "남았다.");
                } else {
                    System.out.println("디버프 : 악마의 체력이 " + burf.debuff + "만큼 감소하였다.");
                    villain.hp -= burf.debuff;
                    System.out.println("악마의 공격!!");
                    knight.hp -= villain.attack;
                    System.out.println("기사의 체력이 " + knight.hp + "남았다.");
                }
            }
        }

        if (knight.hp < 0) {
            System.out.println("악마 승");
        }
        if (villain.hp < 0) {
            System.out.println("기사 승");
        }

    }

}

public class Main {
    public static void main(String[] args) {
        new Battle();
    }
}
