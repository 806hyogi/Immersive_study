package test;

import java.util.Scanner;

public class study16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홀수를 입력하세요.");
		
		String inputString;
		
		inputString = sc.nextLine(); // 입력
		
		int inputNum = Integer.parseInt(inputString); // 형변환
		
		
		int a = inputNum / 2; 
		int count = 0;
		
		for(int i = 0 ; i < inputNum; i++) { //층수
			
			for(int j = 0; j < count + a + 1; j++) { //각층 마다 공백 또는 별 표시
				
				String star = j < a - count ? " ":"*";
				System.out.print(star);
			}
			
			if(i < a) { //반환점 돌면 반대로 카운트하며 별표시
				count++;
				
			}else {
				count--;
				
			}
			
			System.out.println();
		}
		
		
	}

}
