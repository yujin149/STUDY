package Day06;

import java.util.Scanner;

/*
1. 입력 (주고 안받고)
2. 약수 구하기 (주고 받고)
3. 출력 (안주고 받고)
 */
public class Q4_test {

    //입력
    static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");

        return sc.nextInt();
    }

/*
    //약수구하기
    static int result(int num) {

        //int[] arr = new int[cnt];
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + ",");
            }

        }


        System.out.print(num + " 입니다.");
        System.out.println();

        return num;

    }
*/

    // 약수 구하기
    static int[] result(int num) {
        int[] arr = new int[num]; // 최대 num개의 약수를 담을 배열
        //int count = 0; // 실제 약수 개수

        for (int i = 1; i <= num; i++) { // num도 포함
            if (num % i == 0) {
                //arr[count] = i; // 약수 저장
                //count++; // 개수 증가
                arrPrint(i);
            }
        }
        return arr;

    }

    static void arrPrint(int print) {
        System.out.print(print + " ");
    }


    public static void main(String[] args) {
        result(input());
    }

}
