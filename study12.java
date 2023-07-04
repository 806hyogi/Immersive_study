package test;

public class study12 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 3; i++) { // 세로 3칸
			
			for(int j = 0; j < i+1; j++) { // 1, 2, 3 순으로 별을 찍기
				
				System.out.printf("*");
				
			}

			System.out.println(); // 개행
		}
		
		
	}

}
