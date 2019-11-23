package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 코드 작성
		String sep = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) { // i % 2 == 0으로 해도 됨 / 반복문에서 i++ 를 i += 2 로 해도 됨
				System.out.print(sep + arr[i]);
				sep = ", ";
			}
		}
	}
}
