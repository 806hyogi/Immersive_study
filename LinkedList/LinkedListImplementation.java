package LinkedList;

import java.util.Scanner;

public class LinkedListImplementation {

	public static class LinkedList {
		Node head; // ���� ����Ʈ�� ù ���� ��带 ����Ű�� ��ũ (������) �Դϴ�.
		Node tail; // ���� ����Ʈ�� ������ ��带 ����Ű�� ��ũ (������) �Դϴ�.

		public LinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void add(AddStudent student) { // AddStudent ��ü�� ���ڷ� �޾Ƽ� o
			Node newNode = new Node(student); // ���ο� ��带 �����մϴ�. o
			if (head == null) { // ���Ḯ��Ʈ�� ��� �ִ� ���, o
				head = newNode; // head�� ���ο� ���� ���� o
				tail = newNode; // tail�� ���ο� ���� ���� o
			} else { // ��� ���� ���� ���
				tail.next = newNode; // tail�� next�� ���ο� ���� ���� o
				tail = newNode; // tail�� ���ο� ���� ���� (���ο� ��尡 ���Ϸ� ����) o
			}
		}

		public boolean remove(String studentName) { // �л� �̸��� ���ڷ� �޾Ƽ� �ش� �л��� ���Ḯ��Ʈ���� �����մϴ�.
			Node prevNode = null; // ��� ������
			Node current = head; // ��� ������

			while (current != null) { // head != null�� �ƴҰ�� ������ ��带 ã���ϴ�.
				if (current.student.getStudentName().equals(studentName)) { // ���� �л��̸��� ���ؼ� ã�´�.
					if (prevNode != null) { // ���� ��尡 null�� �ƴҶ�
						prevNode.next = current.next; // ������ ����� ���� ���� ������ ����� ���� ��带 ����(2)
					} else {
						head = current.next; // (ù��° ����� ���) ������ ��带 head�� �����Ų��.
					}
					return true;
				}
				prevNode = current; // head�� preNode�� ���� ���� ����Ŵ (1)
				current = current.next; // ������� ���� �����͸� ����Ų��. (1)
			}

			return false; // false��ȯ
		}

		public AddStudent searchByName(String studentName) { // �л��̸��� ���ڷ� �޾Ƽ�
			Node current = head; // ��� ������

			while (current != null) { // ���� ��尡 ������� ������ �ݺ�
				if (current.student.getStudentName().equals(studentName)) { // �̸��� ��
					return current.student; // �ش� �̸��� �л��� ��ȯ
				}
				current = current.next; // ���� ���� ���� ���� �̵�
			}

			return null;
		}

		public void printAllStudents() {
			Node current = head; // ��� ������

			while (current != null) { // ���� ��尡 ��� ���� ������ �ݺ�
				System.out.println(current.student);
				current = current.next; // ���� ���� ���� ���� �̵�
			}
		}

		public int size() {
			int cnt = 0;
			Node current = head;
			while (current != null) { // ���� ��尡 null�� �ƴҶ�
				cnt++; // ī��Ʈ �����ϸ鼭 ���� ���� �̵�
				current = current.next;

			}
			return cnt;
		}

		public boolean removeAll() { // �Ҹ�Ÿ������ ��ü ���� �޼ҵ带 ���� ��

			Node nextNode = head;

			Node current;

			while (nextNode != null) { // head�� null�� �ƴҰ��
				current = nextNode; 
				nextNode = current.next;
				current.next = null;
			}
			head = null;
			return true; // true ��ȯ
		}

		public void printStudentsAbove80() {
			Node current = head; // ��� ������
			boolean found = false;

			while (current != null) { // ���� ��尡 ��� ���� ������ �ݺ�
				if ((current.student.getStudentKor() >= 80) || (current.student.getStudentEng() >= 80)
						|| (current.student.getStudentMath() >= 80)) {
					System.out.println("80�� �̻��� �л�: " + current.student.getStudentName());
					found = true;
				}
				current = current.next; // ���� ���� ���� ���� �̵�
			}

			if (!found) {
				System.out.println("80�� �̻��� ���� �л��� �����ϴ�.");
			}
		}
	}
}