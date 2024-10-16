package Day02_test;

import java.util.Scanner;

/*
문제 설명: 사용자가 성별(남/여)과 나이를 입력합니다.
18세 미만: 무료
18세 이상 60세 미만: 10,000원
60세 이상: 5,000원
유효성 검사: 성별은 "남" 또는 "여"여야 하며, 나이는 0 이상이어야 합니다.
*/
public class Q5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성별 입력 : ");
        String sex = sc.next();

        System.out.print("나이 입력 : ");
        int age = sc.nextInt();

        if (!(sex.equals("여") || sex.equals("남")) || age < 0) {
            System.out.println("잘못된 입력입니다.");
        } else {
            if (age < 18) {
                System.out.printf("%s자입니다. 나이는 %d입니다. 무료로 입장가능합니다.", sex, age);
            } else if (age < 60) {
                System.out.printf("%s자입니다. 나이는 %d입니다. 입장료는 10,000원입니다.", sex, age);
            } else {
                System.out.printf("%s자입니다. 나이는 %d입니다. 입장료는 5,000원입니다.", sex, age);
            }
        }
    }
}
