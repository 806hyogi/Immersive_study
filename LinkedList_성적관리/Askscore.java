package LinkedList;

import java.util.Scanner;

public class Askscore {

   public static void main(String[] args) {

      // 입력 객체 선언
      Scanner sc = new Scanner(System.in);

      // LinkedList의 head노드
      LinkedListImplementation.LinkedList linkedList = new LinkedListImplementation.LinkedList();

      String studentName;
      String inputName;
      int inputNum;
      int studentKor;
      int studentEng;
      int studentMath;

      // 학생 정보 입력 받기
      System.out.println("몇명을 입력할건가요? :");
      inputNum = sc.nextInt();

      for (int i = 0; i < inputNum; i++) {
         // 입력
         System.out.println("학생 이름을 입력하세요: ");
         studentName = sc.next();

         System.out.println("국어 점수를 입력하세요: ");
         studentKor = sc.nextInt();

         System.out.println("영어 점수를 입력하세요: ");
         studentEng = sc.nextInt();

         System.out.println("수학 점수를 입력하세요: ");
         studentMath = sc.nextInt();

         // 이름, 국어, 영어, 수학 점수를 가지는 새로운 객체를 생성합니다.
         AddStudent student = new AddStudent(studentName, studentKor, studentEng, studentMath);

         // LinkedList에 학생 정보를 추가합니다.
         linkedList.add(student);
      }

      // 반복문을 돌려서 계속해서 항목에 맞는 역할을 반복해서 실행할 수 있게 합니다.
      while (true) {
         // 항목 입력
         System.out.println("1.이름검색   2.성적순 검색   3.80점 이상의 모든친구 출력   4.전체출력   5.수정   6.삭제   7.전체 리스트 개수   8.리스트 모두 지우기   9.평균값 오름차순 정렬   10.종료");
         int inputSearchData = sc.nextInt();

         switch (inputSearchData) {
            case 1:
               // 이름 검색
               System.out.println("이름검색: ");
               inputName = sc.next();

               AddStudent searchedStudent = linkedList.searchByName(inputName);
               if (searchedStudent != null) {
                  System.out.println("찾고있는 사람 : " + searchedStudent.getStudentName() + " 입니다.");
               } else {
                  System.out.println("찾고있는 사람이 없습니다.");
               }
               break;

            case 2:
               // 성적순 검색
               System.out.println("검색할 이름을 입력: ");
               inputName = sc.next();
               AddStudent foundStudent = linkedList.searchByName(inputName);
               if (foundStudent != null) {
                  System.out.println(foundStudent);
               } else {
                  System.out.println("학생을 찾을 수 없습니다.");
               }
               break;

            case 3:
               // 80점 이상의 모든 친구 출력
               System.out.println("80점 이상의 친구 출력");
               linkedList.printStudentsAbove80();
               break;

            case 4:
               // 전체 출력
               System.out.println("전체 출력");
               linkedList.printAllStudents();
               break;

            case 5:
               // 수정
               System.out.println("수정하고 싶은 이름을 입력하세요");
               inputName = sc.next();
               AddStudent studentToUpdate = linkedList.searchByName(inputName);

               if (studentToUpdate != null) {
                  System.out.println("새로운 이름을 입력하세요: ");
                  studentToUpdate.setStudentName(sc.next());

                  System.out.println("새로운 국어 점수를 입력하세요: ");
                  studentToUpdate.setScoreStudent1(sc.nextInt());

                  System.out.println("새로운 영어 점수를 입력하세요: ");
                  studentToUpdate.setScoreStudent2(sc.nextInt());

                  System.out.println("새로운 수학 점수를 입력하세요: ");
                  studentToUpdate.setScoreStudent3(sc.nextInt());
                  System.out.println("학생 정보가 수정되었습니다.");
               } else {
                  System.out.println("학생을 찾을 수 없습니다.");
               }
               break;

            case 6:
               // 삭제
               System.out.println("삭제하고 싶은 이름을 입력하세요");
               inputName = sc.next();
               boolean isRemoved = linkedList.remove(inputName);
               if (isRemoved) {
                  System.out.println("학생이 삭제되었습니다.");
               } else {
                  System.out.println("학생을 찾을 수 없습니다.");
               }
               break;

            case 7:
               // 전체 리스트 개수 출력
               System.out.println("전체 리스트의 개수 출력: " + linkedList.size());
               break;

            case 8:
               // 리스트 모두 지우기
               System.out.println("리스트를 모두 지우시겠습니까? (Y/N)");
               String answer = sc.next();

               if (answer.equalsIgnoreCase("Y")) {
                  linkedList.removeAll();
                  System.out.println("리스트를 모두 지웠습니다.");
               } else {
                  System.out.println("리스트 삭제를 취소합니다.");
               }
               break;

            case 9:
               // 평균값 오름차순 정렬
               linkedList.sortNum();
               linkedList.printAllStudents();
               break;

            case 10:
               // 종료
               System.out.println("프로그램을 종료합니다.");
               sc.close();
               System.exit(0);
               break;

            default:
               System.out.println("유효하지 않은 입력입니다. 다시 입력해주세요.");
               break;
         }
      }
   }
}
