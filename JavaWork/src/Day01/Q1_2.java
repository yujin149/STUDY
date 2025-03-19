package Day01;

import java.util.Scanner;

class Input {
    int[] num = new int[2];

    Input() {
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

class Print {
    Print(int[] num) {
        System.out.println("더하기 : " + (num[0] + num[1]));
        System.out.println("빼기 : " + (num[0] - num[1]));
    }
}

public class Q1_2 {
    public static void main(String[] args) {
        Input input = new Input();
        new Print(input.getNum());

    }
}
