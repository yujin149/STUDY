package Day07;
/*
1. 사각형 삼각형 종료 그 이외
2. 사각형, 삼각형 입력 시 => 가로 세로 입력
   사각형 가로*세로 / 삼각형 가로*세로/2
3. 종료 시 프로그램 종료
4. 1~3아니면 잘못된 입력 출력
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num == 1 || num == 2) {
                System.out.print("1. 가로 : ");
                int w = sc.nextInt();
                System.out.print("2. 세로 : ");
                int h = sc.nextInt();

                if (num == 1) {
                    System.out.println("사각형 넓이는 : " + w * h);
                } else {
                    System.out.println("삼각형 넓이는 : " + w * h / 2);
                }

            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
