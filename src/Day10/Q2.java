package Day10;

import java.util.Random;

class Dice1 {
    String color;

    Dice1(String color) {
        this.color = color;
    }

    int trrowDice() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

}

public class Q2 {
    public static void main(String[] args) {
        //1. 주사위 2개 만들기
        Dice1 red = new Dice1("빨간색");
        Dice1 blue = new Dice1("파란색");
        //2. 주사위 카운트 할 변수 턴변수
        int redResult = 0;
        int blueResult = 0;
        int turn = 1;

        while (redResult < 50 && blueResult < 50) {
            System.out.println("==========" + (turn++) + "============");
            redResult += red.trrowDice();
            blueResult += blue.trrowDice();

            System.out.println(red.color + "주사위 : " + redResult);
            System.out.println(blue.color + "주사위 : " + blueResult);
        }

        if (redResult > blueResult) {
            System.out.println(red.color + "주사위 승리");
        } else if (redResult == blueResult) {
            System.out.println("무승부");
        } else {
            System.out.println(blue.color + "주사위 승리");
        }
    }
}
