package PDF;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlingEnter {

    private Elements elements;

    public Elements getElements() {
        return elements;
    }

    CrawlingEnter () throws IOException {
        String url = "https://entertain.naver.com/home";
        Document document = Jsoup.connect(url).get();

        elements = document.select("div.rank_lst > ul > li");
        elements.select("span.blind").remove();
        //System.out.println(elements.text());

        for(Element e : elements){
            System.out.println(e.text());
            System.out.println(e.select("a").attr("href"));
        }
    }
}
