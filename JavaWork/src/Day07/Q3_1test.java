package Day07;

import java.util.Random;

public class Q3_1test {
    Random r = new Random();
    static char[] charRandom = new char[10];

    static int aRandom() {
        //문자 A(65)에서 랜덤 0~25 추출 (주고 안받고)
        Random r = new Random();
        int numRandom = r.nextInt(25) + 65;
        return numRandom;
    }


}
