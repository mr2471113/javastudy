package string;

class IndexOf {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int idx = str.indexOf(" ");
		System.out.println(idx);

		while(idx > -1) {
			idx = str.indexOf(" ", idx + 1);
			System.out.println(idx);
		}
		
		// 다음 문장 찾기
//		idx = str.indexOf(" ", 5);
//		System.out.println(idx);		
//
//		idx = str.indexOf(" ", 9);
//		System.out.println(idx);
//
//		idx = str.indexOf(" ", 13);
//		System.out.println(idx);
//
//		idx = str.indexOf(" ", 16);
//		System.out.println(idx);
//
//		idx = str.indexOf(" ", 9);
//		System.out.println(idx);
	}
}