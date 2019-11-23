package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File4 {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("C:/eclipse/file.bin");
			
			FileOutputStream fo = new FileOutputStream("C:/eclipse/file2.bin");
			
			byte[] buffer = new byte[1024];
			System.out.println("시작");
			while(true) {
				int data = fi.read(buffer);
				if(data == -1) break;
				fo.write(buffer);	
//				int data = fi.read(); 한개씩 복사
//				if(data == -1) break; 한개씩 복사
//				fo.write(data);	 한개씩 복사			
			}
			System.out.println("종료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
