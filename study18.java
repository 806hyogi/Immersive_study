// 1차원 성적처리
	// 입력 : 이름, 국, 영, 수
	// 연산 : 총점, 평균
	// 출력 : 이름, 국, 영, 수, 총, 평

package test;

import java.util.Scanner;

public class study18 {

	public static void main(String[] args) {
		
		

		int []score = new int[4]; // 국, 영, 수, 총
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 국, 영, 수 입력하세요.");
		
		// 입력
		String name = sc.next();
		String kor = sc.next();
		String eng = sc.next();
		String math = sc.next();
		
		// 점수
		score[0] = Integer.parseInt(kor);
		score[1] = Integer.parseInt(eng);
		score[2] = Integer.parseInt(math);
		
		// 합
		score[3] = score[0] + score[1] + score[2];
		// 평균
		float avg = (score[3] / 3);
		
		System.out.println("이름 : " + name + " 국 : " + kor + " 영 :" + eng + " 수 :" + math + " 총 : " + score[3] + " 평: " + avg);
		

	}

}
