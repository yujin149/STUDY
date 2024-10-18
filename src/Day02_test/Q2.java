package Day02_test;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt();
        System.out.print("온도 입력 : ");
        int temp = sc.nextInt();

        if (temp < -15 || temp > 37) {
            System.out.println("잘못된 입력입니다.");
        } else {
            if (month >= 3 && month <= 5 && temp >= 3 && temp <= 15) {
                System.out.println("계절은 봄입니다. 온도는" + temp + "도 입니다.");
            } else if (month >= 6 && month <= 8 && temp >= 18 && temp <= 37) {
                System.out.println("계절은 여름입니다. 온도는" + temp + "도 입니다.");
            } else if (month >= 9 && month <= 11 && temp >= 3 && temp <= 15) {
                System.out.println("계절은 가을입니다. 온도는" + temp + "도 입니다.");
            } else if ((month == 12 || month == 1 || month == 2) && temp >= -15 && temp <= 2) {
                System.out.println("계절은 겨울입니다. 온도는" + temp + "도 입니다.");
            } else {
                System.out.println("계절과 온도가 맞지 않습니다.");
            }
        }
    }
}
