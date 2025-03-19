package Day03;

import java.util.Scanner;

/*

 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        String jjak = "";
        String hol = "";

        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                jjak = jjak + i + " ";
            } else {
                hol = hol + i + " ";
            }
        }
        System.out.println("짝수 : " + jjak);
        System.out.println("홀수 : " + hol);
    }
}
