package ch05;

public class MyLinkedQueueTest {

	public static void main(String[] args) {
		MyLinkedQueue queue =new MyLinkedQueue();
		queue.enQueue("A");
		queue.enQueue("b");
		queue.enQueue("c");
		queue.printQueue();
		
		System.out.println(queue.deQueue());
		queue.printQueue();
		System.out.println(queue.deQueue());
		
		queue.printQueue();
		
		
	}

}
