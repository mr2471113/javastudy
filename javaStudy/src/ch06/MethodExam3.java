package ch06;

public class MethodExam3 {
	static int nextInt(int ... bound) {
		return 0;
	}

	static int nextInt(int bound) {
		double num = Math.random(); // 0.0 <= num < 1.0
		// System.out.println(num);
		int result = (int)(num * bound); // 0.0 <= result < 10
		return result;
	}
	
	public static void main(String[] args) {
		nextInt(1,2,3,4,5,6,7);
		
		int num = nextInt(10);
		System.out.println(num);
	}
}
