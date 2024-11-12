package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        int com1 = r.nextInt(9) + 1;
        int com2 = r.nextInt(9) + 1;
        int com3 = r.nextInt(9) + 1;

        while (true) {
            if (com1 == com2) {
                com2 = r.nextInt(9) + 1;
            }
            if (com1 == com3 || com2 == com3) {
                com3 = r.nextInt(9) + 1;
            } else {
                System.out.println(com1 + ", " + com2 + ", " + com3);
                break;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 자리 : ");
        int user1 = sc.nextInt();
        System.out.print("두번째 자리 : ");
        int user2 = sc.nextInt();
        System.out.print("세번째 자리 : ");
        int user3 = sc.nextInt();
        while (true) {
            if (user1 > 0 && user1 < 10 && user2 > 0 && user2 < 10 && user3 > 0 && user3 < 10) {
                if (user2 == user1) {
                    System.out.println("동일한 숫자를 입력하셨습니다.");
                    System.out.print("두번째 자리 : ");
                    user2 = sc.nextInt();
                } else if (user3 == user1 || user3 == user2) {
                    System.out.println("동일한 숫자를 입력하셨습니다.");
                    System.out.print("세번째 자리 : ");
                    user3 = sc.nextInt();
                } else {
                    break;
                }

            } else {
                System.out.println("잘못된 입력입니다.");
                System.out.print("첫번째 자리 : ");
                user1 = sc.nextInt();
                System.out.print("두번째 자리 : ");
                user2 = sc.nextInt();
                System.out.print("세번째 자리 : ");
                user3 = sc.nextInt();
            }
        }
        int strike = 0;
        int ball = 0;


        if (user1 == com1 || user1 == com2 || user1 == com3) {
            if (user1 == com1) {
                strike++;
            } else {
                ball++;
            }
        }
        if (user2 == com1 || user2 == com2 || user2 == com3) {
            if (user2 == com2) {
                strike++;
            } else {
                ball++;
            }
        }
        if (user3 == com1 || user3 == com2 || user3 == com3) {
            if (user3 == com3) {
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


        System.out.print("입니다.");


    }
}
