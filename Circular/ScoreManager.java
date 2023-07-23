package Circular;

import java.util.List;
import java.util.*;

public class ScoreManager {
	Scanner sc = new Scanner(System.in);
	private Node head; // ���� ���� ����Ʈ�� ���� ���
	
	// ������
	public ScoreManager() {
		head = null;
		
	}
	
	// �л� ���
	public void addStu() {
		// �߰��� �л� �ν��Ͻ� ����
		Student tempStu = new Student();
		
		// �л� �̸� �Է�
		System.out.print("�̸��� �Է��ϼ���\n> ");
		tempStu.setName(sc.nextLine());
		
		// ���� �Է�
		int[] tempScores = new int[3];
		for(int i = 0; i < tempScores.length; i++) {
			System.out.print(Subjects.getName(i) + "������ �Է�\n> " );
			tempScores[i] = Integer.parseInt(sc.nextLine());
		}
		tempStu.setScores(tempScores);
		
		// ���ο� ��� ���� ��
        Node newNode = new Node(tempStu);
        
        // ���ο� ��带 ����Ʈ�� �� �տ� �߰� ��
        newNode.next = head;
        head = newNode;
		
		System.out.print("\"" + tempStu.getName() + "\"" + "�߰� �Ϸ� \n");
	}
	
	// �л� ����
	public void changeStu() {
		
		// �л��� �Ѹ� ������ ��
		if(head == null) {
			System.out.println("[�л��� �Ѹ� �����ϴ�]");
			return;
		}
		
		// �л� �Ѹ� ����
		Student selectedStudent = selectStu();
		if(selectedStudent == null) {
			System.out.print("[�ش� �л� ����]\n");
			return;
		}
		
		// ���� ����
		int selectSubIndex = selectSubIndex();
		
		// ������ ������ ������ ���� �Է�
		System.out.print("������ ����\n> ");
		int newScore = Integer.parseInt(sc.nextLine());
		
		// ������ ������ ������ �Է��� ������ ����
		selectedStudent.setScoreByIndex(selectSubIndex, newScore);
		System.out.println("���� �Ϸ�");
	}
	
	// �л� ���� �޼ҵ�
	public void deleteStu() {
		// �л��� �Ѹ� ���� �� ��
		if(head == null) {
			System.out.println("[������ �л� ����]");
			return;
		}
		
		// �л� �Ѹ� ����
		Student selectedStudent = selectStu();
		if(selectedStudent == null) {
			System.out.println("[�ش� �л� ����]\n");
			return;
		}
		
		// ������ �л� ����Ʈ���� ���� ��
		Node prev = null;
		Node current = head;
		while(current != null) {
			// student Ŭ���� �л��� ���õ� �л��� ��ġ�ϸ�
			if(current.student == selectedStudent) {
				// ���� ����� prev�� null�϶�
				if(prev == null) {
					// current ������带 head�� ����Ű��
					head = current.next;
				// null�� �ƴѰ��
				}else {
					// current�� �ǳʶٰ� ����Ų��.
					prev.next = current.next;
				}
				System.out.println("[���� �Ϸ�]");
				return;
			}
			// ���� ��带 ���� �Ѵ�.
			prev = current;
			current = current.next;
		}
	}
	
