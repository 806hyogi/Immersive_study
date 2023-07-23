package Circular;

import java.util.LinkedList;
import java.util.List;


public class StudentList {
	// 컬렉션 List : 원소의 중복을 허용, 순서에따라 원소 유지 => 학생의 정보 데이터 담긴 인스턴스 변수
	private List<Student> students; 
	
	// 생성자
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
	
	// 학생의 이름을 가져와서 비교후 결과값을 리스트로 반환
	public List<Student> getByName(String name){
		List<Student> resultList = new LinkedList<>();
		for(Student student : students) {
			if(student.getName().equals(name)) {
				resultList.add(student);
			}
		}
		return resultList;
	}
	
	// 과목의 index와 최소 점수 이상을 받은 학생을 찾아 결과를 리스트로 반환
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
