package Day02;

import java.util.Scanner;

/*
 * 1. 숫자 입력
 * 2. 약수 출력
 * 약수는 1이 무조건 약수가 됩니다.
 * */
public class Q4 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        // 8의 약수는
        // 1,2,4,
        // 8입니다.

        System.out.print(num + "의 약수는");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.print(num + "입니다.");
    }


}

