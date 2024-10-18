package Day03;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print((char) (r.nextInt(26) + 65));
        }
    }
}
