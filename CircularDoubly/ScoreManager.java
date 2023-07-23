package CircularDoubly;

import java.util.List;
import java.util.*;

// 이중 연결리스트와 비교하여 원형 이중 연결리스트의 주요 차이점은 헤드노드와 테일 노드가 모두 존재하며, 마지막 노드의 다음노드가 헤드 노드가 되는 것입니다.
// 리스트를 순환하는데 용이하며 삭제시에도 이전 노드를 알 필요없이 삭제 가능합니다.

public class ScoreManager {
	Scanner sc = new Scanner(System.in);

	private Node head; // 단일 연결 리스트의 시작 노드
	private Node tail; // 이중 연결 리스트의 마지막 노드
	// 생성자

	public ScoreManager() {
		head = null;
		tail = null;

	}

	// 학생 등록
	public void addStu() {
		// 추가할 학생 인스턴스 생성
		Student tempStu = new Student();

		// 학생 이름 입력
		System.out.print("이름을 입력하세요\n> ");
		tempStu.setName(sc.nextLine());

		// 점수 입력
		int[] tempScores = new int[3];
		for (int i = 0; i < tempScores.length; i++) {
			System.out.print(Subjects.getName(i) + "점수를 입력\n> ");
			tempScores[i] = Integer.parseInt(sc.nextLine());
		}
		tempStu.setScores(tempScores);

		// 새로운 노드 생성
		Node newNode = new Node(tempStu);

		// 리스트가 비어있는 경우 ★
		if (head == null) {
			// head와 테일 둘다 새로운 노드를 가리킴
			head = newNode;
			tail = newNode;
			// head 이전은 tail을 가리키고
			head.prev = tail;
			// tail의 다음은 head를 가리킨다.
			tail.next = head;
		} else {
			// 새로운 노드를 리스트의 맨 뒤에 추가
			tail.next = newNode; // tail과 새로운 노드를 연결하고
			newNode.prev = tail; // 새로운 노드의 이전 노드와 tail과 연결
			tail = newNode; // 새로운 노드를 tail로 연결
			tail.next = head; // tail의 다음 노드를 head로 연결하여 원형으로 만듦
			head.prev = tail; // head의 이전 노드를 tail로 연결하여 원형으로 만듦
		}

		System.out.print("\"" + tempStu.getName() + "\"" + "추가 완료 \n");
	}

	// 학생 변경
	public void changeStu() {

		// 학생이 한명도 없을때
		if (head == null) {
			System.out.println("[학생이 한명도 없습니다]");
			return;
		}

		// 학생 한명 선택
		Student selectedStudent = selectStu();
		if (selectedStudent == null) {
			System.out.print("[해당 학생 없음]\n");
			return;
		}

		// 과목 선택
		int selectSubIndex = selectSubIndex();

		// 선택한 과목의 수정할 점수 입력
		System.out.print("변경할 점수\n> ");
		int newScore = Integer.parseInt(sc.nextLine());

		// 선택한 과목의 점수를 입력한 값으로 수정
		selectedStudent.setScoreByIndex(selectSubIndex, newScore);
		System.out.println("변경 완료");
	}

	// 학생 삭제 메소드
	public void deleteStu() {
		// 학생이 한명도 없을 때
		if (head == null) {
			System.out.println("[수정할 학생 없음]");
			return;
		}

		// 학생 한명 선택
		Student selectedStudent = selectStu();
		if (selectedStudent == null) {
			System.out.println("[해당 학생 없음]\n");
			return;
		}

		// 선택한 학생 리스트에서 제거 ★
		Node current = head;
		// current가 비어있지 않은 경우
		while (current != null) {
			// 선택된 학생과 일치하는 경우 if문으로 들어가고
			if (current.student == selectedStudent) {
				// 이중 원형 연결리스트이기 때문에 이전 노드와 다음 노드를 연결하여 제거
				current.prev.next = current.next;
				current.next.prev = current.prev;

				// 삭제된 노드가 head인 경우 head를 다음 노드로 변경
				if (current == head) {
					head = current.next;
				}
				// 삭제된 노드가 tail인 경우 tail을 이전 노드로 변경
				if (current == tail) {
					tail = current.prev;
				}
				System.out.println("[삭제 완료]");
				return;
			}
			current = current.next;
			// 모든 노드를 확인하기 위해 head까지 다시 순회
			if (current == head) {
				break;
			}
		}
	}

