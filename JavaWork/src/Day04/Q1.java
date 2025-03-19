package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int com = r.nextInt(100) + 1;

        while (true) {
            System.out.print("숫자 입력 : ");
            int userNum = sc.nextInt();
            if (userNum > 100 || userNum < 0) {
                System.out.println("0~100이하의 숫자를 입력해주세요.");
            } else {
                if (userNum > com) {
                    System.out.println("다운");
                } else if (userNum < com) {
                    System.out.println("업");
                } else {
                    System.out.printf("정답은 %d입니다. 맞췄습니다. 축하합니다.", com);
                    break;
                }

            }
        }
    }
}
