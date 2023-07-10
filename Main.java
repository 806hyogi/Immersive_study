package 동적바인딩;

import java.util.Scanner;

public class Main {

	public void pushpop(Mymemory memory) {

		Scanner scanner = new Scanner(System.in);
		boolean onoff = true;

		while (onoff) {

			System.out.println("1.pop 2.push 3.exit");
			int inputData2 = scanner.nextInt();

			switch (inputData2) {

			case 1:
				memory.pop();
				System.out.println("pop 되었습니다.");

				System.out.println(memory);
				continue;
			case 2:
				System.out.println("push할 값을 입력하세요.");
				int inputData4 = scanner.nextInt();

				memory.push(inputData4);
				System.out.println("push 되었습니다.");

				System.out.println(memory);
				continue;
			case 3:
				System.out.println("종료 되었습니다.");
				onoff = false;
				break;

			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Main main = new Main();

		System.out.println("1.Stack  2.queue");

		int inputData = scanner.nextInt();

		switch (inputData) {

		case 1:
			System.out.println("1번 스택을 누르셨습니다.");
			Mystack stack = new Mystack(5);
			main.pushpop(stack);
			break;

		case 2:
			System.out.println("2번 큐를 누르셨습니다.");
			Myque que = new Myque(5);
			main.pushpop(que);
			break;

		}

	}

}