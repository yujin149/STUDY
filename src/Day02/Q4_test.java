package Day02;

import java.util.Scanner;

/*
 * 숫자를 하나 입력을 받습니다.
 * 입력받은 숫자의 약수를 출력하는 프로그램을 만들어주세요.
 * 8의 약수 1,2,4,8
 * */
public class Q4_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받은 숫자 : ");
        int num = sc.nextInt();

        System.out.print(num + "의 약수는 1,");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i);
                System.out.print(",");
            }
        }
        System.out.print(num + "입니다.");
    }
}
