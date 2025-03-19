package Day15;

import java.util.Random;

abstract class Unit {
    int price;
    int energy;
    int attack;
    int defense;
    String target;
    double move;
    String type;

    public Unit(int price, int energy, int attack, int defense, String target, double move, String type) {
        this.price = price;
        this.energy = energy;
        this.attack = attack;
        this.defense = defense;
        this.target = target;
        this.move = move;
        this.type = type;
    }

    abstract void print();
}

abstract class Terran extends Unit {
    String character;

    Terran(String character, int price, int energy, int attack, int defense, String target, double move, String type) {
        super(price, energy, attack, defense, target, move, type);
        this.character = character;
    }

    abstract void print();
}

abstract class Jugg extends Unit {
    String character;

    Jugg(String character, int price, int energy, int attack, int defense, String target, double move, String type) {
        super(price, energy, attack, defense, target, move, type);
        this.character = character;
    }

    abstract void print();
}


class Marine extends Terran {
    Marine() {
        super("마린", 50, 50, 6, 0, "지상,공중", 1.875, "지상,소형,생체");
    }

    void print() {
        System.out.println(super.character + "의 생산비용은 미네랄 " + super.price + ", 체력 " + super.energy + ", 공격력 " + super.attack
                + ", 방어력" + super.defense + ", 공격 대상 " + super.target + ", 이동속도 " + super.move + ", 유닛 특성 " + super.type + "입니다.");
    }
}

class Juggling extends Jugg {
    Juggling() {
        super("저글링", 50, 35, 5, 0, "지상", 2.612, "지상,소형,생체");
    }

    void print() {
        System.out.println(super.character + "의 생산비용은 미네랄 " + super.price + ", 체력 " + super.energy + ", 공격력 " + super.attack
                + ", 방어력" + super.defense + ", 공격 대상 " + super.target + ", 이동속도 " + super.move + ", 유닛 특성 " + super.type + "입니다.");
    }
}

class Hydra extends Jugg {
    Hydra() {
        super("히드라", 100, 80, 10, 0, "지상,공중", 1.741, "지상,중형,생체");
    }

    void print() {
        System.out.println(super.character + "의 생산비용은 미네랄 " + super.price + ", 체력 " + super.energy + ", 공격력 " + super.attack
                + ", 방어력" + super.defense + ", 공격 대상 " + super.target + ", 이동속도 " + super.move + ", 유닛 특성 " + super.type + "입니다.");
    }
}

