package Day02;

import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 입력 :");
        String operator = sc.next();

        if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")){
            System.out.println("잘못된 연산자입니다.");
        }else{
            if(operator.equals("+")){
                int add = num1 + num2;
                System.out.println(add);
            }else if(operator.equals("-")){
                int sub = num1 - num2;
                System.out.println(sub);
            }else if(operator.equals("*")){
                int mul = num1 * num2;
                System.out.println(mul);
            }else{
                int div = num1 / num2; //몫
                double rem = num1 % num2; //나머지
                System.out.printf("결과 값 : %.1f입니다.",(double)num1/num2);
            }
        }
    }
}
