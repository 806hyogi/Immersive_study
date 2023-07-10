package 동적바인딩;

public class Mystack extends Mymemory {

	public Mystack(int size) {
		super(size); // 상위 클래스의 생성자 호출
	}

	@Override
	public int pop() {

		if (top == -1) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}

		int poppedValue = getStackArray()[top--];
		System.out.println("팝 된 값: " + poppedValue + "가 되었습니다.");
		return poppedValue;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Stack contents: [");
		for (int i = 0; i <= top; i++) {
			sb.append(getStackArray()[i]);
			if (i != top) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}