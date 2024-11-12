package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q3_A {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        while (true) {
            num1 = r.nextInt(9) + 1;
            num2 = r.nextInt(9) + 1;
            num3 = r.nextInt(9) + 1;
            if (num1 != num2 && num2 != num3 && num1 != num3) {
                break;
            }
        }
        System.out.println(num1 + "," + num2 + "," + num3);

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

                if (user1 == num1) {
                    strike++;
                }
                if (user2 == num2) {
                    strike++;
                }
                if (user3 == num3) {
                    strike++;
                }

                if (user1 == num2 || user1 == num3) {
                    ball++;
                }
                if (user2 == num1 || user2 == num3) {
                    ball++;
                }
                if (user3 == num2 || user3 == num1) {
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


        ///////////////////////////////////////////////////////////
/*
        int a = r.nextInt(9)+1;
        int b = r.nextInt(9)+1;
        int c = r.nextInt(9)+1;

        while(a == b || b == c || a == c){
            a = r.nextInt(9)+1;
            b = r.nextInt(9)+1;
            c = r.nextInt(9)+1;
        }
        System.out.println(a+","+b+","+c);
*/
    }
}
