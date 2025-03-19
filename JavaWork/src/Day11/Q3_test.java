package Day11;
/*
    시민 4명 / 마피아 1명 / 경찰 1명
 */

import java.util.Random;
import java.util.Scanner;

public class Q3_test {
    static int police() {
        Scanner sc = new Scanner(System.in);
        System.out.print("마피아를 선택해주세요.");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Random r = new Random();
        int mapia = r.nextInt(5) + 1;
        System.out.println(mapia);

        while (true) {
            int select = police();
            if (select < 6 && select > 0) {
                if (select == mapia) {
                    System.out.println("네 제가 마피아입니다.");
                    break;
                } else {
                    System.out.println("억울합니다. 저는 마피아가 아닙니다.");
                }
            } else {
                System.out.println("다시 입력해주세요.");
            }
        }

    }
}
