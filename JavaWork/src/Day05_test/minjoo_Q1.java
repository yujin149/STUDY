package Day05_test;

import java.util.Scanner;

abstract class Input1 {
    int num1;
    int num2;

    Input1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract void print();
}

class Sum extends Input1 {
    Sum(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    void print() {
        System.out.println("더하기 연산 : " + (num1 + num2));
    }
}

class Minus extends Input1 {
    Minus(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    void print() {
        System.out.println("빼기 연산 : " + (num1 - num2));
    }
}

public class minjoo_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        Sum sum = new Sum(num1, num2);
        Minus minus = new Minus(num1, num2);

        sum.print();
        minus.print();

    }
}