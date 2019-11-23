package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File5 {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("text.txt");
			
			// XXStream -> Reader 로 변환시켜주는 보조 스트림(변환젠더같은 역할)
			InputStreamReader isr = new InputStreamReader(fi);
			
			BufferedReader reader = new BufferedReader(isr);
			
			int count = 0;
			while(true) {
				String d = reader.readLine();
				if(d == null) break;
				int idx = d.indexOf("Python");
				if(idx > -1) {
					count++;
				}
				System.out.println(d);				
			}
			System.out.println("Python의 개수 "+ count);

/*
			// for(;;)
			int count = 0;
			while(true) {
				int data = fi.read();
				if(data == (int)'a') {
					count++;
				}
				if(data == -1) break;
				System.out.println((char)data);
			}
			System.out.println("a의 갯수 "+count);
*/
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
