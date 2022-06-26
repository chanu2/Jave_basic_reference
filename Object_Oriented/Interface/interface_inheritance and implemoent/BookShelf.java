package ch15;  // 인터페이스의 구현과 클래스 상속을 두개 다하는 방법 상속하는 것을 먼저 적어준다.

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);  // 상위클래스 변수가protected이므로 하위클래스에서 바로 접근 가능하다
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);  
	}

	@Override
	public int getSize() {
		return getCount();
	}   

}
