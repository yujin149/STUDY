package Day16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EXFiileWriter2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명을 입력해주세요 : ");
        String s = sc.next();
        File file = new File(s); // 문자열(파일명) 파일 객체 생성

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true)); //true 이어쓰기 false 덮어쓰기
        bufferedWriter.write("안녕하세요.");
        bufferedWriter.newLine();
        bufferedWriter.write("잘가세요.");


        bufferedWriter.flush(); //실제로 파일에 쓰게 됩니다. //flush 이전은 준비단계, flush를 써야 글자가 들어갑니다.
        bufferedWriter.close();

    }
}
