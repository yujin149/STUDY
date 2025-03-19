package Day14;

class Dinosaur {
    int height;
    int weight;

    void shout() {
        System.out.println("나는 공룡이다!!");
    }

}

class Dino1 extends Dinosaur {

    Dino1() {
        height = 2;
        weight = 1;
    }

    void shout() {
        System.out.println("나는 키 " + height + "m 몸무게 " + weight + "톤인 " + "티라노사우르스다.");
    }
}

class Dino2 extends Dinosaur {

    Dino2() {
        height = 3;
        weight = 2;
    }

    void shout() {
        System.out.println("나는 키 " + height + "m 몸무게 " + weight + "톤인 " + "티리케라톱스다");
    }
}

class Dino3 extends Dinosaur {

    Dino3() {
        height = 5;
        weight = 3;
    }

    void shout() {
        System.out.println("나는 키 " + height + "m 몸무게 " + weight + "톤인 " + "부경사우르스다.");
    }
}

public class Q1_test {
    static void dinoSoul(Dinosaur d) {
        d.shout();
    }

    public static void main(String[] args) {
        /*
        Dinosaur dino1 = new Dino1();
        Dinosaur dino2 = new Dino2();
        Dinosaur dino3 = new Dino3();

        dino1.shout("티라노사우르스");
        dino2.shout("티리케라톱스");
        dino3.shout("부경사우르스");
        */

        Dino1 dino1 = new Dino1();
        Dino2 dino2 = new Dino2();
        Dino3 dino3 = new Dino3();

        dinoSoul(dino1);
        dinoSoul(dino2);
        dinoSoul(dino3);
    }
}
