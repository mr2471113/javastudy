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
			System.out.println("����");
			while(true) {
				int data = fi.read(buffer);
				if(data == -1) break;
				fo.write(buffer);	
//				int data = fi.read(); �Ѱ��� ����
//				if(data == -1) break; �Ѱ��� ����
//				fo.write(data);	 �Ѱ��� ����			
			}
			System.out.println("����");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
