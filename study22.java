
/*
  getter, setter을 이용한 사칙연산 switch 계산기 만들기
  
   3 + 4 -> 입력 -, *, /
   3 + 4 = 7 -> 출력
*/

package test;

import java.util.Scanner;

public class study22 {

	private int result;
	
	// 입장 멘트
	public study22() { // 생성자는 소문자시작 (명명규칙)
		System.out.println("member1이 입장했습니다.");
	}
	
	public int getResult() { // 게터 getter (가져오는 함수)
		return result; // 결과값 반환
	}
	
	public void setResult(int result) { // 새터 setter (넣는함수)
		this.result = result;
	}
	
	// 연산 메소드
	public void add(int number) { // 값을 더하는 메소드
		result += number;
	}
	
	public void sub(int number) { // 값을 빼는 메소드
		result -= number;
	}
	
	public void mul(int number) { // 값을 곱하는 메소드
		result *= number;
	}
	
	public void div(int number) { // 값을 나누는 메소드
		result /= number;
	}
	
	public static void main(String[] args) { // 외부
	
	
		study22 member1 = new study22(); // 생성자 호출 (환영인사)
		
		
		member1.setResult(100); // member1이 넣기 원하는 값
		
		member1.add(50);
		member1.sub(10);
		member1.mul(2);
		member1.div(2);
		// 결과값
		System.out.println("member1의 결과값은 " + member1.getResult() + "입니다.\n"); // member1 결과값 출력
			
			

	}
	
}
