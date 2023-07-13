package miniproject;

import java.util.Scanner;

//등록 클래스
public class AddMember {

// 필드
	private String memberName;
	private int memberAge;
	private int memberNumber;

	private String[] memberAdd; // 이름, 나이, 숫자를 합한 변수

// 생성자
	public AddMember() {
		memberAdd = new String[100]; 
	}

// getter setter
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String[] getMemberAdd() {
		return memberAdd;
	}

	public void setMemberAdd(String[] memberAdd) {
		this.memberAdd = memberAdd;
	}

// 이름, 나이, 사원번호 입력
	public void addMember() {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇명의 사원을 입력하시겠습니까?");
		int inputMember = sc.nextInt();

		// 몇명의 사원을 입력할지 여부
		for (int i = 0; i < inputMember; i++) {

			sc.nextLine(); // 개행문자 제거

			System.out.print("이름: ");
			memberName = sc.nextLine();

			System.out.print("나이: ");
			memberAge = sc.nextInt();

			System.out.print("사원번호: ");
			memberNumber = sc.nextInt();

			memberAdd[i] = "이름: " + memberName + " 나이: " + memberAge + " 사원번호: " + memberNumber;
		}
	}
}