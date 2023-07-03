package test;

public class Study01 {

	public static void main(String[] args) {
		
		System.out.println("First");
		
		Study01 f1 = new Study01(); // 객체 생성
		
		Study01 f2 = new Study01(); // 객체 생성
	}

}

/*
  첫글자를 대문자 : 클래스
  전체 대문자 MAX : 상수(변하지 않는 값) final static int MAX = 1000;
  단어 + 단어 둡번째 단어의 첫글자는 대문자로 씀. black&white => blackWhite
  글자수는 최대 32자
  
*/

/*
  private : 외부에서 절때 접근 불가능.
  default : 같은 패키지까지 접근 가능.
  protected : 외부 패키지를 상속받은 sub class 까지만 접근가능
  public : 아무나 접근가능.
*/

/*
  main method
  - 프로젝트 전체에 하나만 존재하는 함수.
  - 프로그램 시작과 끝을 담당.
*/
