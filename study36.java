/*
 * 인터페이스
 * 추상클래스 보다 더 추상화
 * 상수, 추상메소드
 * 다중상속을 대체한다.
 * 클래스가 인터페이스를 여러개 받을 수 있다.
 * implements
 * 인터페이스끼리는 다중상속이 허용된다.
 * */

package test;

interface A{
	final static int MAX = 100;
	
	public abstract void disp();
	
}

interface B{
	final static int MAX = 100;
	
	public abstract void disp1();
	
}

interface C extends A, B{
	final static int MAX = 100;
	
	public abstract void disp2();
	
	
}

public class study36 implements A, B, C{

	@Override
	public void disp() {
		
	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		C c = new study36();
		c.disp();
		c.disp1();
		c.disp2();
	}
}
