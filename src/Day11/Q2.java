package Day11;

import java.util.Scanner;

class NumPrint {
    String[] num1 = {"A", "B", "C"};
    String[] num2 = {"D", "E", "F"};
    String[] num3 = {"G", "H", "I"};
    String[] num4 = {"J", "K", "L"};
    String[] num5 = {"M", "N", "O"};
    String[] num6 = {"P", "Q", "R"};
    String[] num7 = {"S", "T", "U"};
    String[] num8 = {"V", "W", "X"};
    String num9 = "Y";
    String num0 = "Z";
    String numStr = "*";
    String numShap = "#";

    void print(char num, int count) {
        if (num == '9' || num == '0' || num == '*' || num == '#') {

        } else {
            if (count > 2) {
                count = 0;
            } else {
                count++;
            }
        }

    }

}

public class Q2 {

    public static void main(String[] args) {

        NumPrint np = new NumPrint();

        Scanner sc = new Scanner(System.in);
        System.out.print("번호 입력 : ");
        String input = sc.next();

        int count = 0;

        for (int i = 1; i > input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                np.print(input.charAt(i), count++);
            }
        }



        /*
        int count = 0;
        while (true) {
            System.out.print("번호 입력 : ");
            char inputChar = sc.next().charAt(0);
            String[] num = {"A", "B", "C"};
            if (inputChar == '1') {
                if (count > 2) {
                    count = 0;
                    System.out.print(num[count]);
                } else {
                    System.out.print(num[count++]);
                }
                System.out.println();
            } else {
                System.out.print(num[count]);
                break;
            }
        }
        */




    /*
        String str = "hello";
        System.out.println(str.charAt(0) + "");
        System.out.println(str.charAt(1));
        System.out.println(str.length());
    */
    }
}
