//Thread 우선순위


//Thread.MIN_PRIORITY(=1) ~ Thread.MAX_PRIORITY(=10)


//디폴트 우선순위 : Thread.NORMAL_PRIORITY(=5)


//우선 순위가 높은 Thread가 CPU의 배분을 받을 확률이 높다


//setPriority()/getPriority()




package ch21;

class PriorityThread extends Thread{
	
	public void run(){
	
		int sum = 0;
		
		Thread t = currentThread();  // 현재 상태를 알려주는 
		System.out.println( t + "start");
		
		for(int i =0; i<=1000000; i++){
			
			sum += i;
		}
		
		System.out.println( t.getPriority() + "end");
	}
}


public class PriorityTest {

	public static void main(String[] args) {

		int i;
		// for(i=Thread.MIN_PRIORITY; i<= Thread.MAX_PRIORITY; i++){  
			
		PriorityThread pt1 = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt1.setPriority(Thread.MIN_PRIORITY);      //우선 순위가 높은 것 부터 실행된다. 그러나 만약에 우선순위가 비슷하거나 별로 차이가 안나면 우선순위가 높다고 해서 먼저 실행되지는 않는다.
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
		
		
		}
	}


