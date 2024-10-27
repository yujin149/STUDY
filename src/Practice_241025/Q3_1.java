package Practice_241025;

import java.util.Scanner;

/*
월을 입력 받고 온도를 입력받습니다.
3~5월 / 3~15도 봄입니다.
6~8월 / 18~37도 여름입니다.
9~11월 / 3~15도 가을입니다.
12~2월 / 2 ~ -15도  겨울입니다.
(단, 온도 입력한 값을 같이 출력을 합니다. 그리고 온도가 각 계절 별 날씨와 맞지 않으면 "계절과 온도가 맞지 않습니다."를 출력해주세요.)
 */
public class Q3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt();
        System.out.print("온도 입력 : ");
        int temp = sc.nextInt();

        if (temp > -16 && temp < 38) {
            if (month >= 3 && month <= 5 && temp >= 3 && temp <= 15) {
                System.out.println("계절은 봄입니다. 온도는 " + temp + "도 입니다.");
            } else if (month >= 6 && month <= 8 && temp >= 18 && temp <= 37) {
                System.out.println("계절은 여름입니다. 온도는 " + temp + "도 입니다.");
            } else if (month >= 9 && month <= 11 && temp >= 3 && temp <= 15) {
                System.out.println("계절은 가을입니다. 온도는 " + temp + "도 입니다.");
            } else if ((month == 12 || month == 1 || month == 2) && temp >= -15 && temp <= 2) {
                System.out.println("계절은 겨울입니다. 온도는 " + temp + "도 입니다.");
            } else {
                System.out.println("계절과 온도가 맞지 않습니다.");
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }

    }
}
