package API;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Q1_test {
    public static void main(String[] args) throws IOException {
        String url = "https://sports.news.naver.com/index.nhn";
        Document document = Jsoup.connect(url).get();
        Elements newsTit = document.select(".main_wrap .today_section .link_today .title");
        //Elements elements = document.getElementsByClass("text_area > title");

        //System.out.println(newsTit.text());
        ArrayList<String> sportsTit = new ArrayList<>();

        for(Element e : newsTit){
            sportsTit.add(e.text());
        }

        for(int i = 0; i < sportsTit.size(); i++){
            System.out.println(sportsTit.get(i));
        }


    }
}
