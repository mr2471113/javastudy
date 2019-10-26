package ch02;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		
		int num1 = num / 10000;
		num = num % 10000;
		int num2 = num / 1000;
		num = num % 1000;
		int num3 = num / 100;
		num = num % 100;
		int num4 = num / 10;
		int num5 = num % 10;
		
		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 숫자의 합 :" + total);
	}
}
