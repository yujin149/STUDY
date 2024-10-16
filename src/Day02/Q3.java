package Day02;

import java.util.Scanner;

/*
* 숫자 2개 입력 연산자 1개입력
* 분기에 기준 => 연산자(기호문자열)
* 나눗셈 수숫점 첫자리까지 출력
* 연산자 기호가 이상할 경우 잘못된 입력으로 종료한다.
*
* */
public class Q3 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 입력 :");
        String op = sc.next();
        //2.출력
        switch(op){
            case "+":
                System.out.printf("결과 값 : %d입니다.", num1+num2);
                break;
            case "-":
                System.out.printf("결과 값 : %d입니다.", num1-num2);
                break;
            case "*":
                System.out.printf("결과 값 : %d입니다.", num1*num2);
                break;
            case "/":
                System.out.printf("결과 값 : %.1f입니다.", (double)num1/num2);
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;

        }
    }
}
