package ch20;

class MyThread extends Thread{  // run을 구현해 줘야한다   
	
	public void run() {   
		
		int i;
		for(i = 0; i<200; i++) {   //200 전까지 더해주는 메서드
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread()+"start");   // 현재 어떤 thread가 작동하는지 보여주는 코드
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();          // 총 3개의 thread가 실행된다  //
		th2.start();
		System.out.println(Thread.currentThread()+"end");
		
		
//		Runnable run = new Runnable() {
//			
//			@Override                       하나의 쓰레드가 돼서 바로 실행 가능하다(이런 방법도 있다)
//			public void run() {
//				System.out.println("run");
//			}
//		};		
//		run.run();  
		
	}
	
}
