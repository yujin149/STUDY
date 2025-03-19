package Day03;

import java.util.Scanner;

public class Q2_test {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1. 원하는 구구단 출력");
            System.out.print("2. 전체 구구단 출력");
            System.out.println("3. 종료");
            System.out.print("메뉴(숫자) 선택 : ");
            int mNum = sc.nextInt();

            if (mNum == 1) {
                Scanner danNum = new Scanner(System.in);
                System.out.print("원하는 단 선택 : ");
                int dan = danNum.nextInt();
                if (dan < 2 || dan > 9) {
                    System.out.println("잘못된 입력입니다.");
                } else {
                    for (int i = 1; i < 10; i++) {
                        System.out.printf("%dX%d=%d", dan, i, dan * i);
                        System.out.println();
                    }
                }
            } else if (mNum == 2) {
                for (int i = 2; i < 10; i++) {
                    System.out.println(i + "단");
                    for (int j = 1; j < 10; j++) {
                        System.out.printf("%dX%d=%d", i, j, j * i);
                        System.out.println();
                    }
                    System.out.println();
                }

            } else if (mNum == 3) {
                System.out.println("프로그램이 종료됩니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
