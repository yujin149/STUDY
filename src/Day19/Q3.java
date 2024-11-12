package Day19;

import java.util.Random;

class Present {
}

class TreasurBox {

    Present[] p = new Present[100];

    TreasurBox() {
        Random r = new Random();
        int num = r.nextInt(100); //0~99
        p[num] = new Present();// 난수 값 인덱스 한 곳만 객체가 있습니다.
        System.out.println("보물의 위치는 : " + num);
    }

    //선물을 주는 기능 -> 메소드는 1 쓰레만 들어가서 가지고 갈 수 있도록 만듭니다.
    synchronized Present sendPresent(int index) {
        return p[index];
    }
}

class Joiner extends Thread {
    static int index = 0;
    TreasurBox t;

    Present p = null;

    Joiner(TreasurBox t, String s) {
        this.t = t;
        setName(s); //쓰레드 이름 세팅
    }

    @Override
    public void run() {
        while (true) {
            p = t.sendPresent(index++); // 5
            System.out.println((index - 1) + getName() + "보물 확인"); // 6 -> X 5
            if (p != null) {
                System.out.println("보물이 있습니다.");
            } else {
                System.out.println("보물이 없습니다.");
            }
            if (index > 99 || p != null) {
                break;
            }
        }
    }
}

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        TreasurBox t = new TreasurBox();
        Joiner j1 = new Joiner(t, "홍길동");
        Joiner j2 = new Joiner(t, "호랑이");
        Joiner j3 = new Joiner(t, "강아지");

        j1.start();
        j2.start();
        j3.start();

        j1.join();
        j2.join();
        j3.join();

        if (j1.p != null) {
            System.out.println(j1.getName() + "최종 보물을 찾았습니다.");
        }
        if (j2.p != null) {
            System.out.println(j2.getName() + "최종 보물을 찾았습니다.");
        }
        if (j3.p != null) {
            System.out.println(j3.getName() + "최종 보물을 찾았습니다.");
        }
    }
}
