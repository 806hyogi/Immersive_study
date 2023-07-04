package test;

public class study13 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 2-i; j++) { // 공백 2, 1 순으로 출력
				System.out.printf(" ");
			}
			
			for(int j = 0; j < i+1; j++) { // 1, 2, 3 순으로 출력
				
				System.out.printf("*");
				
			}

			System.out.println(); // 개행
		}
		
		
	}

}
