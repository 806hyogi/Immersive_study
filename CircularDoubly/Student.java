package CircularDoubly;

public class Student {

	public static final int SUB_LEN = 3; // 과목의 크기(국, 영, 수)
	
	private int[] scores; // 국, 영, 수
	private int sum;
	private double avg;
	private String name;
	
	// 생성자
	public Student() {
		this(null, new int[SUB_LEN]); // student 클래스 인스턴스에 객체를 초기화를 담당.
	}
	
	public Student(String name, int scores[]) { // 이름과 점수를 가져옴.
		this.name = name;
		this.scores = scores;
		calcAvg();
	}
	
	// 점수합계, 평균 계산
	public void calcAvg() {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		// this 사용이유 : 지역변수와 인스턴스변수와 구분하기위해 사용.
		this.sum = sum;
		this.avg = (double) sum / SUB_LEN;
	}
	
	// 정보 출력
	public void printInfo() {
		System.out.print("이름: " + this.getName());
		System.out.print(" | 국어: " + this.getKor());
		System.out.print(" | 영어: " + this.getEng());
		System.out.print(" | 수학: " + this.getMath());
		System.out.print(" | 총점: " + this.getSum());
		System.out.printf(" | 평균: %.1f\n", this.getAvg());
	}
	
	// to string
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // 가변 문자열 처리하기 위해 사용
		sb.append("이름: " + this.getName());
		sb.append(" | 국어: " + this.getKor());
		sb.append(" | 영어: " + this.getEng());
		sb.append(" | 수학: " + this.getMath());
		sb.append(" | 총점: " + this.getSum());
		sb.append(String.format(" | 평균: %.1f", this.getAvg())); // 소주점 한자리까지 포맷팅(문자열 형식화)하여 추가
		return sb.toString(); // 하나의 문자열로 변환하여 반환.
	}

	// 이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// 총점 반환
	public int getSum() {
		return this.sum;
	}
	// 평균값 반환
	public double getAvg() {
		return this.avg;
	}
	// 점수
	public void setScores(int[] scores) {
		this.scores = scores;
		calcAvg();
	}

	public void setScoreByIndex(int index, int score) {
		this.scores[index] = score;
		calcAvg();
	}

	public int getScoreByIndex(int index) {
		return this.scores[index];
	}
	// index 0번 국어
	public int getKor() {
		return this.scores[0];
	}

	public void setKor(int score) {
		setScoreByIndex(0, score);
	}
	// index 1번 영어
	public int getEng() {
		return this.scores[1];
	}

	public void setEng(int score) {
		setScoreByIndex(1, score);
	}
	// index 2번 수학
	public int getMath() {
		return this.scores[2];
	}

	public void setMath(int score) {
		setScoreByIndex(2, score);
	}
}
