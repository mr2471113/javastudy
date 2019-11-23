
// 요구되는 개발@@@능력
// 1. 제어문(조건)
// 2. 라이브러리 활용
// 3. 수학
import java.util.Random; // 다른 위치에 존재하는 라이브러리 가져오기
public class Test { // 실행 : ctrl + F11(저장후 실행)
	// 주석 (Comment)
	// main 입력 후    Ctrl + Space ( main method 선택)
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis()); //유닉스타임 보기
		// 라이브러리를 불러내는 코드
		Random r = new Random();
		System.out.println( r.nextInt(4) );
		
		// syso 입력후 ctrl + space
		// 출력문
		System.out.println(1111);
		// 복사 단축키 : Ctrl + Alt + 화살표아래쪽
		System.out.println("hello");
		
		System.out.println("1 + 2 = " + 1 + 2);
		
		int a = 10;
		a += 3;
		// a = a + 3;
		
		System.out.println(a);
	}
}
