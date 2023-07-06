/*
 * 오버로딩
 * 	동일한 함수명으로 여러개의 함수를 제공해서 사용하게 해주는 기술.
 * 	매개변수의 타입, 또는 매개변수의 갯수로 구별이 가능함.
 * 	목적이 다른 함수끼리는 암묵적으로 오버로딩 금지.
 * 	리턴타입이 다른경우 -> 오버로딩이 아님.
 * */

package test;

public class study25_0706 { // 인스턴스 메서드
	
	private int a;
	private int b;
	
	
	public study25_0706(int aa, int bb) { // 메서드 이름은 같은데 매개변수가 다름 (눈에 안보일뿐 3개 this가 있음)
		
		System.out.println("Default2");
		a = aa;
		b = bb;
	}
	
	public study25_0706( ) { // 메서드 이름은 같은데 매개변수가 다름
		
		System.out.println("Default1");

	}
	
	

	public int getA() {
		return a;
	}
	
//	public int getA(int aa, int bb) { // 리턴 타입이 다른경우 오러로딩이 아님
//		return 'a';
//	}
	


	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	public static void main(String[] args) { // static 메서드
		
		
		study25_0706 oe1 = new study25_0706();
		
		System.out.println(oe1.getA());
		System.out.println(oe1.getB());
		
		
		study25_0706 oe2 = new study25_0706(10, 20);
		
		System.out.println(oe2.getA());
		System.out.println(oe2.getB());
	}

}
