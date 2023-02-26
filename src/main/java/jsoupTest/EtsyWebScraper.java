package jsoupTest;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class EtsyWebScraper {

	public static void main(String[] args) throws IOException {
		
		
		final String url = "https://www.etsy.com";
		Document Doc = Jsoup.connect(url).get();
		System.out.println(Doc.title());
		
	}

}
