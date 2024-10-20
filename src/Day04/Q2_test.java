package Day04;

import java.util.Random;

public class Q2_test {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(9) + 1;
        int num2 = r.nextInt(9) + 1;
        int num3 = r.nextInt(9) + 1;

        System.out.print(num1 + ",");
        while (true) {
            if (num2 == num1) {
                num2 = r.nextInt(9) + 1;
            } else {
                System.out.print(num2 + ",");
                break;
            }
        }
        while (true) {
            if (num3 == num2 || num3 == num1) {
                num3 = r.nextInt(9) + 1;
            } else {
                System.out.print(num3);
                break;
            }
        }
    }
}
