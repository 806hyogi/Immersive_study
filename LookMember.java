package miniproject;

//조회를 담당하는 클래스
public class LookMember {

// Addmember 클래스에서 memberAdd(입력정보) 받아오는 코드
private AddMember addMember;
private String member;

public LookMember(AddMember addMember) {
   
   this.addMember = addMember;
     
}

// getter setter
public String getMember() {
   return member;
}

public void setMember(String member) {
   this.member = member;
}

public void lookMember() {

   // 반복하면서 멤버를 출력함
   String[] memberAdd = addMember.getMemberAdd();
   for (int i = 0; i < memberAdd.length; i++) {
      // null값이 있어도 출력되지 않게 함.
      member = memberAdd[i];
      if(member != null) {
         // 등록된 배열값 출력
         System.out.println(member);

      }
   }
}

}