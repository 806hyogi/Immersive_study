
// 이방법을 많이씀 
public class Study43 implements Runnable { // implements Runnable

	private int [] temp;
	
	public Study43() {
		//super(threadname); // 사용안됨
		temp = new int[10];
		for(int start = 0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	
	@Override
	public void run() {
		
		for(int start : temp) {
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.printf("스레드 이름 : %s ,",Thread.currentThread().getName()); // 
			System.out.printf("temp value : %d %n", start);
		}
	}
	
	
	public static void main(String[] args) {
		Study43 st = new Study43();
		//st.start();		

// 첫번째 방법
//		Thread th = new Thread(st);
//		th.setName("첫번째");
//		th.start();

// 두번째 방법
		Thread th = new Thread(st, "첫번째");
		th.start();
	}

}

