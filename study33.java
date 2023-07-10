package test;

import java.util.Scanner;

public class study33 {
	private study33_2 name;
	private study33_1 kor;
	private study33_1 eng;
	private study33_1 mat;
	private int total;
	private float avg;

	public study33() {
		name = new study33_2();
		kor = new study33_1();
		eng = new study33_1();
		mat = new study33_1();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public void setName(String name) {
		this.name.setName(name);
	}

	public void setKor(int kor) {
		this.kor.setScore(kor);
	}

	public String getName() {
		return name.getName();
	}

	public int getKor() {
		return kor.getScore();
	}

	public void setEng(int eng) {
		this.eng.setScore(eng);
	}

	public int getEng() {
		return eng.getScore();
	}

	public void setMat(int mat) {
		this.mat.setScore(mat);
	}

	public int getMat() {
		return mat.getScore();
	}

	public int resTot() {
		total = getKor() + getEng() + getMat();
		return total;
	}

	public float resAvg() {
		avg = total / 3.f;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		study33 sm = new study33();
		sm.setName(sc.next());
		sm.setKor(sc.nextInt());
		sm.setEng(sc.nextInt());
		sm.setMat(sc.nextInt());

		System.out.println(sm.getName() + "\t" + sm.getKor() + "\t" + sm.getEng() + "\t" + sm.getMat() + "\t"
				+ sm.resTot() + "\t" + sm.resAvg());
	}
}