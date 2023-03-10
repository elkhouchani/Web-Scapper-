package jsoupTest;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class EtsyWebScraper {

	public static void main(String[] args) throws IOException {
		
		
		final String url = "https://www.etsy.com";
		Document Doc = Jsoup.connect(url).get();
		System.out.println("Title: "+Doc.title());
		
		//Extract links
		Elements links = Doc.select("a[href]");
		
		for(Element link: links) {
			System.out.println("\nlink :"+link.attr("href"));
			System.out.println("text: "+link.text());
		}
		
		//Extract images
		System.out.println(" ****** Getting all images ****** ");
		
		Elements imgs = Doc.getElementsByTag("img");
		for(Element src: imgs) {
			System.out.println(src.attr("abs:src"));
		}
	}

}
