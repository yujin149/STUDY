package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q1_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int com = r.nextInt(100) + 1;
        //System.out.println("com : " + com);
        int cnt = 0;
        while (true) {
            System.out.print("숫자 입력 :");
            int user = sc.nextInt();

            if (user > 100 || user < 1) {
                System.out.println("잘못된 입력입니다.");
            } else {
                cnt++;
                if (com == user) {
                    System.out.println(cnt + "번째 만에 정답을 맞추셨습니다. 축하합니다.");
                    break;
                } else if (com > user) {
                    System.out.println("업");
                } else {
                    System.out.println("다운");
                }
            }
        }

    }
}
