package Book;

import java.io.IOException;
import java.util.Scanner;

public class BookMain {
    //1.입력을 받아서 무슨 책을 검색하는지 설정
    //2. 카카오에서 보낸 데이터를 파싱을 해서 Book으로 바꿔준다.
    //3. Book을 ArrayList<Book>에 담아준다.
    //4. ArrayList<Book>을 -> PDF로 만들어 준다.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("책 : ");
            String input = sc.next();
            if(input.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
           // JsonMake.stringtoJson(BookAPICall.apiCall(input));
            MakePDF.makePDF(JsonMake.stringtoJson(BookAPICall.apiCall(input)),input);
        }

    }
}
