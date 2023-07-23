package CircularDoubly;

public class Student {

	public static final int SUB_LEN = 3; // ������ ũ��(��, ��, ��)
	
	private int[] scores; // ��, ��, ��
	private int sum;
	private double avg;
	private String name;
	
	// ������
	public Student() {
		this(null, new int[SUB_LEN]); // student Ŭ���� �ν��Ͻ��� ��ü�� �ʱ�ȭ�� ���.
	}
	
	public Student(String name, int scores[]) { // �̸��� ������ ������.
		this.name = name;
		this.scores = scores;
		calcAvg();
	}
	
	// �����հ�, ��� ���
	public void calcAvg() {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		// this ������� : ���������� �ν��Ͻ������� �����ϱ����� ���.
		this.sum = sum;
		this.avg = (double) sum / SUB_LEN;
	}
	
	// ���� ���
	public void printInfo() {
		System.out.print("�̸�: " + this.getName());
		System.out.print(" | ����: " + this.getKor());
		System.out.print(" | ����: " + this.getEng());
		System.out.print(" | ����: " + this.getMath());
		System.out.print(" | ����: " + this.getSum());
		System.out.printf(" | ���: %.1f\n", this.getAvg());
	}
	
	// to string
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // ���� ���ڿ� ó���ϱ� ���� ���
		sb.append("�̸�: " + this.getName());
		sb.append(" | ����: " + this.getKor());
		sb.append(" | ����: " + this.getEng());
		sb.append(" | ����: " + this.getMath());
		sb.append(" | ����: " + this.getSum());
		sb.append(String.format(" | ���: %.1f", this.getAvg())); // ������ ���ڸ����� ������(���ڿ� ����ȭ)�Ͽ� �߰�
		return sb.toString(); // �ϳ��� ���ڿ��� ��ȯ�Ͽ� ��ȯ.
	}

	// �̸�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// ���� ��ȯ
	public int getSum() {
		return this.sum;
	}
	// ��հ� ��ȯ
	public double getAvg() {
		return this.avg;
	}
	// ����
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
	// index 0�� ����
	public int getKor() {
		return this.scores[0];
	}

	public void setKor(int score) {
		setScoreByIndex(0, score);
	}
	// index 1�� ����
	public int getEng() {
		return this.scores[1];
	}

	public void setEng(int score) {
		setScoreByIndex(1, score);
	}
	// index 2�� ����
	public int getMath() {
		return this.scores[2];
	}

	public void setMath(int score) {
		setScoreByIndex(2, score);
	}
}
