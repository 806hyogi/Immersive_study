package test;

public class study14 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 3; i++) {
			
			
			for(int j = 0; j < 2-i; j++) { // 2, 1
				
				System.out.printf(" "); // 공백 출력
				
				
			}
			
			for(int j = 0; j < 2*i+1; j++) { // 1, 3, 5
							
				System.out.printf("*"); // 별 출력
							
			}
	

			System.out.println(); // 개행
		}

	}

}
