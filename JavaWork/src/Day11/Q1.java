package Day11;


import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        int com = r.nextInt(31) + 1;

        System.out.println("컴퓨터 숫자 : " + com);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자 입력 : ");
            int user = sc.nextInt();

            if (user <= 31 && user >= 1) {
                if (com == user) {
                    System.out.println("정답입니다.");
                    break;
                } else if (com > user) {
                    System.out.println("업");
                } else {
                    System.out.println("다운");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }


    }
}
