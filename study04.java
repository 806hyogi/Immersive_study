package test;

import java.util.Scanner;

public class study04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 도적 메모리할당
		
		String str = sc.next();
		
		switch(str) {
		
		case "+":
			System.out.println("+");
			break;
		case "-":
			System.out.println("-");
			break;
		case "*":
			System.out.println("*");
			break;
		case "/":
			System.out.println("/");
			break;
		
		default :
			System.out.println("nothing");
		}

	}

}
