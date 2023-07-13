/*
 * 오늘 할일 책에있는 모든 예제 따라쓰고 주석처리하기
 * 
 * 멀티 태스킹
 * 프로세스란 운영체제에서 실행중인 하나의 프로그램을 말한다.
 * 멀티 프로세스란 두개 이상의 프로세스가 실행되는 것을 말한다.
 * 멀티 태스킹이란 두개 이상의 프로세스를 실행하여 일을 처리하는 것을 말한다.
 * 
 * 멀티 스레드(작은 프로세스) 
 * 
 * 독립적으로 동작함
 * 
 * 스레드란 프로세스 내에서 실행되는 세부 작업 단위이다.
 * 멀티 스레드란 하나의 프로세스에서 여러 개의 스레드가 ★병행적으로 처리되는 것을 말한다.
 * 
 * 스레드의 생명주기
 * 스레드는 tread 객체가 생성되면 생명주기를 갖게 되는데 크게 5가지로 나누게 된다.
 * new - 스레드가 만들어진 상태.
 * Runnable - 스레드 객체가 생성된 후에 start() 메서드를 호출하면 runnable 상태로 이동하게 된다.
 * Running - Runnable 상태에서 스레드 스케줄러에 의해 Running 상태로 이동하게된다.
 * Blocked - 스레드가 다른 특정한 이유로 Running 상태에서 Blocked 상태로 이동하게 된다.
 * Dead - 스레드가 종료되면 그 스레드는 다시 시작할 수 없게 된다.
 * 
 * 스레드의 생성 방법
 * Tread 클래스를 상속 받는 방법
 * runnable 인터페이스를 구현하는 방법
 * 
 * new 쓰레드라고 쓰는 즉시 쓰레드라고 할 수 있다.
 * 
 * 
 * 
 */

public class Study42_0713 extends Thread { // implements Runnable

	private int [] temp;
	
	public Study42_0713(String threadname) {
		super(threadname);
		
		temp = new int[10];
		for(int start = 0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.printf("스레드 이름 : %s ,",currentThread().getName()); // 쓰레드에 저장되있는 이름을 가져옴 
			System.out.printf("temp value : %d %n", start);
		}
	}
	
	
	public static void main(String[] args) {
		Study42_0713 st = new Study42_0713("첫번째");
		st.start();		
		
	}

}

