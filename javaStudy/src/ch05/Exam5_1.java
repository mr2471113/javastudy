package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// �ڵ� �ۼ�
		String sep = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) { // i % 2 == 0���� �ص� �� / �ݺ������� i++ �� i += 2 �� �ص� ��
				System.out.print(sep + arr[i]);
				sep = ", ";
			}
		}
	}
}
