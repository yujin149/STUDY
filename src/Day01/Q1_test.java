package Day01;

import java.util.Scanner;

public class Q1_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력한 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("입력한 숫자 : ");
        int num2 = sc.nextInt();

        System.out.println(num1 - num2);
        System.out.println(num1 + num2);
    }
}
