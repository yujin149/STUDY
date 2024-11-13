package Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Q_BookTest2 {
    public static void main(String[] args) throws IOException {
        String apiUrl = "https://dapi.kakao.com/v3/search/book?query=";
        String encode = URLEncoder.encode("자바", "UTF-8");
        apiUrl += encode;

        // URL 객체 생성
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

        // Gson을 사용해 JSON 문자열을 JsonObject로 변환
        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(response.toString(), JsonObject.class);

        // documents 배열에서 첫 번째 도서 정보 가져오기
        JsonArray documents = jsonResponse.getAsJsonArray("documents");
        if (documents.size() > 0) {
            JsonObject book = documents.get(0).getAsJsonObject();

            // 필요한 필드 가져오기
            String title = book.get("title").getAsString();
            String publisher = book.get("publisher").getAsString();
            int salePrice = book.get("sale_price").getAsInt();
            JsonArray authorsArray = book.getAsJsonArray("authors");

            // authors 배열을 문자열로 변환
            StringBuilder authors = new StringBuilder();
            for (JsonElement author : authorsArray) {
                if (authors.length() > 0) {
                    authors.append(", ");
                }
                authors.append(author.getAsString());
            }

            // 결과 출력
            System.out.println("Title: " + title);
            System.out.println("Authors: " + authors.toString());
            System.out.println("Publisher: " + publisher);
            System.out.println("Sale Price: " + salePrice);
        } else {
            System.out.println("책 없음");
        }
    }
}
