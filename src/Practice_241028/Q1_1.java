package Practice_241028;

import java.util.Random;

class Player {
    int lane; //레인
    String country; //나라
    int move; //이동

    Player(int l, String c) {
        lane = l;
        country = c;
    }

    void run(int num) {
        Random r = new Random();
        if (lane != num) {
            move += r.nextInt(10) + 1;
        } else {
            System.out.println(country + " 선수 돌발상황 발생!!");
        }

    }

}


public class Q1_1 {
    public static void main(String[] args) {
        Random r = new Random();
        Player kor = new Player(1, "한국");
        Player cha = new Player(2, "중국");
        Player usa = new Player(3, "미국");
        Player rus = new Player(4, "러시아");

        int turn = 1;

        while (kor.move < 100 && cha.move < 100 && usa.move < 100 && rus.move < 100) {
            System.out.println("============ " + (turn++) + "턴 ============");
            int warning = r.nextInt(4) + 1;
            kor.run(warning);
            cha.run(warning);
            usa.run(warning);
            rus.run(warning);

            System.out.println(kor.lane + ". " + kor.country + " 선수 전진거리 : " + kor.move + "M");
            System.out.println(cha.lane + ". " + cha.country + " 선수 전진거리 : " + cha.move + "M");
            System.out.println(usa.lane + ". " + usa.country + " 선수 전진거리 : " + usa.move + "M");
            System.out.println(rus.lane + ". " + rus.country + " 선수 전진거리 : " + rus.move + "M");
        }

        if (kor.move > cha.move && kor.move > usa.move && kor.move > rus.move) {
            System.out.println("우승은 한국 선수입니다.");
        }
        if (cha.move > kor.move && cha.move > usa.move && cha.move > rus.move) {
            System.out.println("우승은 중국 선수입니다.");
        }
        if (usa.move > cha.move && usa.move > kor.move && usa.move > rus.move) {
            System.out.println("우승은 미국 선수입니다.");
        }
        if (rus.move > cha.move && rus.move > usa.move && rus.move > kor.move) {
            System.out.println("우승은 러시아 선수입니다.");
        }
    }
}
