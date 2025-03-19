package Day04;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        while (true) {
            num1 = r.nextInt(9) + 1;
            num2 = r.nextInt(9) + 1;
            num3 = r.nextInt(9) + 1;
            if (num1 != num2 && num2 != num3 && num1 != num3) {
                break;
            }
        }
        System.out.println(num1 + "," + num2 + "," + num3);
    }
}
