package Day05_test;

import java.util.Scanner;

class Input {
    int[] num = new int[2];

    Input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "번째 숫자 입력 : ");
            num[i] = sc.nextInt();
        }
    }
}

class Gcd {
    int gcd = 0;

    Gcd(Input input) {
        for (int i = 1; i < input.num[0] || i < input.num[1]; i++) {
            if (input.num[0] % i == 0 && input.num[1] % i == 0) {
                gcd = i;
            }
        }
    }
}

class Lcm {
    int lcm;

    Lcm(Input input, Gcd gcd) {
        lcm = (input.num[0] * input.num[1]) / gcd.gcd;
    }
}

public class Q5_2 {
    public static void main(String[] args) {
        Input input = new Input();
        Gcd gcd = new Gcd(input);
        Lcm lcm = new Lcm(input, gcd);
        System.out.println("최대공약수 : " + gcd.gcd + ", 최소공배수 : " + lcm.lcm);
    }
}
