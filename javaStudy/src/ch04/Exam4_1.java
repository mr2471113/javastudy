package ch04;

import java.util.Scanner;

public class Exam4_1 {
	public static void main(String[] args) {
		int workingTime = 0; // �ٹ��ð�

		Scanner s = new Scanner(System.in);
		workingTime = s.nextInt();
		
		if(workingTime >= 8) {
			System.out.println("���");
		} else {
			System.out.println("��ӱٹ�");
		}
		
		s.close();
		// �ڵ� �ۼ�
		// workingTime �� 8 �̻��̸� ���
		// workingTime �� 8 �̸��̸� ��� �ٹ�
	}
}