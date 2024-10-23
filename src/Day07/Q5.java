package Day07;

import java.util.Random;

/*
1. 랜덤 생성
2. 유저 입력
3. Strike Ball 계산
4. Strike Ball 가지고 출력
 */

public class Q5 {
    //1. 랜덤생성
    static void makeRandom(int[] com, Random r) {
        for (int i = 0; i < 3; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
    }
}
