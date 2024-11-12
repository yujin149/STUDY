package Day04_test;

import java.util.Random;
import java.util.Scanner;

class ComRandom {
    Random r = new Random();
    int[] num = new int[3];

    ComRandom() {
        while (true) {
            for (int i = 0; i < num.length; i++) {
                num[i] = r.nextInt(9) + 1;
            }
            if (num[0] != num[1] && num[1] != num[2] && num[0] != num[2]) {
                break;
            }
        }
    }

    void print() {
        for (int i = 0; i < 3; i++) {
            System.out.print(num[i] + " ");
        }
    }

    int[] getComNum() {
        return num;
    }
}

class UserRandom {
    Scanner sc = new Scanner(System.in);
    int[] input = new int[3];

    UserRandom() {
        for (int i = 0; i < input.length; i++) {
            System.out.print((i + 1) + "번째 숫자 입력 : ");
            input[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (input[i] == input[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    int[] getInput() {
        return input;
    }
}

class Juge {
    ComRandom com;
    UserRandom user;

    Juge() {
        com = new ComRandom();
        com.print();
        System.out.println();

        int[] comNum = com.getComNum();

        int strike;
        int ball;

        while (true) {
            user = new UserRandom();
            int[] userNum = user.getInput();


            if (userNum[0] > 0 && userNum[0] < 10 && userNum[1] > 0 && userNum[1] < 10 && userNum[2] > 0 && userNum[2] < 10 &&
                    userNum[0] != userNum[1] && userNum[1] != userNum[2] && userNum[0] != userNum[2]) {
                strike = 0;
                ball = 0;
                if (userNum[0] == comNum[0]) {
                    strike++;
                }
                if (userNum[1] == comNum[1]) {
                    strike++;
                }
                if (userNum[2] == comNum[2]) {
                    strike++;
                }

                if (userNum[0] == comNum[1] || userNum[0] == comNum[2]) {
                    ball++;
                }
                if (userNum[1] == comNum[0] || userNum[1] == comNum[2]) {
                    ball++;
                }
                if (userNum[2] == comNum[1] || userNum[2] == comNum[0]) {
                    ball++;
                }

                if (strike == 0 && ball == 0) {
                    System.out.println("Out입니다.");

                } else if (strike == 3) {
                    System.out.println("홈런입니다.");
                    break;

                } else {
                    System.out.println("Strike : " + strike + ", Ball : " + ball);

                }
            } else {
                System.out.println("잘못된 입력입니다.");

            }
        }
    }

}


public class Q3_3 {
    public static void main(String[] args) {
        new Juge();
    }
}
