package Day06;

import java.util.Scanner;

public class Q2_test {
    //    Scanner sc = new Scanner(System.in);
    //    static int num1 = sc.nextInt();
    //    static String op = sc.next();
    //    static int num2 = sc.nextInt();

    //1.주고 받고
    static String sum(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    //3. 안주고 받고
    static void minus(int num1, int num2) {
        System.out.println(num1 + "+" + num2 + "=" + (num1 - num2));
    }

    //2.주고 안받고
    /*static int mul() {
        int a = num1;
        int b = num2;
        return = a + "*" + a + "=" + a*b;
    }
*/
    //4.안주고 안받고
    /*
    static void div() {

        System.out.printf("%d / %d = %.1f", num1, num2, num1/num2);
    }
    */
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자 1 : ");
            int num1 = sc.nextInt();
            System.out.print("연산자 입력 : ");
            String op = sc.next();
            System.out.print("숫자 2 : ");
            int num2 = sc.nextInt();


            if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                System.out.println("잘못된 연산자입니다.");
            } else {
                if (op.equals("+")) {
                    System.out.println(sum(num1, num2));
                    break;
                } else if (op.equals("-")) {
                    minus(num1, num2);
                    break;
                } else if (op.equals("*")) {
                    //System.out.println(mul());
                    break;
                } else {
                    // div();
                    break;
                }
            }
        }

    }
}
