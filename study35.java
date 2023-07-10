//package test;
//
///*
// * 1. 동적바인딩
// * - 부모의 레퍼런스로 자식의 객체를 접근하는 방식
// * - 부모의 멤버를 인식함으로써 부모가 가지고 있는 멤버만 접근할 수 있다.
// * 
// */
//
//abstract class Area{
//   //추상메소드
//   public abstract void disp();
//   public abstract void draw();
//}
//
//class Tri extends Area{
//   @Override
//   public void draw() {
//      System.out.println("Tir");
//   }
//   @Override
//   public void disp() {
//      
//   }
//   
//}
//class Cir extends Area{
//   public void draw() {
//      System.out.println("Cir");
//   }
//
//   @Override
//   public void disp() {
//      // TODO Auto-generated method stub
//      
//   }
//}
//class Rect extends Area{
//	// 부모객체 추상메소드로 되어있다.
//   public void draw() {
//      System.out.println("Rect");
//   }
//
//   @Override
//   public void disp() {
//      
//   }
//   
//   public void aaa() {
//      System.out.println("aaa");
//   }
//}
//
//public class study35 {
//
//   public static void main(String[] args) {
//      // TODO Auto-generated method stub
////      //정적바인딩 = 내 객체를 접근할 수 있는 레퍼런스 객체를 접근하는 방식
//      Tri tri = new Tri();
//      Cir cir = new Cir();
//      Rect rect = new Rect();
//      //정적 바인딩 = 무보의 레퍼런스 객체로 자식의 객체에 접근 하는 방식, 부모가 가지고 있는 멤버일떄만 가능
//      Area area;
//      area = tri;
//
//      area.draw();
//      tri.draw();
//      
//      area = cir;
//      cir.draw();
//      area.draw();
//      
//      area = rect;
//      rect.draw();
//      area.draw();
//      //area.aaa(); // 부모객체 -> 자식객체 
//   }
//
//}