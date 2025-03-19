package Day07_test;

import java.util.Scanner;

public class Q1 {
    //입력 함수 (주고 안받고)
    static int inputStart() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.사각형 넓이\t2.삼각형 넓이\t3.종료\t :");
        return sc.nextInt();
    }

    //가로 세로 입력 함수 ( 주고 안받고)
    static int[] inputNum() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        System.out.print("가로 : ");
        num[0] = sc.nextInt();
        System.out.print("세로 : ");
        num[1] = sc.nextInt();

        return num;
    }

    //사각형 넓이 함수 (주고 받고)
    static int qua(int[] num) {
        return num[0] * num[1];
    }

    // 삼각형 넓이 함수 ( 안주고 받고)
    static void tri(int[] num) {
        System.out.printf("삼각형 넓이는 %.1f입니다.", (double) (num[0] + num[1]) / 2.0);
        System.out.println();
    }


    public static void main(String[] args) {
        while (true) {
            int inputStart = inputStart();
            if (inputStart == 1) {
                int[] inputNum = inputNum();
                System.out.printf("사각형 넓이는 %d입니다.", qua(inputNum));
                System.out.println();
            } else if (inputStart == 2) {
                int[] inputNum = inputNum();
                tri(inputNum);
            } else if (inputStart == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
