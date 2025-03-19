package API;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSoupExample2 {
    public static void main(String[] args) throws IOException {
        String url = "https://sports.news.naver.com/index.nhn";
        Document document = Jsoup.connect(url).get();

        Elements elements = document.select("div > strong.title");

        for(Element e : elements){
            System.out.println(e.text());
        }

    }
}
