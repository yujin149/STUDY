package Day11;

import java.util.Scanner;

public class Q2_t {
    /*
    1. 입력
    2. 연산 => main 1122335*#66
    2-1. 카운팅
    2-2. 입력한 문자 + 카운팅 => 문자 선택
    3. 출력(문자 + 문자열)
     */

    //1. 입력
    static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        return sc.next();
    }

    //2. 연산
    // 2-1 카운팅
    static String makeResult(String str) {
        char ch = str.charAt(0); // '1'
        int count = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            } else {
                //2일때
                result += makeChar(ch, count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        //마지막 꺼는 비교를 할 수 없기때문에, 입력받지 못함.
        result += makeChar(ch, count);
        return result;

    }

    static char makeChar(char ch, int count) {
        char result;
        char[][] key = {
                {'A', 'B', 'C'}, //1
                {'D', 'E', 'F'}, //2
                {'G', 'H', 'I'}, //3
                {'J', 'K', 'L'}, //4
                {'M', 'N', 'O'}, //5
                {'P', 'Q', 'R'}, //6
                {'S', 'T', 'U'}, //7
                {'V', 'W', 'X'},// 8
                {'Y'}, //9
                {'*'},
                {'Z'}, //0
                {'#'}

        };
        if (ch == '9') {
            result = key[8][0];
        } else if (ch == '*') {
            result = key[9][0];
        } else if (ch == '0') {
            result = key[10][0];
        } else if (ch == '#') {
            result = key[11][0];
        } else {
            // 1 -> 2 % 3 =>2
            count = (count - 1) % 3;//index가 0부터 있기 때문에
            result = key[(ch - '0') - 1][count];
            //문자를 숫자로 하는 법 (ch - '0') - 1
            // '1' - '0' => 1
        }
        return result;
    }

    static void ouput(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
//        String str = input();
//        String result = makeResult(str);
//        ouput(result);

        ouput(makeResult(input()));
    }
}
