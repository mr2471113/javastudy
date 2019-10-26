package ch04;

public class While {
	public static void main(String[] args) {
		int num = 123456789;
		
		// for(;num > 0;)
		while(num > 0) {
			int num1 = num % 10;
			num = num / 10;
			System.out.println(num1);
		}
	}
}