package Day10;

import java.util.Random;

class Dice {
    String name;
    int score;

    Dice(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }


    public void roll() {
        Random random = new Random();
        int rollSum = random.nextInt(6) + 1;
        setScore(getScore() + rollSum);
        System.out.println(name + "의 점수 : " + rollSum + ", 누적 점수 : " + getScore());
    }
}


public class Q2_test {
    public static void main(String[] args) {

        Dice dice1 = new Dice("파란 주사위");
        Dice dice2 = new Dice("빨간 주사위");


        while (dice1.score < 50 && dice2.score < 50) {
            dice1.roll();
            dice2.roll();
        }
        if (dice1.score > dice2.score) {
            System.out.println("파란 주사위의 누적 숫자가 50이상입니다.");
        }
        if (dice2.score > dice1.score) {
            System.out.println("빨간 주사위의 누적 숫자가 50이상입니다.");
        }
    }
}

