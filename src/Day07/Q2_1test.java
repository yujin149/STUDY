package Day07;

import java.util.Scanner;

public class Q2_1test {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.사각형 넓이\t2.삼각형 넓이\t3.종료");
            System.out.print("번호 입력 : ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("사각형 넓이는 : ");
                break;

            } else if (num == 2) {
                System.out.println("삼각형 넓이는 : ");
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
