package miniproject;

import java.util.Scanner;

//로그인 클래스
public class Login {

// 관리자 아이디 비밀번호 (필드)
	private String manageId;
	private String managePw;

// 생성자
	public Login() {
		System.out.println("=========================");
		System.out.println("===== 사원 관리 프로그램 =====");
		System.out.println("=========================");
		System.out.println("");

		manageId = "admin123";
		managePw = "1234";
	}

// getter setter
	public String getManageId() {
		return manageId;
	}

	public void setManageId(String manageId) {
		this.manageId = manageId;
	}

	public String getManagePw() {
		return managePw;
	}

	public void setManagePw(String managePw) {
		this.managePw = managePw;
	}

// 로그인 연산
	public void loginSystem() {

		Scanner sc = new Scanner(System.in);
		System.out.printf("아이디: ");
		String inputId = sc.nextLine();

		System.out.printf("비밀번호: ");
		String inputPw = sc.nextLine();

		// equals()로 비교함.
		if ((inputId.equals(manageId)) && (inputPw.equals(managePw))) {
			System.out.println("관리자 모드 로그인");

			// printMenu 객체 불러서 클래스 불러오기
			PrintMenu menu = new PrintMenu();
			menu.printMenu();

		} else {
			System.out.println("사용자 모드 로그인");
		}
	}
}