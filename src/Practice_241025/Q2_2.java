package Practice_241025;

import java.util.Scanner;

public class Q2_2 {
    static void input(Scanner sc, String[] inputInfo) {
        System.out.print("Id 입력 : ");
        inputInfo[0] = sc.next();
        System.out.print("패스워드 입력 : ");
        inputInfo[1] = sc.next();
    }

    static void loginPrint(String[] inputInfo) {
        if (inputInfo[0].equals("Korea") && inputInfo[1].equals("1234")) {
            System.out.println("환영합니다. " + inputInfo[0] + "님");
        } else if (inputInfo[0].equals("Korea") && !inputInfo[1].equals("1234")) {
            System.out.println("패스워드가 올바르지 않습니다.");
        } else if (!inputInfo[0].equals("Korea") && inputInfo[1].equals("1234")) {
            System.out.println("id가 올바르지 않습니다.");
        } else {
            System.out.println("id와 패스워드가 올바르지 않습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputInfo = new String[2];
        input(sc, inputInfo);
        loginPrint(inputInfo);


    }
}
