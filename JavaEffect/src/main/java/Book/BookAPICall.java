package Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BookAPICall {
    public static StringBuilder apiCall(String input) throws IOException {
        String apiUrl = "https://dapi.kakao.com/v3/search/book?query=";
        String encode = URLEncoder.encode(input,"UTF-8");
        apiUrl += encode;
        //URL 객체 생성
        URL url = new URL(apiUrl);
        // 변수 HttpURLConnection con 객체를 받는다.
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");//GET 방식 (Get, Post, Put, Delete, Patch)
        // 접근 권한 확인 "Authorization" : "KakaoAK 1879f921e1ec192b0dbccb7ece8724db"
        con.setRequestProperty("Authorization","KakaoAK "+"1879f921e1ec192b0dbccb7ece8724db");
        //con.getInputStream() -> InputStreamReader -> BufferedReader
        BufferedReader in =new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while((inputLine = in.readLine()) != null){
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        System.out.println(content.toString());//출력
        return content;
    }
}
