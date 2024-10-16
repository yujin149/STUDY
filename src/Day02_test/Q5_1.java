package Day02_test;

import java.util.Scanner;

/*
2. 체온 상태 판단 프로그램
문제 설명: 사용자가 체온(섭씨)을 입력합니다.
37.5도 이상: "발열"
36.1도 ~ 37.4도: "정상"
36.0도 이하: "저체온"
유효성 검사: 체온이 비정상적인 값일 경우 "잘못된 입력입니다."라고 출력합니다.
*/
public class Q5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("체온 :");
        double temp = sc.nextDouble();


        if (temp > 40 || temp < 35) {
            System.out.println("잘못된 입력입니다.");
        } else {
            if (temp >= 37.5) {
                System.out.printf("%.1f도 입니다. 발열입니다.", temp);
            } else if (temp >= 36.1) {
                System.out.printf("%.1f도 입니다. 정상입니다.", temp);
            } else if (temp <= 36.0) {
                System.out.printf("%.1f도 입니다. 저체온입니다.", temp);
            }
        }
    }
}
