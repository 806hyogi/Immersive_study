/*
 * inner class
 * 	outter class의 멤버로써 존재
 * 	outter class의 필드를 직접적으로 사용이 가능한 클래스
 * 	event 처리시 많이 사용
 * 	outter class의 객체를 생성하고 inner class의 객체를 생성후 사용.
 * 
 * 1. number inner class (필수)
 * 2. static inner class
 * 3. local inner class
 * 4. anonymous inner class (익명 내부 클래스) (필수)
 * 
 * */

package test;

public class study37 {
	
	// outter class
	private int a;
	protected int b;
	public int c;
	public static int d;
	
	
	
	// (inner클래스) 이기때문에 outclass을 사용가능.
	class A {
		public void disp() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		study37 in = new study37();
		study37.A aa = in.new A(); // inner클래스는 out클래스를 통해 안으로 무조껀 들어와야함
	
		
		aa.disp();

	}

}
