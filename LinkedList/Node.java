package LinkedList;

public class Node {
   
   AddStudent student;
    Node next; // node 클랙스 객체인 next 선언

    public Node(AddStudent student) {
        this.student = student; // 노드에 해당 학생정보 저장
        this.next = null; // 다음 노드를 가르키는 next 포인터
    }
}