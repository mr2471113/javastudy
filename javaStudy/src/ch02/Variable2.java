package ch02;

public class Variable2 {
	public static void main(String[] args) {
		int score = 88;
		System.out.println("점수는? " + 88);
		System.out.println("점수는? " + score);
		
		int num = 65;
		System.out.println((char) num);
		int num2 = num + 25;
		System.out.println((char) num2);
		
		char ch = 'a';
		char ch2 = 'z';
		System.out.println((int) ch);
		System.out.println((int) ch2);
		
		// 대소문자를 구분해서 파악이 가능하고 상호 변환도 가능하다
	}
}
