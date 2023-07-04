package test;

import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 도적 메모리할당
		
//		String str = sc.next();
//		
//		if(str.equals("+")){ // 문자열 비교하는 함수
//			System.out.println("+");
//		}else {
//			System.out.println("Nothing");
//		}
		
//		String str1 = "Superman";
//		String str2 = "Superman";
		
		String str1 = new String("Superman");
		String str2 = new String("Superman");
		
		if(str1.equals(str2)) {
			System.out.println("Same");
			
		}else {
			System.out.println("diff");
			
		}
		
		if(str1 == str2){
			System.out.println("Same");
			
		}else {
			System.out.println("diff");
		}
	}

}
