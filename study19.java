
package test;

import java.util.Scanner;

public class study19 {

	public static void main(String[] args) {
		
	// 1사람 성적처리
	    // 입력 : 이름,국,영,수
	    // 연산 : 총점,평균
	    // 출력 : 이름,국,영,수,총,평
		
	    String []scoName = {"국어","영어","수학"};
	    String []name = new String[3];
	    int [][]score = new int[3][4];// 국,영,수,총 
	    float []avg = new float[3] ; 
	    Scanner sc = new Scanner(System.in);
	    
	    
	    for(int i = 0; i < name.length; i++) { // 3번돌아감
	    	
	    	// 입력
	    	System.out.println("이름, 국, 영, 수 입력하세요.");
	    	name[i] = sc.next();   // 이름
	    	
	    	for(int j=0; j < score[i].length; j++) { // 4번돌아감
	    		
	    		if(j < score[i].length-1) { // -1이 총점을 뺸값 (score 배열에 총점도 포함하면 안되기때문에 -1 을 함)
	    			score[i][j] = sc.nextInt(); // 점수 입력
	    		}
	    		score[i][3] += score[i][j]; // 총점 연산
	    	
	    	}
	    	
	    	
	    	avg[i] = (float)score[i][3] / 3; // 평균
	    	
	    	
	    	System.out.println("이름 : " + name[i] + " 국 : " + score[i][0] + " 영 :" + score[i][1] + " 수 :" + score[i][2] + " 총 : " + score[i][3] + " 평: " + avg[i]);
	    	
	    }
				
		    
	    
	}
}
