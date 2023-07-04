// 배열
package test;

public class study17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = new int[3]; // 0, 1, 2
		
		int b = 1; // 지역변수는 꼭 초기화를 해서 사용해야 한다.
		
//		System.out.println(b);
		
		
		
		// 1차원 배열
		
//		for(int i = 0; i < 3; i++) { // 3이상의 숫자를 입력하면 초과 에러가 난다.
//			
//			System.out.println(arr[i]);
//			
//		}

		
		
//		for(int i = 0; i < arr.length; i++) {  // arr.length 사용
//			
//			System.out.println(arr[i]);
//			
//		}
		
		
		// 2차원 배열
		
		int [][]arr2 = new int[2][];
		
		arr2[0] = new int[3]; // 공간이 3개 들어감
		arr2[1] = new int[5]; // 공간이 6개 들어감
		
		
		for(int i = 0; i < arr2.length; i++) { //2
			for(int j = 0; j < 3; j++) { //3
				System.out.print(arr2[i][j]);
			}
			System.out.println(); // 개행
		}
		
	}

}
