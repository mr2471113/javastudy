
// �䱸�Ǵ� ����@@@�ɷ�
// 1. ���(����)
// 2. ���̺귯�� Ȱ��
// 3. ����
import java.util.Random; // �ٸ� ��ġ�� �����ϴ� ���̺귯�� ��������
public class Test { // ���� : ctrl + F11(������ ����)
	// �ּ� (Comment)
	// main �Է� ��    Ctrl + Space ( main method ����)
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis()); //���н�Ÿ�� ����
		// ���̺귯���� �ҷ����� �ڵ�
		Random r = new Random();
		System.out.println( r.nextInt(4) );
		
		// syso �Է��� ctrl + space
		// ��¹�
		System.out.println(1111);
		// ���� ����Ű : Ctrl + Alt + ȭ��ǥ�Ʒ���
		System.out.println("hello");
		
		System.out.println("1 + 2 = " + 1 + 2);
		
		int a = 10;
		a += 3;
		// a = a + 3;
		
		System.out.println(a);
	}
}
