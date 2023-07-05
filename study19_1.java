package test;

import java.util.Scanner;


public class study19_1 {

	public static void main(String[] args) {
		// 세사람 성적처리
	    // 입력 : 이름,국,영,수
	    // 연산 : 총점,평균
	    // 출력 : 이름,국,영,수,총,평
		String []scoName = {"국어","영어","수학"};
	    String []name = new String[3];
	    int [][]score = new int[3][4];// 국,영,수,총 
	    float []avg = new float[3] ; 
	    Scanner sc = new Scanner(System.in);
	    
		//입력
	    for(int i = 0; i < name.length; i++) {
	    	System.out.println("이름, 국어, 영어, 수학점수를 입력하세요:");
	    	
	    	name[i] = sc.next();
	    	
	    	for(int j = 0; j < score.length; j++) {
	    		
	    		score[i][j] = sc.nextInt();
	    		
	    		score[i][3] += score[i][j];
	    	}
	    	
	    	avg[i] = score[i][3] / 3;
	    	
	    	System.out.println("이름:" + name[i] + "국어:" + score[i][0] + "엉어:" + score[i][1] + "수학:" + score[i][2] + "총:" + score[i][3] + "평:" + avg[i]);
	    }
		
	}

}
