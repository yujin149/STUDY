package Practice_241025;

import java.util.Scanner;

/*
숫자를 하나 입력을 받습니다.
입력 받은 숫자의 약수를 출력하는 프로그램을 만들어주세요.

**출력 결과 예시)**
8의 약수는 1, 2, 4, 8입니다.
 */
public class Q5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            if (num > 1) {
                System.out.print(num + "의 약수는 ");
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        System.out.print(i + ",");
                    }
                }
                System.out.println(num + "입니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
