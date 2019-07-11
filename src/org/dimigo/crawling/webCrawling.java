package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class webCrawling {
    public static void main(String[] args) {
        try {  //네이버 웹툰
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn")
                    .get();
           // System.out.println(doc.html());
            Elements result = doc.select("[id=realTimeRankFavorite] li a");
            List<String> list = result.eachText();
            for(String title : list){
                System.out.println(title);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
