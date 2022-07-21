package ch22;

class Bank{    
	private int money = 10000;
	
	public synchronized void saveMoney(int save) {      //방법1  // 메서드를 사용하는 동안 bank의 리소스(공유되는 리소스)를 사용한다
		int m = getMoney();                  // 이 메서드를 사용하는 동안 다른 메서드가 들어오면 안된다 왜냐하면 공유 리소스 이기 때문이다
		                                     //synchronized는 어떤 쓰레드가 이메서드를 사용하는 동안 이메서드가 포함된 객체에 락을 건다(bank)  다른 메서드들이 접근을 못한다
		try {
			Thread.sleep(3000);  // 3초 재운다 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m+save);
		
	}
	
	public void minousMoney(int minus) {  //방법2
		
		synchronized(this) { //synchronized 블락 방식 // 괄호안에 객체를 넣어준다 //// 이메서드가 실행되는 동안 요 객체에 락을 걸어라(이 객체를 다른 메서드가 사용하지 못하게)
			
			int m = getMoney();
			
			try {
				Thread.sleep(200);  // 0.2초 잠시 멈춘다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m-minus);
			
		}
		
		
	}

	public int getMoney() {
		return money; 
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread{ //방법 3 위에 아무것도 synchronized가 없을 때 쓰레드에 걸 수 있다
	
	public void run() {
//		synchronized(SyncMain.myBank) { // SyncMain.myBank에 락을 건다.   쓰는 쪽에서 synchronized 사용하기
//			System.out.println("start save");
//			SyncMain.myBank.saveMoney(3000);
//			System.out.println("saveMoney(3000) : "+ SyncMain.myBank.getMoney());
//		}
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : "+ SyncMain.myBank.getMoney());
	}
}


class ParkWife extends Thread{
	
	public void run() {
		System.out.println("use money");
		SyncMain.myBank.minousMoney(1000);
		System.out.println("minousMoney(1000) : "+ SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank();   //Bank가 shared 리소스가 될 것 이기 때문이다

	public static void main(String[] args) {
		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		
	}

}
