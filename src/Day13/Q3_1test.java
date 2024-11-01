package Day13;

import java.util.Random;

class PocketMon {
    String type;
    String color;
    String size;

    PocketMon(String type, String color, String size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    void print() {
        System.out.println(" 포켓몬 : " + type + ", 색상 : " + color + ", 크기 : " + size);
    }
}

class Ball {
    PocketMon[][] pocketMons;
    Random random = new Random();

    void ball() {
        pocketMons = new PocketMon[3][4];
        String[] type = {"피카츄", "파이리", "꼬부기", "이상해씨"};
        String[] color = {"노란색", "빨간색", "파란색", "초록색"};
        String[] size = {"대", "중", "소", "미니"};

        for (int i = 0; i < pocketMons.length; i++) {
            for (int j = 0; j < pocketMons[i].length; j++) {
                String types = type[random.nextInt(type.length)];
                String colors = color[random.nextInt(color.length)];
                String sizes = size[random.nextInt(size.length)];

                pocketMons[i][j] = new PocketMon(types, colors, sizes);
            }
        }
    }
}

class Dr5 {
    Ball ball;

}

class Jiwoo {
    PocketMon pocketMon;
    Ball ball;

    void selectBall() {
        ball.ball();

    }
}


public class Q3_1test {
}
