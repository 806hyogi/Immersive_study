// 성적처리를 class 3개를 만들어서 구현해봐라 (집에서 다시할것)

package test;

import java.util.Scanner;

// 이름 클래스
class Name {
	
	// 필드
	private String[] name = new String[1]; // 하나의 이름 받음
	
	// getter setter
	public String[] getName() {
        return name; // 이름을 반환
    }

    public void setName(String[] name) {
        this.name = name; // 이름을 받아옴
    }
}

// 과목이름
class subject {
	
	private String[] scoName = { "국어", "영어", "수학" };
	
	// getter setter
	public String[] getScoName() {
		return scoName;
	}

	public void setScoName(String[] scoName) {
		this.scoName = scoName;
	}
	
}

// 과목 관리
class studyManage {
	
	private int[][] score = new int[1][4]; // 국,영,수,총
	private float[] avg = new float[1];
	
	// getter setter
	public int[][] getScore() {
        return score; // 점수를 반환
    }

    public void setScore(int[][] score) {
        this.score = score; // 점수를 받아옴
    }
	
    public float[] getAvg() {
        return avg; // 평균값을 반환
    }

    public void setAvg(float[] avg) {
        this.avg = avg; // 평균값을 받아옴
    }
    
    // 성적처리 메소드 (HasA 관계 성립)
    public void calculateScore() {
        
    	Scanner sc = new Scanner(System.in);
    	
    	Name nameObj = new Name(); // 이름 객체를 만듬.
    	
    	// 입력
        for (int i = 0; i < nameObj.getName().length; i++) {
            System.out.println("이름, 국어, 영어, 수학점수를 입력하세요:");

            nameObj.getName()[i] = sc.next(); // 이름 입력

            for (int j = 0; j < score[i].length - 1; j++) {
            	
                score[i][j] = sc.nextInt();

                score[i][3] += score[i][j];
            }

            avg[i] = score[i][3] / 3; // 평균값계산

            System.out.println(
                    "이름:" + nameObj.getName()[i] + " 국어:" + score[i][0] + " 영어:" + score[i][1] +
                    " 수학:" + score[i][2] + " 총:" + score[i][3] + " 평:" + avg[i]);
        }
    }
}


public class study30 {
	
	public static void main(String[] args) {
		studyManage studyManage = new studyManage(); // 객체생성
        studyManage.calculateScore();

	}

}
