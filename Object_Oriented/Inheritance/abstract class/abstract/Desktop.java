package ch09;

public class Desktop extends Computer  {  // 상속받은 나는 구현을 할거야 추상 
// 추상 메서드가 모두 구현되어 있어도 abstract 클래스로 만들 수 있다.   인스턴스를 만들지않고 오로지 상속을 위한 클래스라고 하기위해서
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
		
	}

	@Override
	public void turnOff() {   // 오버라이딩을 통해서 자신에 맞게 재정의 할 수 있다.
		System.out.println("Desktop turnOff");
	}
	

}
