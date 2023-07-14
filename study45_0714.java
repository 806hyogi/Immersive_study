// 눈에 거슬리는 부분 

public class study45_0714 {

	// to string을 불러서 반환값을 바꿔주면 됨.
	@Override
	public String toString() {
        return "it's me";
    }
	
	
	public static void main(String[] args) {
		
		String s = "superman"; // string object	
		System.out.println(s.toString()); // s를 출력하고자 할때 toString()이 존재함.
		
		// 객체 출력
		study45_0714 t = new study45_0714(); // object안에 있는 tostring을 부른다.
		System.out.println(t.toString());
		

	}
 }
