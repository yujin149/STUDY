package Day04_test;

import java.util.Random;
import java.util.Scanner;

public class Q3_1test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] com = new int[3];
        for (int i = 0; i < 3; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(com[0] + "," + com[1] + "," + com[2]);

        
    }
}
