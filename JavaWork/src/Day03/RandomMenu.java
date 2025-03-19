package Day03;

import java.util.Random;

public class RandomMenu {
    public static void main(String[] args) {

        Random r = new Random();
        int menu = r.nextInt(4) + 1;

        if (menu == 1) {
            System.out.println("오늘 저녁은 엽떡+치킨입니다.");
        } else if (menu == 2) {
            System.out.println("오늘 저녁은 초밥입니다.");
        } else if (menu == 3) {
            System.out.println("오늘 저녁은 엽떡+짜장면입니다.");
        } else {
            System.out.println("오늘 저녁은 금식입니다.");
        }
    }
}
