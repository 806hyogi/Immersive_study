package CircularDoubly;

class Node {
	
	Student student;
	Node next;
	Node prev; // ������带 ����Ŵ ��
	
	public Node(Student student) {
		this.student = student;
		this.next = null;
		this.prev = null;
	}
	
}
