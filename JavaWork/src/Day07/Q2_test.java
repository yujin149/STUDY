package Day07;

import java.util.Scanner;

public class Q2_test {
    static int qua(int num1, int num2) {
        //1. 사각형 넓이 구하는 함수 (주고 받고)
        int quaSize = num1 * num2;
        return quaSize;
    }

    static double tri(int num1, int num2) {
        //2. 삼각형 넓이 구하는 함수 (안주고 받고)
        double triSize = num1 * num2 * 0.5;
        return triSize;
    }

    static int inputPrintX() {
        //3. 입력 함수 (주고 안받고)
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 : ");
        int num1 = sc.nextInt();

        return num1;
    }

    static int inputPrintY() {
        //3. 입력 함수 (주고 안받고)
        Scanner sc = new Scanner(System.in);
        System.out.print("세로 : ");
        int num2 = sc.nextInt();

        return num2;
    }

    static int inputPrintNum() {
        //3. 입력 함수 (주고 안받고)
        Scanner sc = new Scanner(System.in);
        System.out.println("1.사각형 넓이\t2.삼각형 넓이\t3.종료");
        System.out.print("번호 입력 : ");
        int num = sc.nextInt();
        
        return num;
    }

    public static void main(String[] args) {
        while (true) {
            int num = inputPrintNum();
            if (num == 1) {
                int result1 = qua(inputPrintX(), inputPrintY());
                System.out.println("사각형 넓이는 : " + result1);
                break;

            } else if (num == 2) {
                double result2 = tri(inputPrintX(), inputPrintY());
                System.out.println("삼각형 넓이는 : " + result2);
                break;

            } else if (num == 3) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
