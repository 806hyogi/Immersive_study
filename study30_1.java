// 남이 한 깔끔한 성적처리 클래스 코드
package test;

import java.util.Scanner;

//NameClass

class NameClass {
	
	private String name;
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

//SubjectClass

class SubjectClass {

	private int score;

	// getter setter
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

//성적처리 study30_1 Class
public class study30_1 {
	
	// 변수 선언 (필드)
	private NameClass name; //NameClass에서 사용할 변수
	private SubjectClass kor; //SubjectClass에서 사용할 변수
	private SubjectClass eng; //SubjectClass에서 사용할 변수
	private SubjectClass mat;//SubjectClass에서 사용할 변수
	private int total; // 총합 변수
	private float avg; // 평균 변수
	
	// 생성자
	public study30_1() { //초기화해주기
		name = new NameClass();
		kor = new SubjectClass();
		eng = new SubjectClass();
		mat = new SubjectClass();
		total = 0;
		avg = 0;
	}
	
	public void setName(String name) { //name setter
		this.name.setName(name);
	}
	
	public void setKor(int kor) { //kor setter
		this.kor.setScore(kor);
	}
	
	public void setEng(int eng) { //eng setter
		this.eng.setScore(eng);
	}
	
	public void setMat(int mat) { //mat setter
		this.mat.setScore(mat);
	}
	
	public String getName() { //name getter
		return name.getName();
	}
	
	public int getKor() { //kor getter
		return kor.getScore();
	}
	
	public int getEng() { //eng getter
		return eng.getScore();
	}
	
	public int getMat() { //met getter
		return mat.getScore();
	}
	
	public int getTotal() { //total getter
		return total = getKor()+getEng()+getMat(); //kor+eng+mat getter들 더해줘서 total변수에 넣어주기
	}
	
	public float getAvg() { //avg getter
		return (float) (avg = getTotal()/3); //avg변수에 getTotal()메소드 넣어주고 나누기 3하기
	}
	
	
	public static void main(String[] args) { //main부분
		
		Scanner sc = new Scanner(System.in);
		study30_1 gc = new study30_1();
		gc.setName(sc.next());
		gc.setKor(sc.nextInt());
		gc.setEng(sc.nextInt());
		gc.setMat(sc.nextInt());
		
		System.out.println(gc.getName());
		System.out.println(gc.getTotal());
		System.out.println(gc.getAvg());


	}

}