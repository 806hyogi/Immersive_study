// 집에서 해봐야 함 

// 여러명 입력하는 코드 추가한 성적 코드
package test;

import java.util.Scanner;

public class study24 {
	// 클래스의 필드
    private String[] scoName = { "국어", "영어", "수학" };
    private String[] name;
    private int[][] score;
    private float[] avg;
    private static Scanner sc = new Scanner(System.in);
    private int numPerson; // 입력 받기 위한 성적을 담은 배열
    
    public study24() {
        System.out.println("클래스를 이용한 성적처리 프로그램");
    }
    
    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[][] getScore() {
        return score;
    }

    public void setScore(int[][] score) {
        this.score = score;
    }

    public float[] getAvg() {
        return avg;
    }

    public void setAvg(float[] avg) {
        this.avg = avg;
    }
    // 입력받는 사람의 개수 getter setter
    public int getNumPerson() {
        return numPerson;
    }
    
    public void setNumPerson(int numPerson) {
        this.numPerson = numPerson;
    }
    
    public void calculateScore() { // 연산
    	// numPerson이 배열에 넣어짐.
        name = new String[numPerson];
        score = new int[numPerson][4];
        avg = new float[numPerson];
        
        for (int i = 0; i < numPerson; i++) {
            System.out.println("이름, 국어, 영어, 수학점수를 입력하세요:");
            
            name[i] = sc.next();
            
            for (int j = 0; j < scoName.length; j++) {
                score[i][j] = sc.nextInt();
                score[i][3] += score[i][j];
            }
            
            avg[i] = score[i][3] / scoName.length;
            
            System.out.println("이름:" + name[i] + " 국어:" + score[i][0] + " 영어:" + score[i][1] + " 수학:" + score[i][2]
                    + " 총:" + score[i][3] + " 평균:" + avg[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("몇몇의 사람을 입력할건가요?");
        study24 ce = new study24(); // 처음에 나오는 문구
        // 사람 개수 입력
        int numPerson = sc.nextInt();
        ce.setNumPerson(numPerson); // 사람 개수
        
        ce.calculateScore(); // 연산
    }
}
