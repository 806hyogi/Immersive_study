package test;

public class study09 {

	public static void main(String[] args) {
		
//		for(int i = 1; i < 10; i++) {
//			
//			for(int j = 2; j < 10; j++) {
//				
//				System.out.print(j + "x" + i + "=" + i*j + "\t");
//
//				
//			}
//			System.out.println(); 
//		}

		int i = 1;
		while(i < 10) { // 1~9까지 출력
			
			int j = 2;
			
			while(j < 10) { // 1~9까지 출력
				
				System.out.print(j + "x" + i + "=" + i*j + "\t"); // 곱셈 출력
				
				j++;
			}
			
			System.out.println(); // 개행
			i++;
		}
		
	}

}
