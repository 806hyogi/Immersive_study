package Circular;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ScoreManager sm = new ScoreManager();

		int input;
		while (true) {
			System.out.print("1.학생등록 2.학생 정보 수정 3.학생 삭제 4.검색 5.전체출력 6.나가기\n> ");
			input = Integer.parseInt(sc.nextLine());

			switch (input) {

			case 1: {
				sm.addStu();
				break;
			}
			case 2: {
				sm.changeStu();
				break;
			}
			case 3: {
				sm.deleteStu();
				break;
			}
			case 4: {
				sm.searchStu();
				break;
			}
			case 5: {
				sm.allStu();
				break;
			}
			case 6: {
				System.out.println("프로그램 종료");
				sc.close();
				return;
			}
			default:
				System.out.println("잘못된 입력값");
			}
		}
	}
}
