package Practice_241030;

import java.util.Random;

class Human {
    String name;
    int line;
    int position;

    Human(String name, int line) {
        this.name = name;
        this.line = line;
        this.position = 0;
    }

    boolean goinghuman(int not) {
        Random r = new Random();
        int move = r.nextInt(10) + 1;

        if (not == this.line) {
            System.out.println("Emergency!!! " + name + "의 손에 든 햄버거를 선생님이 먹었다!!!!!");
            return false;
        } else {
            position += move;
            System.out.println(name + " " + move + "개 쌓기 성공!! 현재 햄버거탑 : " + position + "층");
            return position >= 100;
        }
    }

}

public class yung_ {
    public static void main(String[] args) {
        Random r = new Random();

        Human hu1 = new Human("권윤경", 1);
        Human hu2 = new Human("송유진", 2);
        Human hu3 = new Human("김민주", 3);
        Human hu4 = new Human("안재원", 4);

        int cnt = 1;

        while (hu1.position < 100 && hu2.position < 100 && hu3.position < 100 && hu4.position < 100) {
            int not = r.nextInt(4) + 1;
            System.out.println("현재 경기 라운드 : " + cnt + "라운드");
            hu1.goinghuman(not);
            hu2.goinghuman(not);
            hu3.goinghuman(not);
            hu4.goinghuman(not);
            cnt++;
            System.out.println("=========================");
        }

        if (hu1.position > hu2.position && hu1.position > hu3.position && hu1.position > hu4.position) {
            System.out.println(hu1.name + "의 승리!!! 이제 쌓은 버거를 맛있게 먹어보자!!");
        }
        if (hu2.position > hu1.position && hu2.position > hu3.position && hu2.position > hu4.position) {
            System.out.println(hu1.name + "의 승리!!! 이제 쌓은 버거를 맛있게 먹어보자!!");
        }
        if (hu3.position > hu1.position && hu3.position > hu2.position && hu3.position > hu4.position) {
            System.out.println(hu1.name + "의 승리!!! 이제 쌓은 버거를 맛있게 먹어보자!!");
        }
        if (hu4.position > hu2.position && hu4.position > hu1.position && hu4.position > hu3.position) {
            System.out.println(hu1.name + "의 승리!!! 이제 쌓은 버거를 맛있게 먹어보자!!");
        }
    }
}