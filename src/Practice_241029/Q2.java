package Practice_241029;

/*
    빨간 주사위(1~6), 파란 주사위(1~6) 중에 누적 숫자가 50이 되는 주사위를 출력
    랜덤으로 나오는 값을 계속 더한다.
    두 주사위 중에 먼저 50이상이 되는 주사위를 출력

 */

import java.util.Random;

class Dice {
    String color;

    Dice(String color) {
        this.color = color;
    }

    int roll() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Dice dice1 = new Dice("빨간 주사위");
        Dice dice2 = new Dice("파란 주사위");

        int redSum = 0;
        int blueSum = 0;
        int turn = 1;

        while (true) {
            if (redSum < 50 && blueSum < 50) {
                System.out.println("========== 주사위 " + (turn++) + " ==========");
                redSum += dice1.roll();
                blueSum += dice2.roll();
                System.out.println(dice1.color + " 누적 점수 : " + redSum + ", " + dice2.color + " 누적 점수 : " + blueSum);
            } else {
                break;

            }
        }
        System.out.println("==============================");
        if (redSum > blueSum) {
            System.out.println(dice1.color + "WIN, 누적 숫자 : " + redSum);
        }
        if (blueSum > redSum) {
            System.out.println(dice2.color + "WIN, 누적 숫자 : " + blueSum);
        }

    }

}