	public void searchStu() {
		// 검색 방식 선택
		int input = 0;
		while (true) {
			System.out.println("1.이름 2.최소 성적 3.뒤로 가기");
			input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1: {
				// 이름으로 검색
				searchByName();
				break;
			}
			case 2: {
				// 최소 성적으로 검색
				searchByScore();
				break;
			}
			case 3: {
				return;
			}
			default:
				System.out.println("[잘못된 입력값]");
			}
		}
	}

	// 검색할때 이름으로 검색하는 메소드
	private void searchByName() {
		// 검색 할 학생 이름 입력
		System.out.println("검색할 이름 입력\n> ");
		String targetName = sc.nextLine();

		// 입력한 이름과 동일한 이름의 학생들을 찾고 새로운 리스트에 저장
		// List<Student> foundStudents = studentList.getByName(targetName);
		List<Student> foundStudents = new ArrayList<>();
		Node current = head;
		while (current != null) {
			// 검색할 이름을 비교.
			if (current.student.getName().equals(targetName)) {
				foundStudents.add(current.student);
			}
			// current가 계속 옆으로 이동하면서 검색할 이름을 순회
			current = current.next;
		}

		// 출력
		printStudentList(foundStudents);
	}

	// 검색할때 점수로 검색하는 메소드
	private void searchByScore() {
		// 과목 선택
		int selectSubIndex = selectSubIndex();
		// 선택한 과목의 최소 점수 입력
		System.out.printf("%s의 최소 점수 입력\n> ", Subjects.getName(selectSubIndex));
		int minScore = Integer.parseInt(sc.nextLine());

		// 선택한 과목의 최소 점수를 만족하는 학생들을 찾고 새로운 리스트에 저장
		List<Student> foundStudents = new ArrayList<>();
		Node current = head;
		// current 가 null 이 아닐때까지 반복
		while (current != null) {
			// 선택한 과목이 최소 과목보다 크거나 같은경우
			if (current.student.getScoreByIndex(selectSubIndex) >= minScore) {
				// 추가
				foundStudents.add(current.student);
			}
			// current가 계속 옆으로 이동하면서 검색할 이름을 순회
			current = current.next;
		}
		// 출력
		printStudentList(foundStudents);
	}

	// 전체 출력 메소드
	public void allStu() {
		int input;
		while (true) {
			System.out.println("1.이름 오름차순 2.이름 내림차순 3.성적 오름차순 4.성적 내림차순\n> ");
			input = Integer.parseInt(sc.nextLine());
			if (input < 1 || input > 4) {
				System.out.println("[잘못된 입력값]");
				continue;
			}
			break;
		}

		List<Student> allStuList = new ArrayList<>();
		Node current = head;
		// current가 널이 아닐때까지 옆으로 이동하며 순회
		while (current != null) {
			allStuList.add(current.student);
			current = current.next;
		}

		if (input == 1) {
			StuScoreSorter.sortByName(allStuList);

		} else if (input == 2) {
			StuScoreSorter.sortByName(allStuList, true);

		} else {
			int selectedSortWayIndex = selectSortWayIndex();

			if (input == 3) {
				StuScoreSorter.sortByScore(allStuList, selectedSortWayIndex);

			} else if (input == 4) {
				StuScoreSorter.sortByScore(allStuList, selectedSortWayIndex, true);
			}

		}
		printStudentList(allStuList);
	}

	// studentList 출력하는 메소드
	private void printStudentList(List<Student> stuList) {
		System.out.println("------------------");
		for (Student student : stuList) {
			System.out.println(student);
		}
		if (stuList.size() == 0) {
			System.out.println("[학생 없음]");
		}
		System.out.println("------------------");
	}

	// 학생의 이름을 입력받고 수정하는 메소드
	public Student selectStu() {
		// 학생 선택
		System.out.print("수정할 학생의 이름을 입력\n> ");
		String targetName = sc.nextLine();

		Node current = head;
		List<Student> foundStudents = new ArrayList<>();
		while (current != null) {
			// 학생의 이름과 입력받은 이름을 비교
			if (current.student.getName().equals(targetName)) {
				foundStudents.add(current.student);
			}
			current = current.next;
		}
		Student selectedStudent;

		if (foundStudents.size() == 0) {
			return null;
		} else if (foundStudents.size() > 1) {
			System.out.println("---- 수정할 학생 선택 ----");
			for (int i = 0; i < foundStudents.size(); i++) {
				System.out.printf("(%d): ", i);
				foundStudents.get(i).printInfo();
			}
			System.out.println("> ");
			int stuOption;
			while (true) {
				stuOption = Integer.parseInt(sc.nextLine());
				if (stuOption < 0 || stuOption > foundStudents.size() - 1) {
					System.out.println("[올바르지 못한 옵션 선텍]");
					continue;
				}
				break;
			}
			selectedStudent = foundStudents.get(stuOption); // 옵션에 맞는 학생을 찾음.
		} else {
			selectedStudent = foundStudents.get(0); // 학생을 찾은결과가 한명일때
		}
		return selectedStudent;
	}

	public int selectSubIndex() {
		// 과목 선택
		int subOption;
		while (true) {
			System.out.println("---- 과목 선택 ----");
			System.out.print("1.국어 2.영어 3.수학\n> ");
			subOption = Integer.parseInt(sc.nextLine());
			if (subOption < 1 || subOption > 3) {
				System.out.println("[올바르지 않은 옵션 선택]");
				continue;
			}
			break;
		}
		return subOption - 1; // 배열의 인덱스때문에 -1
	}

	// 성적 정렬 기준 선택
	public int selectSortWayIndex() {
		int subInput;
		while (true) {
			System.out.println("---- 정렬 기준 선택 ----");
			System.out.println("1.국어 2.영어 3.수학 4.총점 5.평균\n> ");
			subInput = Integer.parseInt(sc.nextLine());
			if (subInput < 1 || subInput > 5) {
				System.out.println("[올바르지 못한 옵션 선택]");
				continue;
			}
			break;
		}
		return subInput - 1;
	}

}
