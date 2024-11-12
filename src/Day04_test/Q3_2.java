package Day04_test;

import java.util.Random;
import java.util.Scanner;

class Computer {
    int[] num = new int[3];

    Computer() {
        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            int random = r.nextInt(9) + 1;
            num[i] = random;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    void print() {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }


    int[] getNum() {
        return num;
    }

}


class UserInput {
    int[] input = new int[3];

    UserInput() {
        Scanner sc = new Scanner(System.in);
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

    /*
        void print() {
            for (int i = 0; i < input.length; i++) {
                System.out.print(input[i] + " ");
            }
        }
    */
    int[] getInput() {
        return input;
    }
}

class Judgment {
    Computer com;
    UserInput user;

    Judgment() {
        com = new Computer();
        com.print();
        user = new UserInput();
        int[] comNum = com.getNum();
        int[] userNum = user.getInput();

        int strike = 0;
        int ball = 0;

        if (userNum[0] == comNum[0] || userNum[0] == comNum[1] || userNum[0] == comNum[2]) {
            if (userNum[0] == comNum[0]) {
                strike++;
            } else {
                ball++;
            }
        }
        if (userNum[1] == comNum[0] || userNum[1] == comNum[1] || userNum[1] == comNum[2]) {
            if (userNum[1] == comNum[1]) {
                strike++;
            } else {
                ball++;
            }
        }
        if (userNum[2] == comNum[0] || userNum[2] == comNum[1] || userNum[2] == comNum[2]) {
            if (userNum[2] == comNum[2]) {
                strike++;
            } else {
                ball++;
            }
        }

        if (strike == 3) {
            System.out.print("홈런");
        }
        if (strike == 2) {
            System.out.print("2 Strike ");
        }
        if (strike == 1) {
            System.out.print("1 Strike ");
        }
        if (ball == 3) {
            System.out.print("3 ball ");
        }
        if (ball == 2) {
            System.out.print("2 ball ");
        }
        if (ball == 1) {
            System.out.print("1 ball ");
        }
        if (strike == 0 && ball == 0) {
            System.out.print("OUT ");
        }

        System.out.println("입니다.");
    }
}


public class Q3_2 {
    public static void main(String[] args) {
        new Judgment();

    }
}
