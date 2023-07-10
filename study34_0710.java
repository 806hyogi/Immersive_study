package test;

/*하나의 클래스
정규직 비정규직 부서...

정규직의 클래스..

has ~ a /is ~ a

동적바인딩 정적바인딩
엡스트렉트를 쓰는 이유(추상메서드)
->강제성을 부여함
(무조건 오버라이딩!)//안하면 추상메서드화 되어버림
*/
abstract class Area {
   public abstract void disp();
   public abstract void draw();
}

class Tri extends Area {


	public void draw() {
		System.out.println("Tri");
	}
	
   @Override
   public void disp() {
      
      
   }

	
}

class Circle extends Area {
	
   public void draw() {
      System.out.println("Cir");
   }

   @Override
   public void disp() {
      // TODO Auto-generated method stu
      
   }
}

class Rect extends Area {
   public void draw() {
      System.out.println("Rect");
   }

   @Override
   public void disp() {
      
      
   }
}

public class study34_0710 {

   public static void main(String[] args) {

      // 정적바인딩 : 내 객체를 접근할 수 있는 레퍼런스 객체를 접근하는 방식
      Tri tri = new Tri();
      Circle circle = new Circle();
      Rect rect = new Rect();
      
      
      tri.draw();
      circle.draw();
      rect.draw();
      
   }

}