package string;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		String[] arr =  file.split("/");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("") == true) { // arr[i] == "" 이렇게 만들면 안됨
				// 출력안함
			}else {
				System.out.println("/" + arr[i]);				
			}
		}
	}
}