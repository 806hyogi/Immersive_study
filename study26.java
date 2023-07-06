/*
 * this, this()
 * this = 내 자신의 객체를 접근하는 레퍼런스 변수
 * 		= 항상 인스턴스 메소드의 첫번재 매개변수로 항상 존재하고 있음.
 * 		= 명시적으로 선언할 수 없다. 사용만 가능하다.
 * 		= 1. 지역변수와 필드명이 동일할경우 this를 사용하여 필드를 구별해야한다.
 * 			 우선순위가 지역변수가 빠르기 때문에.
 * 		  2. 메소드에서 자기 자신의 객체를 리턴해야할경우 
 */


package test;

public class study26 {
	
	private int a;
	
	public void setA(int aa) {
		a = aa;
	}
	
	public int getA() {
		return a;
	}
	
	

	
	
	public static void main(String[] args) { // 지역변수 개념
		// TODO Auto-generated method stub
		
		study26 tel = new study26(); // 객체생성
		
		tel.setA(100); // tel + 100
		System.out.println(tel.getA());
		
		
		study26 te2 = new study26(); // 객체생성
		
		te2.setA(200); // tel2 + 200
		System.out.println(te2.getA());
	}

}
