package LinkedList;

public class Node {
   
   AddStudent student;
    Node next; // node Ŭ���� ��ü�� next ����

    public Node(AddStudent student) {
        this.student = student; // ��忡 �ش� �л����� ����
        this.next = null; // ���� ��带 ����Ű�� next ������
    }
}