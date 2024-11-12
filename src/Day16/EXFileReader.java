package Day16;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EXFileReader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽어 들일 파일명을 입력하세요 : ");
        String s = sc.next();
        //FileReader 객체 생성과 동시에 입력한 문자열 생성자 매개변수에 대입
        FileReader fr = new FileReader(s);
        int i;
        //fr.read() => 정수 값
        //정수값을 i에 대입을 하고
        //i가 -1이 아닌 경우에는 계속 반복을 합니다.
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);

        }
        fr.close();
    }
}
