package Day07;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    //1. 랜덤생성
    static void makeRandom(int[] com, Random r) {
        for (int i = 0; i < 3; i++) {
            com[i] = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    //2. 유저 입력
    static int[] inputUser(Scanner sc) {
        int[] user = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "자리 : ");
            user[i] = sc.nextInt();
            if (user[i] < 1 || user[i] > 9) {
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (user[i] == user[j]) {
                    i--;
                    break;
                }
            }
        }
        return user;
    }

    //3. StrikeBall 계산
    static int[] checkSB(int[] user, int[] com) {
        int[] result = new int[2];
        for (int i = 0; i < 3; i++) { // user
            for (int j = 0; j < 3; j++) { // com
                if (user[i] == com[j]) { //ball strike
                    if (i == j) {
                        result[0]++;
                    } else {
                        result[1]++;
                    }
                }
            }
        }
        return result;
    }

    //4. StrikeBall가지고 출력
    static boolean resultPrint(int[] result) {
        if (result[0] == 0 && result[1] == 0) {
            System.out.println("Out 입니다.");
            return true;
        } else if (result[0] == 3) {
            System.out.println("홈런입니다. 축하합니다.");
            return false;
        } else {
            System.out.println("Strike : " + result[0] + "," + "Ball : " + result[1]);
            return true;
        }
    }


    public static void main(String[] args) {
        //String str = new String();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] com = new int[3];
        makeRandom(com, r);//Call by Reference 리턴 X
        System.out.println(com[0] + "," + com[1] + "," + com[2]);
        boolean check = true;
        while (check) {
            int[] user = inputUser(sc);
            int[] result = checkSB(user, com);
            check = resultPrint(result);
        }
    }

}
