package Day07;

import java.util.Scanner;

/*
1. 입력 (주고 안받고)
2. 약수 구하기 (주고 받고)
3. 출력 (안주고 받고)
 */
public class Q1 {

    //1. 입력 (주고 안받고)
    static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");

        return sc.nextInt();
    }

    //2. 약수 구하기 (주고 받고)
    static String yaksuMake(int num) {
        String result = "";
        for (int i = 1; i < num; i++) { // num도 포함
            if (num % i == 0) {
                result = result + i + ",";
            }
        }
        return result;
    }

    //3. 출력 (안주고 받고)
    static void printYaksu(int num, String result) {
        System.out.print(num + "의 약수는");
        System.out.print(result);
        System.out.print(num + "입니다.");
    }

    public static void main(String[] args) {
        int num = input();
        //String result = yaksuMake(num);
        printYaksu(num, yaksuMake(num));
    }
}
