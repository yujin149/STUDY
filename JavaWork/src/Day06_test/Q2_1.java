package Day06_test;

import java.util.Scanner;

class InputNum {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[2];

    InputNum() {
        for (int i = 0; i < 2; i++) {
            System.out.print("숫자 " + (i + 1) + "번째 입력 :");
            num[i] = sc.nextInt();
        }
    }

    public int[] getNumbers() {
        return num;
    }

}

class Op {
    InputNum inputNum;

    Op() {
        this.inputNum = new InputNum();
    }

    double calculate() {
        return 0;
    }

}

class Sum extends Op {


    double calculate() {
        int[] numbers = inputNum.getNumbers();
        return numbers[0] + numbers[1];
    }


}

class Sub extends Op {


    double calculate() {
        int[] numbers = inputNum.getNumbers();
        return numbers[0] - numbers[1];
    }

}

class Mul extends Op {


    double calculate() {
        int[] numbers = inputNum.getNumbers();
        return numbers[0] * numbers[1];
    }
}

class Div extends Op {

    double calculate() {
        int[] numbers = inputNum.getNumbers();
        return (double) numbers[0] / numbers[1];
    }
}


public class Q2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 입력 : ");
        String operator = sc.next();

        Op operation;

        while (true) {
            if (operator.equals("+")) {
                operation = new Sum();
                System.out.println("결과 : " + (int) operation.calculate());
                break;
            } else if (operator.equals("-")) {
                operation = new Sub();
                System.out.println("결과 : " + (int) operation.calculate());
                break;
            } else if (operator.equals("*")) {
                operation = new Mul();
                System.out.println("결과 : " + (int) operation.calculate());
                break;
            } else if (operator.equals("/")) {
                operation = new Div();
                System.out.printf("결과 : %.1f", operation.calculate());
                break;
            } else {
                System.out.println("잘못된 연산자입니다.");
                System.out.print("연산자 입력 : ");
                operator = sc.next();
            }
        }


    }
}
