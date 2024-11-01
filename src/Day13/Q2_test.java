package Day13;

import java.util.Scanner;

class Control {
    int num1;
    int num2;
    double num3;
    double num4;

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int sub(int num1, int num2) {
        return num1 - num2;
    }

    int mul(int num1, int num2) {
        return num1 * num2;
    }

    int div(int num1, int num2) {
        return num1 / num2;
    }

    ///////////////////////////////////

    double add(double num3, double num4) {
        return num3 + num4;
    }

    double sub(double num3, double num4) {
        return num3 - num4;
    }

    double mul(double num3, double num4) {
        return num3 * num4;
    }

    double div(double num3, double num4) {
        return num3 / num4;
    }

    void inputNum(int[] number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        number[0] = sc.nextInt();
        System.out.print("숫자 2 : ");
        number[1] = sc.nextInt();
    }

    void inputDouble(double[] number2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        number2[0] = sc.nextDouble();
        System.out.print("숫자 2 : ");
        number2[1] = sc.nextDouble();
    }


    void print() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.정수연산  2.실수연산  3.종료");
            System.out.print("번호 선택 : ");
            int num1 = sc.nextInt();
            if (num1 > 0 && num1 < 4) {
                if (num1 == 1) {
                    System.out.println("1.더하기  2.빼기  3.곱하기  4.나누기");
                    System.out.print("번호 선택 : ");
                    int num2 = sc.nextInt();

                    int[] number = new int[2];
                    inputNum(number);

                    if (num2 == 1) {
                        System.out.println(number[0] + " + " + number[1] + " = " + add(number[0], number[1]));
                    } else if (num2 == 2) {
                        System.out.println(number[0] + " - " + number[1] + " = " + sub(number[0], number[1]));
                    } else if (num2 == 3) {
                        System.out.println(number[0] + " * " + number[1] + " = " + mul(number[0], number[1]));
                    } else {
                        System.out.println(number[0] + " / " + number[1] + " = " + div(number[0], number[1]));
                    }

                } else if (num1 == 2) {
                    System.out.println("1.더하기  2.빼기  3.곱하기  4.나누기");
                    System.out.print("번호 선택 : ");
                    int num2 = sc.nextInt();

                    double[] number2 = new double[2];
                    inputDouble(number2);
                    if (num2 == 1) {
                        System.out.println(number2[0] + " + " + number2[1] + " = " + add(number2[0], number2[1]));
                    } else if (num2 == 2) {
                        System.out.println(number2[0] + " - " + number2[1] + " = " + sub(number2[0], number2[1]));
                    } else if (num2 == 3) {
                        System.out.println(number2[0] + " * " + number2[1] + " = " + mul(number2[0], number2[1]));
                    } else {
                        System.out.println(number2[0] + " / " + number2[1] + " = " + div(number2[0], number2[1]));
                    }
                } else {
                    System.out.println("프로그램 종료");
                    break;
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }

    }

}

public class Q2 {
    public static void main(String[] args) {
        Control control = new Control();
        control.print();
    }
}
