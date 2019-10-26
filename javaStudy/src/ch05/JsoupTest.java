package ch05;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {

	public static void main(String[] args) throws IOException {
		//������ ������ �����´�.

		Document doc = Jsoup.connect("http://license.korcham.net/").get();

		//���� �߿��� ���ϴ� �κ��� �����´�.

		Elements contents = doc.select("myForm.placeInfoTable.table_list0");
		
		for(int i = 0; i < contents.size(); i++) { // ���� size �Ǵ� length
			Element e = contents.get(i);
			String text = e.text();
			String no = text.substring(0, 4); // ������ġ, ����ġ (269ȭ_)
			String title = text.substring(5);
			System.out.println(no);
			System.out.println(title);
		}
	}
}
