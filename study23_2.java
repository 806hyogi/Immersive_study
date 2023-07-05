// 클래스 성적 계산기
package test;

import java.util.Scanner;

public class study23_2 {
	
	// 필드
	private String []scoName = {"국어","영어","수학"};
    private String [] name;
    private int [][]score;
    private float []avg; 
    private Scanner sc = new Scanner(System.in);
    
	// 생성자
    public study23_2() {
    	System.out.println("클래스 성적 계산기");
    	name = new String[1];
    	score = new int[1][4];
    	avg = new float[1];
    }
    
    
    public String[] getName() {
        return name; // 이름을 반환
    }

    public void setName(String[] name) {
        this.name = name; // 이름을 받아옴
    }

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
    
    public void calculateScore() { // 성적처리 메소드
        // 입력
        for (int i = 0; i < name.length; i++) {
            System.out.println("이름, 국어, 영어, 수학점수를 입력하세요:");

            name[i] = sc.next();

            for (int j = 0; j < score[i].length - 1; j++) {
                score[i][j] = sc.nextInt();

                score[i][3] += score[i][j];
            }

            avg[i] = score[i][3] / 3; // 평균값계산

            System.out.println(
                    "이름:" + name[i] + " 국어:" + score[i][0] + " 영어:" + score[i][1] + " 수학:" + score[i][2] + " 총:" + score[i][3] + " 평:"
                            + avg[i]);
        }
    }

	
	public static void main(String[] args) {
		study23 ce = new study23(); // study23라는 클래스의 인스턴스를 생성하여 main이라는 변수에 할당
        ce.calculateScore(); // 성적 처리 메소드 실행
	}

}
