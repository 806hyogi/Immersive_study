/*
 *  스레드의 스케줄링 우선순위
 *  
 *  동기화
 *  동기화 방법
 * 
 * 	공정, 기아, 교착상태 발생하지 않게끔 처리를 해줘야한다.
 * 
 * 	
*/

class ATM implements Runnable {

	private long depositeMoney = 10000;
	boolean isSonTurn = true;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if (getDepositeMoney() <= 0)
					break;
				
				if(isSonTurn) {
					if(Thread.currentThread().getName().equals("son")) {
						withDraw(1000);
						isSonTurn = false;
					}
				}
				else {
					if(Thread.currentThread().getName().equals("mother")) {
						withDraw(1000);
						isSonTurn = true;
					}
					
				}
				
			}
		}
	}
	
	public void withDraw(long howMuch) {
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
			
		}else {
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}

	}
	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	public class study44 {
		public static void main(String[] args) {
			
				ATM atm = new ATM();
			for(int i = 0; i < 10; i++) {
				Thread mother = new Thread(atm, "mother");
				Thread son = new Thread(atm, "son");
			
				son.start();
				mother.start();
			}
		}
	}

}
