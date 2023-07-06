/*
 * 
 * this()
 * 현재 클래스 내에 있는 생성자에서 오버로딩된 또 다른 생성자를 호출하는 방법.
 * 
 * 
 */


package test;

public class study27 {
	
	private int a;
	private int b;
	
	
	public study27 (){
//		a = 0;
//		b = 0;
		this(0,0); // 유지보수 측면에서 this 사용
	}
	
	public study27 (int i){
		a = i;
		b = 0;
	}

	public study27 (int i, int j){
		a = i;
		b = j;
	}
	
	public int getA() {
		return a; // 안보여도 항상 this가 있음.
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}


	

	
//	public study27 getObject() {
//		return this; // 자기 자신의 객체를 리턴해야 할 경우
//	}
	
	
	
	public static void main(String[] args) {
	
		
//		study26 tel = new study26(); // 객체생성
//		
//		tel.setA(100); // tel + 100
//		System.out.println(tel.getA());
		
		study27 te1 = new study27();
		study27 te2 = new study27(10);
		study27 te3 = new study27(20, 30);
		
		System.out.println(te1.getA() + " " + te1.getB()); // 0,0
		System.out.println(te2.getA() + " " + te2.getB()); // 10, 0
		System.out.println(te3.getA() + " " + te3.getB()); // 20, 30
		
	}

}
