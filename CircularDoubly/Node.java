package CircularDoubly;

class Node {
	
	Student student;
	Node next;
	Node prev; // 이전노드를 가리킴 ★
	
	public Node(Student student) {
		this.student = student;
		this.next = null;
		this.prev = null;
	}
	
}
