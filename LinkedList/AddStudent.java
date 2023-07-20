
package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddStudent {

   // �ʵ忡 �̸��� �������� ���� �ʿ��� ���� private �����ϰ�
   private String studentName; // �̸�
   private int studentKor; // ����
   private int studentEng; // ����
   private int studentMath; // ����
   private int sumStudent; // ��
   private int avgStudent; // ��հ�
   private int[] scoreStudent; // ����

   // �����ڿ� �̸��� �������� �Ű������� �޾� ��ü�� �ʱ�ȭ �մϴ�.
   // �ʱ�ȭ �������� scoreStudent 3ũ���� �迭�� �����ǰ� ������ �������� �迭�� ����˴ϴ�.
   public AddStudent(String name, int korea, int english, int math) {
      scoreStudent = new int[3];
      studentName = name;
      scoreStudent[0] = korea;
      scoreStudent[1] = english;
      scoreStudent[2] = math;
   }

   // getter setter
   public String getStudentName() {
      return studentName;
   }

   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }

   public int getStudentKor() {
      return scoreStudent[0]; // ��� ��ȯ
   }

   public void setStudentKor(int studentKor) {
      this.studentKor = studentKor;
   }

   public int getStudentEng() {
      return scoreStudent[1]; // ��� ��ȯ
   }

   public void setStudentEng(int studentEng) {
      this.studentEng = studentEng;
   }

   public int getStudentMath() {
      return scoreStudent[2]; // ������ ��ȯ
   }

   public void setStudentMath(int studentMath) {
      this.studentMath = studentMath;
   }

   // getSumStudent�� �������� ��� ���Ѱ��� ��ȯ����
   public int getSumStudent() {
      return scoreStudent[0] + scoreStudent[1] + scoreStudent[2];
   }

   public void setSumStudent(int sumStudent) {
      this.sumStudent = sumStudent;
   }

   // getAvgStudent�� �������� ���Ѱ��� 3�� �������� ��ȯ�մϴ�.
   public int getAvgStudent() {
      return avgStudent = (scoreStudent[0] + scoreStudent[1] + scoreStudent[2]) / 3;
   }

   // ��, ��, ���� �Ű������� �޾� �ش� �ʵ带 �����մϴ�. 

   public int getScoreStudent1() {
      return scoreStudent[0];
   }
   
   public void setScoreStudent1(int studentKor) {
      this.scoreStudent[0] = studentKor;
   }

   public int getScoreStudent2() {
      return scoreStudent[1];
   }

   public void setScoreStudent2(int studentEng) {
      this.scoreStudent[1] = studentEng;
   }

   public int getScoreStudent3() {
      return scoreStudent[2];
   }

   public void setScoreStudent3(int studentMath) {
      this.scoreStudent[2] = studentMath;
   }
   
   @Override
   public String toString() {
      return "�̸�: " + studentName + ", ����: " + scoreStudent[1] + ", ����: "
      + scoreStudent[1] + ", ����: " + scoreStudent[2] + ", ����: "
      + getSumStudent() + ", ���: " + getAvgStudent();
   }
}

