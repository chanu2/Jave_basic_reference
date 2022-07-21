// join()


// 동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를 참조 하여 실행해야 하는 경우 join() 함수를 사용


// join() 함수를 호출한 Thread가 not-runnable 상태가 감


// 다른 Thread의 수행이 끝나면 runnable 상태로 돌아옴



package ch21;

public class JoinTest extends Thread {
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start , int end) {
		this.start=start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i=start; i <= end ; i++) {
			total+=i;
		}
	}
	
	public static void main(String[] args) {        // 이때 thread는 3개가 돌아간다.
		
		JoinTest jt1 = new JoinTest(1,50);  //thread 두개를 생성하고
		JoinTest jt2 = new JoinTest(51,100);
		
		jt1.start();  // start
		jt2.start();
		
		try {          // main Thread는 non - runnable 상태로 빠지게 되어 실행이 안됨   // 이 Thread가 안끝나면 main쓰레드를 호출할 수 없다(인터럽트 익셉셔널 예외처리 해야한다)
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		
		
		int lastTotal = jt1.total + jt2.total; // 아직 위에서 아직 값을 계산하는 중이기 떄문에 오류발생
		
		System.out.println("jt1.total "+ jt1.total );
		System.out.println("jt2.total "+ jt2.total);
		System.out.println("lastTotal "+lastTotal);
		
	}
	

}
