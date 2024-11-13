package API;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class JSoupExample1 {
    public static void main(String[] args) throws IOException {
        String url = "https://lifequotes.co.kr/";
        Document document = Jsoup.connect(url).get();//get() 예외처리이기때문에 throws를 넣어야함.
        Elements elements = document.getElementsByClass("slide-entry-title entry-title ");
        //Elements 전체 요소 (h3의 같은 클래스를 다 가져오게 된다.)

        System.out.println(elements.text());//리턴 타입은 String
        ArrayList<String> goodTexts = new ArrayList<>();

        System.out.println("===== 한개씩 가져옴 ================================");
        //한개씩 출력
        for(Element e : elements){
            goodTexts.add(e.text());
        }

        for(int i = 0; i<goodTexts.size(); i++){
            System.out.println(goodTexts.get(i));
        }







    }
}
