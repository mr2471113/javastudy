package ch06;

import java.util.Random;

public class MethodExam1 {
	
	static void print(int count, char ch) {
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
	
	static String print2(int count, char ch) {
		
		String result = "";
		for(int i = 0; i < count; i++) {
			for(int j = 0; j <= i; j++) {
//				System.out.print(ch);
				result = result + ch;
			}
//			System.out.println();
			result = result + "\n";
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		System.out.println(print2(5, '&'));
//		print(5, '@');
//		print(7, '#');
		
		Random ran = new Random();
		int num = ran.nextInt(10);
		System.out.println(num);
	}
	
	
}
