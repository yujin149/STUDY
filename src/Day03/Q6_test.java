package Day03;

import java.util.Random;
import java.util.Scanner;

public class Q6_test {
    public static void main(String[] args) {
        Random r = new Random();
        int com = r.nextInt(3) + 1;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.게임시작 2.종료");
            System.out.print("숫자 입력 : ");
            int start = sc.nextInt();
            if (start == 1) {
                System.out.println("1.가위, 2.바위, 3.보");
                System.out.print("숫자 입력 : ");
                int user = sc.nextInt();

                int result = com - user;
                switch (result) {
                    case 0:
                        System.out.println("무승부입니다.");
                        break;
                    case -2:
                    case 1:
                        System.out.println("사용자가 이겼습니다.");
                        break;
                    default:
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                }

            } else if (start == 2) {
                System.out.println("종료되었습니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
