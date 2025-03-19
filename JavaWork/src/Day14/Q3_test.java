package Day14;

import java.util.Random;

class Monkey {
    String[] color;
    Box box;

    Monkey() {
        String[] color = {"빨간", "노랑", "파란", "초록", "검정"};
        this.color = color;
    }

    void talk() {
        for (int i = 0; i < color.length; i++) {
            /*if () {
                System.out.println(color[i] + "원숭이가 물건을 가지고 있습니다.");
            } else {
                System.out.println(color[i] + "원숭이가 물건을 가지고 있지 않습니다.");
            }*/
        }
    }

}

class Box {
}

public class Q3_test {
    public static void main(String[] args) {
        Monkey[] monkey = new Monkey[5];
        Box box = new Box();
        Random r = new Random();
        int ran = r.nextInt(2);

        if (ran == 0) {
            for (int i = 0; i < monkey.length; i++) {
                if (monkey != null) {

                }
            }
        }

    }
}
