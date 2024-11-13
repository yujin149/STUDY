import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import com.google.gson.Gson;

class BookResponse {
    List<Book> documents;
}

class Book {
    String title;
    String publisher;
    int sale_price;
    List<String> authors;
}

public class Q_BookTest3 {
    public static void main(String[] args) throws IOException {
        String apiUrl = "https://dapi.kakao.com/v3/search/book?query=";
        String encode = URLEncoder.encode("자바", "UTF-8");
        apiUrl += encode;

        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Authorization", "KakaoAK " + "f39d78349657ef560e80adddffab6bd0");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // JSON 문자열을 BookResponse 객체로 변환
        Gson gson = new Gson();
        BookResponse jsonResponse = gson.fromJson(response.toString(), BookResponse.class);

        // documents 배열에서 첫 번째 도서 정보 가져오기
        if (!jsonResponse.documents.isEmpty()) {
            Book book = jsonResponse.documents.get(0);

            // 결과 출력
            System.out.println("Title: " + book.title);
            System.out.println("Authors: " + String.join(", ", book.authors));
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Sale Price: " + book.sale_price);
        } else {
            System.out.println("책 없음");
        }
    }
}
