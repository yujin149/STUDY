package Excel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Q2_test {
    public static void main(String[] args) throws IOException {
        try{
        String url = "https://novel.naver.com/webnovel/weekday";
        Document document = Jsoup.connect(url).get();

        Elements rank = document.select("#integrationRaking .ranking .rank");
        Elements novelTitle = document.select("#integrationRaking .ranking_list .title_group .title");
        Elements novelWriter = document.select("#integrationRaking .ranking_list .author");
        Elements novelTag = document.select("#integrationRaking .ranking_list .genre");


        int count = Math.min(rank.size(), Math.min(novelTitle.size(), Math.min(novelWriter.size(), novelTag.size())));

            for (int i = 0; i < count; i++) {
                System.out.print(rank.get(i).text() + "위 ");
                System.out.println(novelTitle.get(i).text());
                System.out.print(novelWriter.get(i).text() + " | ");
                System.out.println(novelTag.get(i).text());
                System.out.println("============================");
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
