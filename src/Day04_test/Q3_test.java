package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q3_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int com1 = r.nextInt(9) + 1;
        int com2 = r.nextInt(9) + 1;
        int com3 = r.nextInt(9) + 1;

        while (true) {
            if (com1 == com2 || com2 == com3 || com1 == com3) {
                com1 = r.nextInt(9) + 1;
                com2 = r.nextInt(9) + 1;
                com3 = r.nextInt(9) + 1;
            } else {
                System.out.println("com : " + com1 + "," + com2 + "," + com3);
                break;
            }
        }

        while (true) {
            System.out.print("첫번째 숫자 : ");
            int user1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            int user2 = sc.nextInt();
            System.out.print("세번째 숫자 : ");
            int user3 = sc.nextInt();

            int strike = 0;
            int ball = 0;

            if (user1 != user2 && user2 != user3 && user1 != user3 &&
                    user1 > 0 && user1 < 10 && user2 > 0 && user2 < 10 && user3 > 0 && user3 < 10) {
                if (user1 == com1) {
                    strike++;
                }
                if (user2 == com2) {
                    strike++;
                }
                if (user3 == com3) {
                    strike++;
                }

                if (user1 == com2 || user1 == com3) {
                    ball++;
                }
                if (user2 == com1 || user2 == com3) {
                    ball++;
                }
                if (user3 == com1 || user3 == com2) {
                    ball++;
                }
                if (strike == 0 && ball == 0) {
                    System.out.println("out");
                } else if (strike == 3) {
                    System.out.println("홈런");
                    break;
                } else {
                    System.out.println("Strike : " + strike + ", Ball : " + ball);
                }
            } else {
                System.out.println("숫자가 중복이거나 잘못 입력되었습니다. 다시 입력해주세요.");
            }
        }

    }
}
