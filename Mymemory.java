package 동적바인딩;

abstract class Mymemory {

	// 필드
	private int[] stackArray;
	int top;

	// 생성자
	public Mymemory(int size) {

		stackArray = new int[size];
		top = -1;
	}

	// getter setter
	public int[] getStackArray() {
		return stackArray;
	}

	public void setStackArray(int[] stackArray) {
		this.stackArray = stackArray;
	}

	public void push(int value) {

		if (top == stackArray.length - 1) {
			System.out.println("스택이 가득찼습니다.");
			return;
		}

		stackArray[++top] = value;
		System.out.println("푸시: " + value + " 이 되었습니다.");
	}

	public abstract int pop(); // 추상메소드
}