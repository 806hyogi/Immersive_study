/*
  
 배열을 잡을때 1.5배 이상으로 잡는다.(메모리가 부족하면 자바는 올 스톱되므로 생각하고 있어야함)
 
 레퍼런스타입 = 객체 하나당 레퍼런스 하나가 무조껀 필요.
 string[]s = new String[3]; → 레퍼런스가 3개다 객체가 3개가 아니라. (실수 젤 많이함) = 객체에 접근하는 레퍼런스
 
 배열의 장점 : 배열을 사용함으로써 일괄처리가 가능해서 코딩이 쉬움.

 <입력한 숫자로 학생수를 바꾸는 성적처리 코드> ★
 
*/


package test;

import java.util.Scanner;

public class study20_0705 {

	public static void main(String[] args) {
		
		// 1사람 성적처리
	    // 입력 : 이름,국,영,수
	    // 연산 : 총점,평균
	    // 출력 : 이름,국,영,수,총,평
		
	    String []scoName = {"국어","영어","수학"};
	    int [][]score = new int[3][4];// 국,영,수,총 
	    float []avg = new float[3] ; 
	    Scanner sc = new Scanner(System.in);
	    
	    
	    // 사람 입려받는 코드
	    System.out.println("몇명의 사람을 입력할건가요?");
	    int numPerson = sc.nextInt(); // 사람을 입력받음.
	    String []name = new String[numPerson]; // name에 numPerson을 넣음.
	    
	    
	    for(int i = 0; i < name.length; i++) { // 3번돌아감
	    	
	    	// 이름, 국, 영, 수 입력 코드
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
