/*
 * 상속
 * 	자바는 100프로 상속구조.
 *  클래스명 extends 상속받는 클래스명.
 *  상속 해주는 클래스 super class
 *  상속 받는 클래스 sub class
 *  코드의 확장. 재사용성, 유지보수의 효율을 높인다.
 *  is ~ A 관계
 *  객체간 다중상속을 허용하지 않는다. 단일상속만 가능
 *  명확하다.
 *  
 *  오버라이딩 -> 다형성
 *  
 *  부모의 메소드중 하나를 자식클래스에서 재정의 (부모에게 상속받은게 맘에 안들때 바꾸고싶을때 사용)
 *  부모의 내용을 변경, 추가해서 사용할수 있게 해준다.
 *  
 */

package test;

class Inher{
	   // 인스턴스 변수 a, b
	   private int a;
	   private int b;
	   
	   // 기본 생성자
	   public Inher() {
	      System.out.println("super class");
	   }
	   // 인자를 받는 생성자
	   public Inher(int i) {
	      System.out.println("super11 class");
	   }
	   // getter setter
	   public int getA() {
	      return a;
	   }
	   public void setA(int a) {
	      this.a = a;
	   }
	   public int getB() {
	      return b;
	   }
	   public void setB(int b) {
	      this.b = b;
	   }
	   
	   
	}

	public class study31_0707 extends Inher{
	   
	   // 기본 생성자
	   public study31_0707() {
	      //super(); //=> 부모의 생성자 호출, subclass의 생성자함수의 첫번째라인에 항상 존재
	      super(10);// 인자를 받는 생성자 호출
	      System.out.println("sub class");
	   }
	   
	   public static void main(String[] args) {
		   study31_0707 in = new study31_0707();
	      
	      in.setA(100);
	      
	      System.out.println(in.getA());
	   }
	}