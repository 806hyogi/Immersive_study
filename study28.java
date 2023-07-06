/*
// 메인에서 객체를 만들지 않고 static으로 수정하기

package test;

public class study28 {

	private static int a;
	private static int b;
	

	private study28() {
		
	}
	
	public static void disp() {
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		
//		study28 te1 = new study28();
//		te1.disp();
		
		study28.disp();
		
	}

}
*/

//메인에서 객체를 만들지 않고 필드에 static 사용하지 않고 수정하기

package test;

public class study28 {
	
	// 필드
	private int a;
	private int b;
	

	private study28() {
	
	}
	
	public static void disp() {
		
		study28 te1 = new study28();
		
		System.out.println(te1.a + " " + te1.b);
	}
	
	public static void main(String[] args) {
		
//		study28 te1 = new study28();
//		te1.disp();
		
		study28.disp();
		
	}

}