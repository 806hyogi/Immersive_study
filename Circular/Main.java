package Circular;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ScoreManager sm = new ScoreManager();

		int input;
		while (true) {
			System.out.print("1.�л���� 2.�л� ���� ���� 3.�л� ���� 4.�˻� 5.��ü��� 6.������\n> ");
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
				System.out.println("���α׷� ����");
				sc.close();
				return;
			}
			default:
				System.out.println("�߸��� �Է°�");
			}
		}
	}
}
