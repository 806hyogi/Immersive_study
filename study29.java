/*
 * 추상 클래스
 * 객체를 생성할 수 없다.
 * 추상 메소드 : 구체화가 안된 메소드. abstract 키워드를 꼭 사용해서 만들어야함.
 * 추상메소드를 하나 이상 가지고 있는 클래스.
 * 주로 상속을 목적으로 사용.
 * 상속받은 자식클래스는 추상메소드를 오버라이딩을 해야한다.
 * 하지 않을 경우 자식클래스도 추상클래스화 되서 객체를 생성할 수 없다.
 * 
 * 이벤트 처리할때 가장 많이 사용.
 * 
 * 인터페이스
 * 추상화, 상수 + 추상메소드
 * 
 * 
 * HasA 관계
 */

package test;

class A{
	private int a;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
}


public class study29 {

	private A aa;
	
	public study29() {
		aa = new A();
	}
	
	private void setA(int i) {
		aa.setA(i);
	}
	
	private int getA() {
		return aa.getA();
	}
	
	public static void main(String[] args) {
		
		study29 ha = new study29();
		
		ha.setA(100);
		System.out.println(ha.getA());

	}

}
