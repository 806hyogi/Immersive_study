package test;

public class study15 {

	public static void main(String[] args) {
		
		// 위에
		for(int i = 0; i < 3; i++) { // 세로 3줄
			
			
			for(int j = 0; j < 2-i; j++) { // 2, 1
				
				System.out.printf(" "); // 공백
				
				
			}
			
			for(int j = 0; j < 2*i+1; j++) {  // 1, 3, 5
							
				System.out.printf("*"); // 별
							
			}
			
			
	

			System.out.println(); // 개행
		}
		
		// 아래
		
		for(int i = 0; i < 3; i+=2) {
			
			System.out.printf(" "); // 공백
			
			for(int j = 0; j < i; j+=2) { // 1, 2
				
				System.out.printf(" "); // 공백
				
				
			}
			
			for(int j = 3; j > i; j--) { // 3, 1
							
				System.out.printf("*"); // 별
							
			}
			
			
	

			System.out.println(); // 개행
		}

	}

}
