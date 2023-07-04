package test;

public class study07 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i < 10; i++) { // 1~9 까지 곱해지는 숫자
			
			for(int j = 2; j < 10; j++) { // 2~9 까지 곱하는 숫자
				
				System.out.print(j + "x" + i + "=" + i*j + "\t");

				
			}
			System.out.println(); 
		}
		
	}

}
