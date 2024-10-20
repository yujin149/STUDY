package Day04;

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
        System.out.println("com의 값 : " + com[0] + "," + com[1] + "," + com[2]);

        while (true) {
            System.out.print("첫번째 숫자 : ");
            int user1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            int user2 = sc.nextInt();
            System.out.print("세번째 숫자 : ");
            int user3 = sc.nextInt();

            if (user1 > 0 && user1 < 10 && user2 > 0 && user2 < 10 && user3 > 0 && user3 < 10 &&
                    user1 != user2 && user2 != user3 && user1 != user3) {
                int strike = 0;
                int ball = 0;

                if (user1 == com[0]) {
                    strike++;
                }
                if (user2 == com[1]) {
                    strike++;
                }
                if (user3 == com[2]) {
                    strike++;
                }

                if (user1 == com[1] || user1 == com[2]) {
                    ball++;
                }
                if (user2 == com[1] || user2 == com[2]) {
                    ball++;
                }
                if (user3 == com[1] || user3 == com[0]) {
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
