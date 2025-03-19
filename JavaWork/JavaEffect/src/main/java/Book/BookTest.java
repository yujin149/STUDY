package Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BookTest {
    public static void main(String[] args) throws IOException {
        String apiUrl = "https://dapi.kakao.com/v3/search/book?query=";
        String enconde = URLEncoder.encode("자바","UTF-8");
        apiUrl += enconde;

        //URL 객체 생성
        URL url = new URL(apiUrl);
        //변수 HttpURLConnection con 객체를 받는다.
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET"); //GET 방식(Get, Post, Put, Delete, Patch)
        //접근 권한 확인 "Authorization : "KakaoAK f39d78349657ef560e80adddffab6bd0"
        con.setRequestProperty("Authorization", "KakaoAK "+"f39d78349657ef560e80adddffab6bd0"); //f39d78349657ef560e80adddffab6bd0 는 REST API KEY

        //con.getInputStream() -> InputStreamReader -> BufferedReader
        BufferedReader in=new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while((inputLine = in.readLine()) != null ){
            System.out.println(inputLine);
        }

    }

}