public class Q3_test {
    public static void main(String[] args) {
        Marine marine = new Marine();
        marine.print();

        Juggling juggling = new Juggling();
        juggling.print();

        Hydra hydra = new Hydra();
        hydra.print();


        System.out.println("============ 공격 시작 ============");
        Terran[] hero = new Terran[3];
        for (int i = 0; i < hero.length; i++) {
            hero[i] = new Marine();
        }

        Juggling jugg1 = new Juggling();
        Hydra jugg2 = new Hydra();


        Random r = new Random();
        int turn = 1;

        /*
        크리티컬 공격 : 공격력 2배 "효과가 굉장했다"
        그냥 일반 공격 : "공격력 1배 효과는 미미했다."
        공격력 무시 : "공격이 빗맞았다."
         */
        while (true) {

            System.out.println("============ " + (turn++) + "턴 ============");


            if (jugg1.energy > 0 && hero[0].energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    jugg1.energy -= (marine.attack * 2);
                    System.out.println("마린1이 공격했습니다. => 효과가 굉장했다!! 저글링 체력 : " + jugg1.energy);
                } else if (ran == 2) {
                    jugg1.energy -= marine.attack;
                    System.out.println("마린1이 공격했습니다. => 효과는 미미했다. 저글링 체력 : " + jugg1.energy);
                } else {
                    System.out.println("마린1이 공격했습니다. => 마린1의 공격이 빗맞았다. 저글링 체력 : " + jugg1.energy);
                }
            } else if (jugg1.energy > 0 && hero[1].energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    jugg1.energy -= (marine.attack * 2);
                    System.out.println("마린2이 공격했습니다. => 효과가 굉장했다!! 저글링 체력 : " + jugg1.energy);
                } else if (ran == 2) {
                    jugg1.energy -= marine.attack;
                    System.out.println("마린2이 공격했습니다. => 효과는 미미했다. 저글링 체력 : " + jugg1.energy);
                } else {
                    System.out.println("마린2이 공격했습니다. => 마린2의 공격이 빗맞았다. 저글링 체력 : " + jugg1.energy);
                }
            } else if (jugg1.energy > 0 && hero[2].energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    jugg1.energy -= (marine.attack * 2);
                    System.out.println("마린3이 공격했습니다. => 효과가 굉장했다!! 저글링 체력 : " + jugg1.energy);
                } else if (ran == 2) {
                    jugg1.energy -= marine.attack;
                    System.out.println("마린3이 공격했습니다. => 효과는 미미했다. 저글링 체력 : " + jugg1.energy);
                } else {
                    System.out.println("마린3이 공격했습니다. => 마린3의 공격이 빗맞았다. 저글링 체력 : " + jugg1.energy);
                }
            } else if (jugg2.energy > 0 && hero[0].energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    jugg2.energy -= (marine.attack * 2);
                    System.out.println("마린1이 공격했습니다. => 효과가 굉장했다!! 히드라 체력 : " + jugg2.energy);
                } else if (ran == 2) {
                    jugg2.energy -= marine.attack;
                    System.out.println("마린1이 공격했습니다. => 효과가 미미했다. 히드라 체력 : " + jugg2.energy);
                } else {
                    System.out.println("마린1이 공격했습니다. => 마린1의 공격이 빗맞았다. 히드라 체력 : " + jugg2.energy);
                }
            } else if (jugg2.energy > 0 && hero[1].energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    jugg2.energy -= (marine.attack * 2);
                    System.out.println("마린2이 공격했습니다. => 효과가 굉장했다!! 히드라 체력 : " + jugg2.energy);
                } else if (ran == 2) {
                    jugg2.energy -= marine.attack;
                    System.out.println("마린2이 공격했습니다. => 효과가 미미했다. 히드라 체력 : " + jugg2.energy);
                } else {
                    System.out.println("마린2이 공격했습니다. => 마린2의 공격이 빗맞았다. 히드라 체력 : " + jugg2.energy);
                }
            } else if (jugg2.energy > 0 && hero[2].energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    jugg2.energy -= (marine.attack * 2);
                    System.out.println("마린3이 공격했습니다. => 효과가 굉장했다!! 히드라 체력 : " + jugg2.energy);
                } else if (ran == 2) {
                    jugg2.energy -= marine.attack;
                    System.out.println("마린3이 공격했습니다. => 효과가 미미했다. 히드라 체력 : " + jugg2.energy);
                } else {
                    System.out.println("마린3이 공격했습니다. => 마린3의 공격이 빗맞았다. 히드라 체력 : " + jugg2.energy);
                }
            } else {
                System.out.println("저그가 이겼습니다.");
                break;
            }
            if (hero[0].energy > 0 && jugg1.energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    hero[0].energy -= (jugg1.attack * 2);
                    System.out.println("저글링이 공격했습니다. => 효과가 굉장했다!! 마린1 체력 : " + hero[0].energy);
                } else if (ran == 2) {
                    hero[0].energy -= jugg1.attack;
                    System.out.println("저글링이 공격했습니다. => 효과가 미미했다. 마린1 체력 : " + hero[0].energy);
                } else {
                    System.out.println("저글링이 공격했습니다. => 저글링의 공격이 빗맞았다. 마린1 체력 : " + hero[0].energy);
                }
            } else if (hero[0].energy > 0 && jugg2.energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    hero[0].energy -= (jugg2.attack * 2);
                    System.out.println("히드라가 공격했습니다. => 효과가 굉장했다!! 마린1 체력 : " + hero[0].energy);
                } else if (ran == 2) {
                    hero[0].energy -= jugg2.attack;
                    System.out.println("히드라가 공격했습니다. => 효과가 미미했다. 마린1 체력 : " + hero[0].energy);
                } else {
                    System.out.println("히드라가 공격했습니다. => 히드라의 공격이 빗맞았다. 마린1 체력 : " + hero[0].energy);
                }
            } else if (hero[1].energy > 0 && jugg1.energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    hero[1].energy -= (jugg1.attack * 2);
                    System.out.println("저글링이 공격했습니다. => 효과가 굉장했다!! 마린2 체력 : " + hero[1].energy);
                } else if (ran == 2) {
                    hero[1].energy -= jugg1.attack;
                    System.out.println("저글링이 공격했습니다. => 효과가 미미했다. 마린2 체력 : " + hero[1].energy);
                } else {
                    System.out.println("저글링이 공격했습니다. => 저글링의 공격이 빗맞았다. 마린2 체력 : " + hero[1].energy);
                }
            } else if (hero[1].energy > 0 && jugg2.energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    hero[1].energy -= (jugg2.attack * 2);
                    System.out.println("히드라가 공격했습니다. => 효과가 굉장했다!! 마린2 체력 : " + hero[1].energy);
                } else if (ran == 2) {
                    hero[1].energy -= jugg2.attack;
                    System.out.println("히드라가 공격했습니다. => 효과가 미미했다. 마린2 체력 : " + hero[1].energy);
                } else {
                    System.out.println("히드라가 공격했습니다. => 히드라의 공격이 빗맞았다. 마린2 체력 : " + hero[1].energy);
                }
            } else if (hero[2].energy > 0 && jugg1.energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    hero[2].energy -= (jugg1.attack * 2);
                    System.out.println("저글링이 공격했습니다. => 효과가 굉장했다!! 마린3 체력 : " + hero[2].energy);
                } else if (ran == 2) {
                    hero[2].energy -= jugg1.attack;
                    System.out.println("저글링이 공격했습니다. => 효과가 미미했다. 마린3 체력 : " + hero[2].energy);
                } else {
                    System.out.println("저글링이 공격했습니다. => 저글링의 공격이 빗맞았다. 마린3 체력 : " + hero[2].energy);
                }
            } else if (hero[2].energy > 0 && jugg2.energy > 0) {
                int ran = r.nextInt(3) + 1;
                if (ran == 1) {
                    hero[2].energy -= (jugg2.attack * 2);
                    System.out.println("히드라가 공격했습니다. => 효과가 굉장했다!! 마린3 체력 : " + hero[2].energy);
                } else if (ran == 2) {
                    hero[2].energy -= jugg2.attack;
                    System.out.println("히드라가 공격했습니다. => 효과가 미미했다. 마린3 체력 : " + hero[2].energy);
                } else {
                    System.out.println("히드라가 공격했습니다. => 히드라의 공격이 빗맞았다. 마린3 체력 : " + hero[2].energy);
                }
            } else {
                System.out.println("테란이 이겼습니다.");
                break;
            }
        }


    }
}
