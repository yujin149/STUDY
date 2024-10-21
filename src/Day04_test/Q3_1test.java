package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q3_1test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] com = new int[3];

        for (int i = 0; i < 3; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(com[0] + "," + com[1] + "," + com[2]);

        while (true) {
            int[] user = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print(i + 1 + "번째 숫자 입력 : ");
                user[i] = sc.nextInt();
                if (user[i] < 1 || user[i] > 9) {
                    i--;
                    continue;
                }
                for (int j = 0; j < i; j++) {
                    if (user[i] == user[j]) {
                        i--;
                        break;
                    }
                }
            }

            int strike = 0;
            int ball = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (user[i] == com[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            if (strike == 3) {
                System.out.println("홈런");
            } else if (strike == 0 && ball == 0) {
                System.out.println("out");
            } else {
                System.out.println(strike + "strike " + ball + "ball");
            }
        }
    }
}
