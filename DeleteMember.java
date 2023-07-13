package miniproject;

import java.util.Scanner;

//삭제 클래스
public class DeleteMember {

	private AddMember add;
	private String[] allMember;
	private int arrCnt;

//생성자
	public DeleteMember(AddMember addMember) {
		add = addMember;
		arrCnt = 0;
		allMember = add.getMemberAdd();
	}

	Scanner sc = new Scanner(System.in);

	public void deleteMember() {

		System.out.println("삭제하고 싶은 이름을 입력하세요");
		String inputDelete = sc.nextLine();

		int value = 99;
		for (int i = 0; i < allMember.length; i++) {
			if (arrCnt<allMember.length-2)
				arrCnt++;
			if (allMember[i] != null && allMember[i].contains(inputDelete)) {
				allMember[i] = "x";
				value = i;
				allMember[value] = allMember[i+arrCnt];
			}	
		}
			
	}
}