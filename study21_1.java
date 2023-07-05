package test;



public class study21_1 {
	
	
	// 필드
	private int person1;

	
	public study21_1() {
		System.out.println("디폴트 생성자");
	}
	
	public int getA() {
		return person1;
	}
	public void setA(int score) {
		person1 = score;
	}
	
	public static void main(String[] args) {
		
		study21_1 ce = new study21_1();
		
		System.out.println(ce.person1);
		
		ce.setA(100);
		
		System.out.println(ce.getA());
		
	}

}
