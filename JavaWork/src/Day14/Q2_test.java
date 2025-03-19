package Day14;


import java.util.Random;

class Shark {
    Feed f;
    String name;

    Shark() {

    }

    void eatPrint() {
        Shark[] s = new Shark[5];
        for (int i = 0; i < s.length; i++) {
            Random r = new Random();
            int eat = r.nextInt(7) + 8;
            System.out.println((i + 1) + " 상어는 " + eat + "마리 만큼 잡아먹었습니다.");
        }
    }
}

class Feed {
    Feed() {
        Feed[] f = new Feed[100];
        for (int i = 0; i < f.length; i++) {
            f[i] = new Feed();
            if (f[i] != null) {
                for (int j = i; j < f.length; j++) {
                    f[j] = null;
                }
            }
        }
    }
}

public class Q2_test {
    public static void main(String[] args) {
        Shark[] s = new Shark[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Shark();
            s[i].eatPrint();
        }

    }
}
