package ch07;

import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		Book book = new Book();
		
		Scanner s = new Scanner(System.in);
		System.out.println("力格阑 涝仿秦 林技夸");
		String 力格 = s.nextLine();
		book.力格 = 力格;
		
		System.out.println("力格阑 涝仿秦 林技夸");
		book.历磊 = s.nextLine();
		
		System.out.println("力格阑 涝仿秦 林技夸");
		book.price = s.nextInt();
	}
}
