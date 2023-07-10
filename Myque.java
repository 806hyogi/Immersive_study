package 동적바인딩;

public class Myque extends Mymemory {

	public Myque(int size) {
		super(size);

	}

	@Override
	public int pop() {

		if (top == -1) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}

		int poppedValue = getStackArray()[0]; // 큐에서 제거된 요소 저장
		for (int i = 0; i < top; i++) { // push로 요소가 추가될 때마다 증가
			getStackArray()[i] = getStackArray()[i + 1]; // 요소를 한칸씩 앞으로 이동시킨다.
		}
		top--; // 큐에서 요소가 제거됨

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