	public void searchStu() {
		// �˻� ��� ����
		int input = 0;
		while(true) {
			System.out.println("1.�̸� 2.�ּ� ���� 3.�ڷ� ����");
			input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1: {
				// �̸����� �˻�
				searchByName();
				break;
			}
			case 2: {
				// �ּ� �������� �˻�
				searchByScore();
				break;
			}
			case 3: {
				return;
			}
			default:
				System.out.println("[�߸��� �Է°�]");
			}
		}
	}
	
	// �˻��Ҷ� �̸����� �˻��ϴ� �޼ҵ�
	private void searchByName() {
		// �˻� �� �л� �̸� �Է�
		System.out.println("�˻��� �̸� �Է�\n> ");
		String targetName = sc.nextLine();
		
		// �Է��� �̸��� ������ �̸��� �л����� ã�� ���ο� ����Ʈ�� ���� ��
		//List<Student> foundStudents = studentList.getByName(targetName);
		List<Student> foundStudents = new ArrayList<>();
		Node current = head;
		while(current != null) {
			// �˻��� �̸��� ��.
			if(current.student.getName().equals(targetName)) {
				foundStudents.add(current.student);
			}
			// current�� ��� ������ �̵��ϸ鼭 �˻��� �̸��� ��ȸ
			current = current.next;
		}
		
		// ���
		printStudentList(foundStudents);
	}
	
	// �˻��Ҷ� ������ �˻��ϴ� �޼ҵ�
	private void searchByScore() {
		// ���� ����
		int selectSubIndex = selectSubIndex();
		// ������ ������ �ּ� ���� �Է�
		System.out.printf("%s�� �ּ� ���� �Է�\n> ", Subjects.getName(selectSubIndex));
		int minScore = Integer.parseInt(sc.nextLine());
		
		// ������ ������ �ּ� ������ �����ϴ� �л����� ã�� ���ο� ����Ʈ�� ���� ��
		List<Student> foundStudents = new ArrayList<>();
	    Node current = head;
	    // current �� null �� �ƴҶ����� �ݺ�
	    while (current != null) {
	    	// ������ ������ �ּ� ���񺸴� ũ�ų� �������
	        if (current.student.getScoreByIndex(selectSubIndex) >= minScore) {
	        	// �߰�
	            foundStudents.add(current.student);
	        }
	        // current�� ��� ������ �̵��ϸ鼭 �˻��� �̸��� ��ȸ
	        current = current.next;
	    }
		// ���
		printStudentList(foundStudents);
	}
	
	// ��ü ��� �޼ҵ�
	public void allStu() {
		int input;
		while (true) {
			System.out.println("1.�̸� �������� 2.�̸� �������� 3.���� �������� 4.���� ��������\n> ");
			input = Integer.parseInt(sc.nextLine());
			if(input < 1 || input > 4) {
				System.out.println("[�߸��� �Է°�]");
				continue;
			}
			break;
		}
		// ��
		 List<Student> allStuList = new ArrayList<>();
		    Node current = head;
		    // current�� ���� �ƴҶ����� ������ �̵��ϸ� ��ȸ
		    while (current != null) {
		        allStuList.add(current.student);
		        current = current.next;
		    }
		
		if(input == 1) {
			StuScoreSorter.sortByName(allStuList);
			
		}else if (input == 2) {
			StuScoreSorter.sortByName(allStuList, true);
			
		}else {
			int selectedSortWayIndex = selectSortWayIndex();
			
			if(input == 3) {
				StuScoreSorter.sortByScore(allStuList, selectedSortWayIndex);
				
			}else if (input == 4) {
				StuScoreSorter.sortByScore(allStuList, selectedSortWayIndex, true);
			}
			
		}
		printStudentList(allStuList);
	}
	
	// studentList ����ϴ� �޼ҵ�
	private void printStudentList(List<Student> stuList) {
		System.out.println("------------------");
		for(Student student : stuList) {
			System.out.println(student);
		}
		if(stuList.size() == 0) {
			System.out.println("[�л� ����]");
		}
		System.out.println("------------------");
	}
	
	// �л��� �̸��� �Է¹ް� �����ϴ� �޼ҵ�
	public Student selectStu() {
		// �л� ����
		System.out.print("������ �л��� �̸��� �Է�\n> ");
		String targetName = sc.nextLine();
		
		// ��
		Node current = head;
	    List<Student> foundStudents = new ArrayList<>();
	    while (current != null) {
	    	// �л��� �̸��� �Է¹��� �̸��� ��
	        if (current.student.getName().equals(targetName)) {
	            foundStudents.add(current.student);
	        }
	        current = current.next;
	    }
	    Student selectedStudent;
		
		if(foundStudents.size() == 0) {
			return null;
		}else if (foundStudents.size() > 1) {
			System.out.println("---- ������ �л� ���� ----");
			for(int i = 0; i < foundStudents.size(); i++) {
				System.out.printf("(%d): ", i);
				foundStudents.get(i).printInfo();
			}
			System.out.println("> ");
			int stuOption;
			while(true) {
				stuOption = Integer.parseInt(sc.nextLine());
				if(stuOption < 0 || stuOption > foundStudents.size() -1) {
					System.out.println("[�ùٸ��� ���� �ɼ� ����]");
					continue;
				}
				break;
			}
			selectedStudent = foundStudents.get(stuOption); // �ɼǿ� �´� �л��� ã��.
		}else {
			selectedStudent = foundStudents.get(0); // �л��� ã������� �Ѹ��϶�
		}
		return selectedStudent;
	}
	
	public int selectSubIndex() {
		// ���� ����
		int subOption;
		while(true) {
			System.out.println("---- ���� ���� ----");
			System.out.print("1.���� 2.���� 3.����\n> ");
			subOption = Integer.parseInt(sc.nextLine());
			if(subOption < 1 || subOption > 3) {
				System.out.println("[�ùٸ��� ���� �ɼ� ����]");
				continue;
			}
			break;
		}
		return subOption -1; // �迭�� �ε��������� -1
	}

	// ���� ���� ���� ����
	public int selectSortWayIndex() {
		int subInput;
		while(true) {
			System.out.println("---- ���� ���� ���� ----");
			System.out.println("1.���� 2.���� 3.���� 4.���� 5.���\n> ");
			subInput = Integer.parseInt(sc.nextLine());
			if(subInput < 1 || subInput > 5) {
				System.out.println("[�ùٸ��� ���� �ɼ� ����]");
				continue;
			}
			break;
		}
		return subInput - 1;
	}
	
	
}
