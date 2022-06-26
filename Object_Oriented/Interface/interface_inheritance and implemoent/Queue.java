package ch15;  // 책장을 큐 형식으로 구현한다

public interface Queue {
	void enQueue(String title); // 책을 넣는 코드
	String deQueue(); // 책을 제거하여 반환하는 코드
	
	int getSize();   // 책수 보는 것
}
