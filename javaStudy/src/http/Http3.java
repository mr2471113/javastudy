package http;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Http3 { // parsing
	public static void main(String[] args) throws IOException {
		Connection con = Jsoup.connect("http://ggoreb.com/http/html2.jsp");
		Document doc = con.get();
		Elements imgs = doc.getElementsByTag("span");
		for (int i = 0; i < imgs.size(); i++) {
			Element img = imgs.get(i);
			String num = img.text();
			System.out.printf("%s\n", num);
		}
	}
}