package miniproject;

import java.util.Scanner;

//등록, 삭제, 조회 클래스
public class PrintMenu {
	
	Continue con;
	Scanner sc;
	AddMember addMember;
	DeleteMember deleteMember;
	LookMember lookMember;
	
	//생성자
	public PrintMenu() {
		con = new Continue();
		sc = new Scanner(System.in);
		addMember = new AddMember();
		deleteMember = new DeleteMember(addMember);
		lookMember = new LookMember(addMember);
	}
	
	//메소드
	public void printMenu() {

		
		// DeleteMember deleteMember = new DeleteMember();

		while (con.getControl()) { 

			System.out.println("======================");
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 조회");
			System.out.println("======================");

			int inputChoice = sc.nextInt();

			switch (inputChoice) {

			case 1:
				System.out.println("등록 모드에 접근했습니다.");
				System.out.println("======================");

				addMember.addMember();
				
				
				con.asking();
				break;
			case 2:
				System.out.println("삭제 모드에 접근했습니다.");
				System.out.println("======================");

				// deleteMember.lookMember();
				deleteMember.deleteMember();

				con.asking();
				break;
			case 3:
				System.out.println("조회 모드에 접근했습니다.");
				System.out.println("======================");

				lookMember.lookMember();

				con.asking();
				break;
			}
		}
	}
}
