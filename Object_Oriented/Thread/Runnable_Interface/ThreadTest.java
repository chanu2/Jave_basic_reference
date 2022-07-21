package ch20;


class MyThread implements Runnable{  // run을 구현해 줘야한다   // 이미 다른 것을 extends했을 때  class MyThread implements Runnable
	
	public void run() {   
		
		int i;
		for(i = 0; i<200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread()+"start");   // 현재 어떤 thread가 작동하는지 보여주는 코드
		
	
		MyThread runnable = new MyThread();   // 그냥 start 불가
		Thread th1 = new Thread(runnable);  //이걸 쓰고 start 가능
		Thread th2 = new Thread(runnable);
		
		th1.start();          // 총 3개의 thread가 실행된다  //
		th2.start();
		System.out.println(Thread.currentThread()+"end");
		
		
//		Runnable run = new Runnable() {
//			
//			@Override                       하나의 쓰레드가 되서 바로 실행 가능하다(이런 방법도 있다)
//			public void run() {
//				System.out.println("run");
//			}
//		};		
//		run.run();  
		
	}
	
}


