package Day01_test;

import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자는 : ");
        int num1 = sc.nextInt();

        System.out.print("이름은 : ");
        String str1 = sc.next();

        System.out.print("파이는 : ");
        float flo1 = sc.nextFloat();

        System.out.println(num1);
        System.out.println(str1);
        System.out.println(flo1);

    }
}
