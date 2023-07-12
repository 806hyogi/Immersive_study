/*
 * fianl
 * ~에 쓰면
 * 1. field -> 상수
 * 2. method -> 오버라이드 금지
 * 3. class -> 상속 금지
 * 
 * ------
 * 제네릭 클래스 = 기능은 똑같은데 타입이 다른것을 해결하려고 하는 것.
 * 타입 제한이 없다. (타입 제한이 없어서 int인데 float도 사용가능하다.)
 * 
 * 제네릭은 객체 타입만 사용가능하다.
 * EX) <int> (x) -> <Integer> (o)
 * 
 * 미결정 타입 = T (나중에 타입을 결정해)
 * 강제 타입 변환이 필요없어짐.
 * 
 * EX) 컵의 근본은 변하지 않지만 안에 뭘 넣느냐에 따라 물컵, 사이다컵이 된다.
 * 
 * import static java.lang.System.out; (println 으로 출력가능)
 * 
 * */


package Test;

public class study38_0711<T>{
	
	public T content; // 타입을 선언해주지 않음.
	
	public static void main(String[] args) {
		
		study38_0711<String> box1 = new study38_0711<String>(); // string으로 타입 입력
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str); // 안녕하세요 출력
		
		study38_0711<Integer> box2 = new study38_0711<Integer>(); // int로 타입 변경
		box2.content = 100;
		int value = box2.content;
		System.out.println(value); // 100 출력
	}
	
}
