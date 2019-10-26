package ch05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {

	public static void main(String[] args) throws IOException {
		//웹에서 내용을 가져온다.

		Document doc = Jsoup.connect("http://license.korcham.net/").get();

		//내용 중에서 원하는 부분을 가져온다.

		Elements contents = doc.select("myForm.placeInfoTable.table_list0");
		
		for(int i = 0; i < contents.size(); i++) { // 길이 size 또는 length
			Element e = contents.get(i);
			String text = e.text();
			String no = text.substring(0, 4); // 시작위치, 끝위치 (269화_)
			String title = text.substring(5);
			System.out.println(no);
			System.out.println(title);
		}
	}
}
