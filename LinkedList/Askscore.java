package LinkedList;

import java.util.Scanner;

public class Askscore {

	public static void main(String[] args) {

		// �Է� ��ü ����
		Scanner sc = new Scanner(System.in);

		// LinkedList�� head���
		Node head = null;
		Node tail = null;

		String studentName;
		String inputName;
		int inputNum;
		int studentKor;
		int studentEng;
		int studentMath;

		// �л� ���� �Է� �ޱ�
		System.out.println("����� �Է��Ұǰ���? :");
		inputNum = sc.nextInt();

		for (int i = 0; i < inputNum; i++) {
			// �Է�
			System.out.println("�л� �̸��� �Է��ϼ���: ");
			studentName = sc.next();

			System.out.println("���� ������ �Է��ϼ���: ");
			studentKor = sc.nextInt();

			System.out.println("���� ������ �Է��ϼ���: ");
			studentEng = sc.nextInt();

			System.out.println("���� ������ �Է��ϼ���: ");
			studentMath = sc.nextInt();

			// �̸�, ����, ����, ���� ������ ������ ���ο� ��ü�� �����մϴ�.
			AddStudent student = new AddStudent(studentName, studentKor, studentEng, studentMath);

			// ���ο� Node�� �����Ͽ� LinkedList�� �߰��մϴ�.
			Node newNode = new Node(student);

			// ���ο� Node�� LinkedList�� �߰��մϴ�.
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		// �ݺ����� ������ ����ؼ� �׸� �´� ������ �ݺ��ؼ� �����Ҽ� �ְ� �մϴ�.
		while (true) {

			// �׸� �Է�
			System.out.println("1.�̸��˻�   2.������ �˻�   3.80�� �̻��� ���ģ�� ���   4.��ü���   5.����   6.����   7.��ü ����Ʈ ����");
			int inputSearchData = sc.nextInt();

			switch (inputSearchData) {

			case 1:
				// �̸� �˻�
				System.out.println("�̸��˻�: ");
				inputName = sc.next();

				boolean found = false;

				// LinkedList�� ������ ���ʷ� ��ȸ�ϸ鼭 ���ϴ� ���� �̸��� �˻��մϴ�.
				Node current = head;
				while (current != null) {

					// �Էµ� �̸��� LinkedList�� �̸� ���� ���ϰ� ��ġ�ϸ� �̸��� ����մϴ�.
					if (inputName.equals(current.student.getStudentName())) {
						System.out.println("ã���ִ� ��� : " + current.student.getStudentName() + " �Դϴ�.");
						found = true;
						break;
					}
					current = current.next;
				}
				// found�� �ƴϸ� ã���ִ� ����� ���ٰ� ����ó���� ���ݴϴ�.
				if (!found) {
					System.out.println("ã���ִ� ����� �����ϴ�.");
				}
				break;

			case 2:
				// ������ �˻�
				String findStudentName;
				System.out.println("�˻��� �̸��� �Է�: ");
				findStudentName = sc.next();
				found = false;

				// LinkedList�� ��ȸ�ϸ鼭 ã���ִ� �̸��� ��ġ�ϴ� ���� ����մϴ�.
				current = head;
				while (current != null) {

					// ã���ִ� �̸��� �Է¹��� ���� arraylist�� �̸����� ���ϰ� ����մϴ�.
					if (findStudentName.equals(current.student.getStudentName())) {
						// to string ���
						System.out.println(current.student);
						found = true;
						break;
					}
					current = current.next; // ��� next�� �̵��ϸ鼭 ������带 ã���ϴ�.
				}

				if (!found) {
					System.out.println("�л��� ã�� �� �����ϴ�.");
				}
				break;

			case 3:
				// 80�� �̻��� ��� ģ�� ���
				System.out.println("80�� �̻��� ģ�� ���");
				found = false;

				// LinkedList�� ��ȸ�ϸ鼭 ����, ����, ���� ���� �� 80�� �̻��� �л��� ����մϴ�.
				current = head;
				while (current != null) {
					if ((current.student.getStudentKor() >= 80) || (current.student.getStudentEng() >= 80)
							|| (current.student.getStudentMath() >= 80)) {
						System.out.println("80�� �̻��� �л�: " + current.student.getStudentName());
						found = true;
					}
					current = current.next; // ���� ������� next�� �̿��Ͽ� ��带 ��ȸ�մϴ�.
				}

				if (!found) {
					System.out.println("80�� �̻��� ���� ģ���� �����ϴ�.");
				}
				break;

			case 4:
				// ��ü ���
				System.out.println("��ü ���");

				// LinkedList�� �ִ� ��� �л� ������ ����մϴ�.
				current = head; // ��带 ���� ���� �ΰ�
				while (current != null) { // ���� ��尡 null�� �ƴҰ�� �ݺ��� �մϴ�.
					System.out.println(current.student); // �ݺ��ϸ鼭 �л��� ������ ����մϴ�.
					current = current.next;
				}

				break;

			case 5:
				// ����
				// �����ϰ� ���� �̸��� �Է¹ް� list���� �´� �̸��� ��ġ�ϸ� set���� ���� �����մϴ�.
				String remakeName;
				System.out.println("�����ϰ� ���� �̸��� �Է��ϼ���");
				remakeName = sc.next();

				current = head; // ���� ������� ���� ��忡 ��带 �ΰ� ��ȸ�մϴ�.
				while (current != null) {
					if (remakeName.equals(current.student.getStudentName())) {
						System.out.println("���ο� �̸��� �Է��ϼ���: ");
						current.student.setStudentName(sc.next());

						System.out.println("���ο� ���� ������ �Է��ϼ���: ");
						current.student.setScoreStudent1(sc.nextInt());

						System.out.println("���ο� ���� ������ �Է��ϼ���: ");
						current.student.setScoreStudent2(sc.nextInt());

						System.out.println("���ο� ���� ������ �Է��ϼ���: ");
						current.student.setScoreStudent3(sc.nextInt());
						break;
					}
					current = current.next;
				}
				break;

			case 6:
				// ����
				String DeleteName;
				System.out.println("�����ϰ� ���� �̸��� �Է��ϼ���");
				DeleteName = sc.next();

				Node prevNode = null;
				current = head; // ��带 ���� ��忡 �ְ�
				while (current != null) { // ���� ��尡 null�� �ƴҵ��� �ݺ����� �����ϴ�.
					if (current.student.getStudentName().equals(DeleteName)) { // �Է��� �̸��� ���ؼ�
						if (prevNode != null) { // ���� ��尡 ������� ���� ���
							prevNode.next = current.next; // ���� ��� ������带 ���� ����� ������忡 �ֽ��ϴ�.
						} else { // ���������
							head = current.next; // ���� ����� ������带 head�� �����մϴ�.
						}
						System.out.println("�л��� �����Ǿ����ϴ�.");
						break;
					}
					prevNode = current; // �����带 ������忡 �ְ�
					current = current.next; // �������� ������带 ���� ���� �ٲߴϴ�.
				}

				if (current == null) {
					System.out.println("�л��� ã�� �� �����ϴ�.");
				}
				break;

			case 7:
				// ��ü ����Ʈ ���� ���
				current = head;
				int count = 0;
				while (current != null) { // �ݺ������� ���� ��带 ��ȸ�ϸ鼭 
					count++; // count ���� �ø��ϴ�.
					current = current.next;
				}
				System.out.println("��ü ����Ʈ�� ���� ���: " + count);
				break;

			case 8:
				// ����Ʈ ��� �����
				System.out.println("����Ʈ�� ��� ����ðڽ��ϱ�? (Y/N)");
				String answer = sc.next();

				if (answer.equalsIgnoreCase("Y")) {
					head = null; // head�� null�� �����Ͽ� ��ü ����Ʈ�� ���ϴ�.
					System.out.println("����Ʈ�� ��� �������ϴ�.");
				} else {
					System.out.println("����Ʈ ������ ����մϴ�.");
				}
				break;
			}
		}
	}
}
