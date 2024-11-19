package Day06_test;

import java.util.Scanner;

class InputNum1 {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[2];

    InputNum1() {
        for (int i = 0; i < 2; i++) {
            System.out.print("숫자 " + (i + 1) + "번째 입력 :");
            num[i] = sc.nextInt();
        }
    }

    public int[] getNum() {
        return num; // 숫자 받기
    }
}

abstract class Op1 {
    InputNum1 inputNum;

    Op1() {
        this.inputNum = new InputNum1();
    }

    abstract double calculate();
}

class Sum1 extends Op1 {
    double calculate() {
        int[] numbers = inputNum.getNum();
        return numbers[0] + numbers[1];
    }
}

class Sub1 extends Op1 {
    double calculate() {
        int[] numbers = inputNum.getNum();
        return numbers[0] - numbers[1];
    }
}

class Mul1 extends Op1 {
    double calculate() {
        int[] numbers = inputNum.getNum();
        return numbers[0] * numbers[1];
    }
}

class Div1 extends Op1 {
    double calculate() {
        int[] numbers = inputNum.getNum();
        return (double) numbers[0] / numbers[1]; //소숫점 첫째자리까지 나오기
    }
}

public class Q2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 입력 : ");
        String operator = sc.next();


        while (true) {
            if (operator.equals("+")) {
                Sum1 sum = new Sum1();
                System.out.println((int) sum.calculate());//정수
                break;
            } else if (operator.equals("-")) {
                Sub1 sub = new Sub1();
                System.out.println((int) sub.calculate());//정수
                break;
            } else if (operator.equals("*")) {
                Mul1 mul = new Mul1();
                System.out.println((int) mul.calculate()); //정수
                break;
            } else if (operator.equals("/")) {
                Div1 div = new Div1();
                System.out.printf("%.1f", div.calculate());//소숫점 첫째자리까지
                break;
            } else {
                System.out.println("잘못된 연산자입니다.");
                System.out.print("연산자 입력 : ");
                operator = sc.next();
            }
        }
    }
}

