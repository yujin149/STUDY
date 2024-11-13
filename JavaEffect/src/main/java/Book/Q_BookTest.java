package Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Q_BookTest {
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

        // JsonObject 출력
        System.out.println(jsonResponse);
    }
}
