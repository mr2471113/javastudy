package ch06;

public class MethodExam {

	static int checkGrade(int kg){
		int result = 0;
		if(kg >= 10) {
			result = 1;
		}else if(kg >= 7) {
			result = 2;
		}else if(kg >= 4) {
			result = 3;
		}else {
			result = 4;
		} 
		return result;
	}
	
	static int getBetweenSum(int a, int b) {
		int result = 0;
		if(a == b) {
			result = a;
		}else {
			if(a > b) {
				for(int i=b; i<=a; i++) {
					result += i;
				}
			}else {
				for(int i=a; i<=b; i++) {
					result += i;
				}
			}
		}
		return result;
	}
	
	static int getLastYear(int m) {
		int result = 0;
		if(m == 2) {
			result = 28;
		}else if(m==4 || m==6 || m==9 || m==11) {
			result = 30;
		}else {
			result = 31;
		}
		return result;
	}
	
	static String dilemma(boolean xa, boolean xb) {
		String result = "";
		if(xa==true && xb==true) {
			result = "A, B 둘 다 5년 복역";
		}else if(xa==true && xb==false) {
			result = "A 석방, B 10년 복역";
		}else if(xa==false && xb==false) {
			result = "A 10년 복역, B 석방";
		}else {
			result = "A, B 둘 다 1년 복역";
		}
		return result;
	}
	
	public static void main(String[] args) {
		int weight = checkGrade(7);
		System.out.println(weight + "등급");
		
		int totalsum = getBetweenSum(1, 7);
		System.out.println(totalsum);
		
		int month = getLastYear(6);
		System.out.println(month);
		
		String dicision = dilemma(true, false);
		System.out.println(dicision);
		
	}
	
}
