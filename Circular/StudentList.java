package Circular;

import java.util.LinkedList;
import java.util.List;


public class StudentList {
	// �÷��� List : ������ �ߺ��� ���, ���������� ���� ���� => �л��� ���� ������ ��� �ν��Ͻ� ����
	private List<Student> students; 
	
	// ������
	public StudentList() {
		students = new LinkedList<Student>();
	}
	
	public int size() {
		return students.size();
	}
	
	public void add(Student stu) {
		students.add(stu);
	}
	
	public void remove(Student stu) {
		students.remove(stu);
	}
	
	public List<Student> getAll(){
		return students;
	}
	
	// �л��� �̸��� �����ͼ� ���� ������� ����Ʈ�� ��ȯ
	public List<Student> getByName(String name){
		List<Student> resultList = new LinkedList<>();
		for(Student student : students) {
			if(student.getName().equals(name)) {
				resultList.add(student);
			}
		}
		return resultList;
	}
	
	// ������ index�� �ּ� ���� �̻��� ���� �л��� ã�� ����� ����Ʈ�� ��ȯ
	public List<Student> getByscoreUp(int subIndex, int minScore){
		List<Student> resultList = new LinkedList<>();
		for(Student student : students) {
			if(student.getScoreByIndex(subIndex) >= minScore) {
				resultList.add(student);
			}
		}
		return resultList;
	}
	
}
