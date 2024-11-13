package PDF;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Q_crawlingEnter {
    public static void main(String[] args) throws IOException {
        String url = "https://entertain.naver.com/home";
        Document document = Jsoup.connect(url).get();

        int count = 0;
        Elements elements = document.select(".rank_lst a");
        for(Element e : elements){
            count++;
            System.out.println("랭킹 : "+ count);
            System.out.println("제목 : " + e.ownText()); //ownText()는 <a> 요소의 텍스트 중 <em>을 포함한 자식 요소의 텍스트는 제외하고 직접적인 텍스트만 반환합니다.
            System.out.println("링크 : " + e.absUrl("href"));
        }
    }
}
