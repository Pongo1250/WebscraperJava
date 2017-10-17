import java.io.IOException;

import org.jsoup.Jsoup;
import org. jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper{

	public static void main(String[] args){

	try{
		System.out.println("creating connection");
		Document billboardScrape = Jsoup.connect("http://www.billboard.com/charts/hot-100").userAgent("Mozilla/5.0").get();
		System.out.println("extracting data");
	Elements songNames = billboardScrape.select("div.chart-row__title");
	//Elements artistNames = billboardScrape.select("div.chart-row__artist");
	int i =0;

	for(Element songList:songNames){
		i++;
		String song = songList.getElementsByTag("h2").first().text();
		//String artist = artistNames..getElementsContainingText().first().text();
		System.out.println(i + " " + song);
		//artistNames.remove().first();
	}
}
catch (IOException e){
	System.out.println(e.getCause().getMessage() + "hello");
}



	}


}