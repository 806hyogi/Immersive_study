package LinkedList;

import java.util.Scanner;

public class Askscore {

	public static void main(String[] args) {

		// 입력 객체 선언
		Scanner sc = new Scanner(System.in);

		// LinkedList의 head노드
		Node head = null;
		Node tail = null;

		String studentName;
		String inputName;
		int inputNum;
		int studentKor;
		int studentEng;
		int studentMath;

		// 학생 정보 입력 받기
		System.out.println("몇명을 입력할건가요? :");
		inputNum = sc.nextInt();

		for (int i = 0; i < inputNum; i++) {
			// 입력
			System.out.println("학생 이름을 입력하세요: ");
			studentName = sc.next();

			System.out.println("국어 점수를 입력하세요: ");
			studentKor = sc.nextInt();

			System.out.println("영어 점수를 입력하세요: ");
			studentEng = sc.nextInt();

			System.out.println("수학 점수를 입력하세요: ");
			studentMath = sc.nextInt();

			// 이름, 국어, 영어, 수학 점수를 가지는 새로운 객체를 생성합니다.
			AddStudent student = new AddStudent(studentName, studentKor, studentEng, studentMath);

			// 새로운 Node를 생성하여 LinkedList에 추가합니다.
			Node newNode = new Node(student);

			// 새로운 Node를 LinkedList에 추가합니다.
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		// 반복문을 돌려서 계속해서 항목에 맞는 역할을 반복해서 실행할수 있게 합니다.
		while (true) {

			// 항목 입력
			System.out.println("1.이름검색   2.성적순 검색   3.80점 이상의 모든친구 출력   4.전체출력   5.수정   6.삭제   7.전체 리스트 개수");
			int inputSearchData = sc.nextInt();

			switch (inputSearchData) {

			case 1:
				// 이름 검색
				System.out.println("이름검색: ");
				inputName = sc.next();

				boolean found = false;

				// LinkedList를 헤드부터 차례로 순회하면서 원하는 값의 이름을 검색합니다.
				Node current = head;
				while (current != null) {

					// 입력된 이름과 LinkedList의 이름 값을 비교하고 일치하면 이름을 출력합니다.
					if (inputName.equals(current.student.getStudentName())) {
						System.out.println("찾고있는 사람 : " + current.student.getStudentName() + " 입니다.");
						found = true;
						break;
					}
					current = current.next;
				}
				// found가 아니면 찾고있는 사람이 없다고 예외처리를 해줍니다.
				if (!found) {
					System.out.println("찾고있는 사람이 없습니다.");
				}
				break;

			case 2:
				// 성적순 검색
				String findStudentName;
				System.out.println("검색할 이름을 입력: ");
				findStudentName = sc.next();
				found = false;

				// LinkedList를 순회하면서 찾고있는 이름과 일치하는 값을 출력합니다.
				current = head;
				while (current != null) {

					// 찾고있는 이름을 입력받은 값과 arraylist에 이름값을 비교하고 출력합니다.
					if (findStudentName.equals(current.student.getStudentName())) {
						// to string 사용
						System.out.println(current.student);
						found = true;
						break;
					}
					current = current.next; // 계속 next로 이동하면서 같은노드를 찾습니다.
				}

				if (!found) {
					System.out.println("학생을 찾을 수 없습니다.");
				}
				break;

			case 3:
				// 80점 이상의 모든 친구 출력
				System.out.println("80점 이상의 친구 출력");
				found = false;

				// LinkedList를 순회하면서 국어, 영어, 수학 점수 중 80점 이상인 학생을 출력합니다.
				current = head;
				while (current != null) {
					if ((current.student.getStudentKor() >= 80) || (current.student.getStudentEng() >= 80)
							|| (current.student.getStudentMath() >= 80)) {
						System.out.println("80점 이상의 학생: " + current.student.getStudentName());
						found = true;
					}
					current = current.next; // 같은 방법으로 next를 이용하여 노드를 순회합니다.
				}

				if (!found) {
					System.out.println("80점 이상을 받은 친구가 없습니다.");
				}
				break;

			case 4:
				// 전체 출력
				System.out.println("전체 출력");

				// LinkedList에 있는 모든 학생 정보를 출력합니다.
				current = head; // 헤드를 현재 노드로 두고
				while (current != null) { // 현재 노드가 null이 아닐경우 반복을 합니다.
					System.out.println(current.student); // 반복하면서 학생의 정보를 출력합니다.
					current = current.next;
				}

				break;

			case 5:
				// 수정
				// 수정하고 싶은 이름을 입력받고 list에서 맞는 이름과 일치하면 set으로 값을 변경합니다.
				String remakeName;
				System.out.println("수정하고 싶은 이름을 입력하세요");
				remakeName = sc.next();

				current = head; // 같은 방식으로 현재 노드에 헤드를 두고 순회합니다.
				while (current != null) {
					if (remakeName.equals(current.student.getStudentName())) {
						System.out.println("새로운 이름을 입력하세요: ");
						current.student.setStudentName(sc.next());

						System.out.println("새로운 국어 점수를 입력하세요: ");
						current.student.setScoreStudent1(sc.nextInt());

						System.out.println("새로운 영어 점수를 입력하세요: ");
						current.student.setScoreStudent2(sc.nextInt());

						System.out.println("새로운 수학 점수를 입력하세요: ");
						current.student.setScoreStudent3(sc.nextInt());
						break;
					}
					current = current.next;
				}
				break;

			case 6:
				// 삭제
				String DeleteName;
				System.out.println("삭제하고 싶은 이름을 입력하세요");
				DeleteName = sc.next();

				Node prevNode = null;
				current = head; // 헤드를 현재 노드에 넣고
				while (current != null) { // 현재 노드가 null이 아닐동안 반복문을 돌립니다.
					if (current.student.getStudentName().equals(DeleteName)) { // 입력한 이름과 비교해서
						if (prevNode != null) { // 이전 노드가 비어있지 않은 경우
							prevNode.next = current.next; // 현재 노드 다음노드를 이전 노드의 다음노드에 넣습니다.
						} else { // 비어있으면
							head = current.next; // 현재 노드의 다음노드를 head로 지정합니다.
						}
						System.out.println("학생이 삭제되었습니다.");
						break;
					}
					prevNode = current; // 현재노드를 이전노드에 넣고
					current = current.next; // 현재노드의 다음노드를 현재 노드로 바꿉니다.
				}

				if (current == null) {
					System.out.println("학생을 찾을 수 없습니다.");
				}
				break;

			case 7:
				// 전체 리스트 개수 출력
				current = head;
				int count = 0;
				while (current != null) { // 반복문으로 현재 노드를 순회하면서 
					count++; // count 값을 올립니다.
					current = current.next;
				}
				System.out.println("전체 리스트의 개수 출력: " + count);
				break;

			case 8:
				// 리스트 모두 지우기
				System.out.println("리스트를 모두 지우시겠습니까? (Y/N)");
				String answer = sc.next();

				if (answer.equalsIgnoreCase("Y")) {
					head = null; // head를 null로 설정하여 전체 리스트를 비웁니다.
					System.out.println("리스트를 모두 지웠습니다.");
				} else {
					System.out.println("리스트 삭제를 취소합니다.");
				}
				break;
			}
		}
	}
}
