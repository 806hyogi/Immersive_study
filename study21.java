/*
 
 클래스의 구성요소
 1. field (필드)
 	객체 생성후 지속적으로 사용하고자 하는 데이터 저장하는 역할.
 	접근지정자 주로 private으로 지정합니다.
 	
 2. method (메소드)
 	인스턴스메소드(instance method) 객체를 생성한 후 사용할수 있는 메소드
 		매게변수의 첫번째 매개변수 this를 가지고 있다.
 		의미상 객체당 하나씩 가지고 있는 의미가 성립.
 		
 	스태틱메소드(static method) 객체의 생성여부 상관없이 사용할수 있는 메소드
 		this를 가지고 있지 않다.
 		목적 : 같은 타입의 모든 객체가 공유하는 의미.
 	
 	메소드의 주목적 : 외부와 내부를 연결시켜주는 역할.
 	메소드는 접근 지정자를 주로 public으로 지정.
 	오버로딩이 가능
 	
 3. construtor (생성자)
 	객체 생성시 자동 호출되어지는 함수
 	생성자함수를 명시적으로 만들지 않을 경우 디폴트 생성자를 제공한다.
 	
 	기능 : 디폴트 기능 -> 객체 등록.
 		  개발자 -> 겍체 생성시 필드 초기화
 		  
 	주로 public으로 지정
 	오버로딩이 가능
 	------------(밑에 아직정리안함)
 	<객체 실습>
*/

package test;

public class study21 {

  // 생성자 정의
	// 생성자를 제공하지 않을경우 내부적으로 제공하는 생성자 : 디폴트생성자
	// 명시적으로 생성자를 만들경우 디폴트 생성자는 제공되지 않음.
	// 리턴타입이 존재하지 않고 함수명도 클래스명과 동일해야함.
  
  // 필드
	private int a;
	
	public study21() { // 생성자는 소문자시작 (명명규칙)
		System.out.println("디폴트생성자");
	}
	
	public int getA() { // 게터 getter (가져오는 함수)
		return a;
	}
	
	public void setA(int aa) { // 새터 setter (넣는함수)
		a = aa;
	}
	
	public static void main(String[] args) { // 외부
		
		study21 ce = new study21(); // 생성자 호출
		study21 ce2 = new study21(); // 생성자 호출

		System.out.println(ce.a); // 바로 a로 출력하면 에러.
		System.out.println(ce2.a);
		
//		ce.a = 100;
//		ce2.a = 200;
		
		ce.setA(100);
		ce2.setA(200);
		
		System.out.println(ce.getA());
		System.out.println(ce2.getA());
	}

}
