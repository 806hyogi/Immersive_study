// getter, setter을 이용한 사칙연산 계산기 만들기(연습)


package test;

import java.util.Scanner;

public class study22_2 {

	// 필드
	private int num1;
	private int num2;
	private String operation;
	private int result;
	
	public study22_2(){
		System.out.println("사칙연산 계산기입니다.");
	}
	
	public void setNum1(int num) {
		num1 = num;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num) {
		num2 = num;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setOperation(String o) {
		operation = o;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public int plus() {
		return num1 + num2;
	}
	
	public int sub() {
		return num1 - num2; 
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public int div() {
		return num1 / num2;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int res) {
		result = res;
	}
	
	public static void main(String[] args) {
		study22_2 calc = new study22_2();
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); // 첫번재 숫자 입력
		String operation = sc.next(); // 사칙연산 입력
		int n2 = sc.nextInt(); // 두번째 숫자 입력
		
		calc.setNum1(n1); // n1을 넣어서 바꿈
		calc.setOperation(operation);
		calc.setNum2(n2);
		
		switch(operation) {
			case "+":
				calc.result = calc.plus();
				break;
				
			case "-":
				calc.result = calc.sub();
				break;
			case "*":
				calc.result = calc.mul();
				break;
			case "/":
				calc.result = calc.div();
				break;
		}
		
		
		
		System.out.println(calc.getNum1()+" "+calc.getOperation()+" "+calc.getNum2()+ " = "+calc.getResult());
	}
	
	
}