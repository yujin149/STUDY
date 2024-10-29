package Day11;

import java.util.Random;
import java.util.Scanner;

class Participant {
    Random r = new Random();
    int mapia = r.nextInt(5) + 1;

    public boolean answer(int select) {
        if (select < 6 && select > 0) {
            if (select == mapia) {
                System.out.println("네 제가 마피아입니다.");
                return false;
            } else {
                System.out.println("억울합니다. 저는 마피아가 아닙니다.");
                return true;
            }
        } else {
            System.out.println("다시 입력해주세요.");
            return true;
        }

    }
}

class Police {
    int select() {
        Scanner sc = new Scanner(System.in);
        System.out.print("마피아는 : ");
        return sc.nextInt();
    }
}


public class Q3_1test {
    public static void main(String[] args) {
        Participant participant = new Participant();
        Police police = new Police();
        boolean check = true;
        while (check) {
            check = participant.answer(police.select());
        }
    }
}
