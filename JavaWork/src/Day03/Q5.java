package Day03;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        //2. 출력
        while (true) {
            System.out.println("1.직사각형");
            System.out.println("2.정직사각형");
            System.out.println("3.역직사각형");
            System.out.println("4.피라미드");
            System.out.println("5.다이아몬드");
            System.out.println("6.종료");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.print("숫자 입력 :");
                int count = sc.nextInt();
            } else if (num == 2) {

            } else if (num == 3) {

            } else if (num == 4) {

            } else if (num == 5) {

            } else if (num == 6) {

            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
        //3. 정료
    }
}
