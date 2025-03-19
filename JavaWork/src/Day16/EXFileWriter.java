package Day16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EXFileWriter {
    public static void main(String[] args) throws IOException {
        //Scanner 객체를 생성 하고 변수 이름은 sc입니다.
        Scanner sc = new Scanner(System.in);
        //문자열 변수 source 선언 후 문자열 데이터 대입
        String source = "비어 있어야 비로서 가득해지는 사랑\n" + "영원히 사랑하는 것은\n" +
                "평온한 마음으로 아침을 맞는다는 것입니다.\n";
        //char 배열 input 변수 선언 후 char 배열 객체를 source변수의 길이 만큼 생성
        char input[] = new char[source.length()];
        //source getChars 메소드 실행
        //매개변수 소스시작인덱스, 길이, 데이터, 목적지시작인덱스
        source.getChars(0, source.length(), input, 0);
        System.out.println("파일명을 입력하세요.");//출력
        String s = sc.next(); //String s에 입력 문자열 대입
        //FileWriter fw 변수 선언 후 FileWriter 객체 생성
        //객체 생성시 입력 받은 문자열 s 변수 매개변수에 대입
        FileWriter fw = new FileWriter(s);
        //input 데이터를 파일로 쓰는 동작을 하는  writer 메소드
        fw.write(input);
        //파일에 다쓰고 나면  close 메소드를 호출해서 FileWriter 객체를 종료 시킴
        fw.close();
        System.out.println(s + "파일이 생성되었습니다.");//출력
    }
}
