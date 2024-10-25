package Day09;

import java.util.Random;

class PlayerList1 {
    String player;
    String country;
    int totalMove = 0;

    PlayerList1(String p, String c) {
        player = p;
        country = c;
    }

    void moveDis(Random r) {
        totalMove += r.nextInt(10) + 1;
    }

    void print() {
        
    }
}


public class Q2_3test {
    Random r = new Random();
}
