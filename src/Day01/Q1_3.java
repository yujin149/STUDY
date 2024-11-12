package Day01;

import java.util.Scanner;

class Input2 {
    int[] num = new int[2];

    Input2() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + "번째 숫자 : ");
            num[i] = sc.nextInt();
        }
    }

    int[] getNum() {
        return num;
    }
}

class Sum {
    Sum(int[] num) {
        System.out.println("더하기 : " + (num[0] + num[1]));
    }
}

class Minus {
    Minus(int[] num) {
        System.out.println("빼기 : " + (num[0] - num[1]));
    }
}

public class Q1_3 {
    public static void main(String[] args) {
        Input2 input = new Input2();
        new Sum(input.getNum());
        new Minus(input.getNum());

    }
}
