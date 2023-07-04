
/*
  do while문을 이용한 사칙연산 switch 계산기 만들기
  
   3 + 4 -> 입력 -, *, /
   3 + 4 = 7 -> 출력
*/

package test;

import java.util.Scanner;

public class study10 {

	public static void main(String[] args) {
		
		String inputString;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("예) 3 * 4 입력하세요");
			
			String str1 = sc.next(); // nextLine이 아니라 next를 사용하여 스페이스바 사용하여 입력가능함.
			
			String op = sc.next(); // 연산을 입력받음
			
			String str2 = sc.next(); // str2를 입력받음
			
		
			int num1 = Integer.parseInt(str1); // str1 문자열 int로 형변환
			int num2 = Integer.parseInt(str2); // str2 문자열 int로 형변환
			int num3 = 0; // 결과값 선언
			
			
			switch(op) {
			
			case "+":
				num3 = num1 + num2;
				break;
			case "-":
				num3 = num1 - num2;
				break;
			case "*":
				num3 = num1 * num2;
				break;
			case "/":
				num3 = num1 / num2;
				break;
			}
			
			
			// 마지막 결과값을 출력
			System.out.println(str1 + op + str2 + "=" + num3);
			System.out.println("계속하려면 y또는 Y를 입력하세요.");
			inputString = sc.next();
			sc.nextLine(); // 개행문자 제거함 ★
			
			
		}while(inputString.equals("y") || inputString.equals("Y"));
		
		System.out.println("종료되었습니다.");
	}
	
}
