package Day02_test;

import java.util.Scanner;

/*
- 0~12세: "어린이"
- 13~19세: "청소년"
- 20~64세: "성인"
- 65세 이상: "노인"

**유효성 검사**: 나이가 음수인 경우 "잘못된 입력입니다."라고 출력합니다.
*/
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이(숫자만) 입력 : ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("잘못된 입력입니다.");
        } else if (age >= 0 && age <= 12) {
            System.out.println("어린이");
        } else if (age >= 13 && age <= 19) {
            System.out.println("청소년");
        } else if (age >= 20 && age <= 64) {
            System.out.println("성인");
        } else {
            System.out.println("노인");
        }
    }
}
