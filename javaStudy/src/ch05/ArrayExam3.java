package ch05;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 7, 4 };

		int min = 0;
		// int min = Integer.MAX_VALUE; -> int 가 담을수 있는 최대값

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min || min == 0) { // 최초 최소값은 첫번째 값이 들어간다. 
				min = numbers[i];
			}
		}
		System.out.println("최소값 : " + min);
	}
}