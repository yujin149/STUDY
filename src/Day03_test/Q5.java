package Day03_test;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.직사각형 2.정직삼각형 3.역직삼각형 4.피라미드 5.다이아몬드 6.종료");
            System.out.print("숫자 입력 : ");
            int menu = sc.nextInt();

            if (menu == 1) {

            } else if (menu == 2) {

            } else if (menu == 3) {

            } else if (menu == 4) {

            } else if (menu == 5) {

                for (int i = 0; i < 3; i++) {
                    for (int j = 2; j <= 0; j--) {
                        if (j > i) {
                            System.out.println(" ");
                        } else {
                            System.out.println("*");
                        }
                    }
                }


            } else if (menu == 6) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
