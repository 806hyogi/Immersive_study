package LinkedList;

import java.util.Scanner;

public class LinkedListImplementation {

	public static class LinkedList {
		Node head; // 연결 리스트의 첫 번재 노드를 가리키는 링크 (포인터) 입니다.
		Node tail; // 연결 리스트의 마지막 노드를 가리키는 링크 (포인터) 입니다.

		public LinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void add(AddStudent student) { // AddStudent 객체를 인자로 받아서 o
			Node newNode = new Node(student); // 새로운 노드를 생성합니다. o
			if (head == null) { // 연결리스트가 비어 있는 경우, o
				head = newNode; // head를 새로운 노드로 설정 o
				tail = newNode; // tail을 새로운 노드로 설정 o
			} else { // 비어 있지 않은 경우
				tail.next = newNode; // tail의 next에 새로운 노드로 설정 o
				tail = newNode; // tail을 새로운 노드로 설정 (새로운 노드가 테일로 변경) o
			}
		}

		public boolean remove(String studentName) { // 학생 이름을 인자로 받아서 해당 학생을 연결리스트에서 삭제합니다.
			Node prevNode = null; // 노드 포인터
			Node current = head; // 노드 포인터

			while (current != null) { // head != null이 아닐경우 삭제할 노드를 찾습니다.
				if (current.student.getStudentName().equals(studentName)) { // 삭제 학생이름을 비교해서 찾는다.
					if (prevNode != null) { // 이전 노드가 null이 아닐때
						prevNode.next = current.next; // 삭제할 노드의 이전 노드와 삭제할 노드의 다음 노드를 연결(2)
					} else {
						head = current.next; // (첫번째 노드인 경우) 삭제할 노드를 head에 연결시킨다.
					}
					return true;
				}
				prevNode = current; // head와 preNode는 같은 곳을 가리킴 (1)
				current = current.next; // 현재노드는 삭제 데이터를 가리킨다. (1)
			}

			return false; // false반환
		}

		public AddStudent searchByName(String studentName) { // 학생이름을 인자로 받아서
			Node current = head; // 노드 포인터

			while (current != null) { // 현재 노드가 비어있지 않으면 반복
				if (current.student.getStudentName().equals(studentName)) { // 이름을 비교
					return current.student; // 해당 이름의 학생을 반환
				}
				current = current.next; // 현재 노드는 다음 노드로 이동
			}

			return null;
		}

		public void printAllStudents() {
			Node current = head; // 노드 포인터

			while (current != null) { // 현재 노드가 비어 있지 않으면 반복
				System.out.println(current.student);
				current = current.next; // 현재 노드는 다음 노드로 이동
			}
		}

		public int size() {
			int cnt = 0;
			Node current = head;
			while (current != null) { // 현재 노드가 null이 아닐때
				cnt++; // 카운트 증가하면서 다음 노드로 이동
				current = current.next;

			}
			return cnt;
		}

		public boolean removeAll() { // 불린타입으로 전체 삭제 메소드를 구현 ★

			Node nextNode = head;

			Node current;

			while (nextNode != null) { // head가 null이 아닐경우
				current = nextNode; 
				nextNode = current.next;
				current.next = null;
			}
			head = null;
			return true; // true 반환
		}

		public void printStudentsAbove80() {
			Node current = head; // 노드 포인터
			boolean found = false;

			while (current != null) { // 현재 노드가 비어 있지 않으면 반복
				if ((current.student.getStudentKor() >= 80) || (current.student.getStudentEng() >= 80)
						|| (current.student.getStudentMath() >= 80)) {
					System.out.println("80점 이상의 학생: " + current.student.getStudentName());
					found = true;
				}
				current = current.next; // 현재 노드는 다음 노드로 이동
			}

			if (!found) {
				System.out.println("80점 이상을 받은 학생이 없습니다.");
			}
		}
	}
}