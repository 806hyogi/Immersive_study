package test;

class AC {
	private int a; // 인스턴스 변수 a
	
	public AC(int a) { // 생성자 (constructor)
		this.a = a;
	}
	// getter (값을 가져온다.)
	public int getA() {
		return a;
	}
	
	// 인스턴스 메서드
	public void disp() {
		System.out.println("하하하");
	}
	
}

class B extends AC{
	private int b;
	public B(int a, int b) {
		super(a); // ac 생성자 호출
		this.b = b; // b를 초기화 (변수 구분할때)
	}
	public int getB() { // 메서드
		return b; // 인스턴스 변수 b
	}
}
class C extends B{
	private int c; //정수형 인스턴스 변수 c
	
	public C(int a, int b, int c) {
		super(a,b); // 생성자를 호출
		this.c = c; // c를 초기화 this는 변수 구분때문에 
	}
	public int getC() {
		return c; // 인스턴스 변수 c의 값을 반환
	}
	
	@Override // 부모클래스의 disp()메서드를 오버라이딩 한다.
	public void disp() {
		super.disp();
		System.out.println("호호호");
	}
}



public class study32 {
	public static void main(String[] args) {
		
		//동적 바인딩
		C cc = new C(1,2,3); //정적 바인딩: 부모의 레퍼런스로 자식을 사용
		
		
		System.out.println(cc.getA());
		System.out.println(cc.getB());
		System.out.println(cc.getC());
		cc.disp();

		
		
	}
}