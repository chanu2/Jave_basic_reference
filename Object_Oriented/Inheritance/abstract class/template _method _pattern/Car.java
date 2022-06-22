package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); // 기능 을 추가하고 싶을 때
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	public void carWash() {
		  // 추상 메서드는 아니지만 구현은 되었지만 구현내용이 없는 매서드  
		 // final이 안붙어있기 떄문에 하위클래스에서 재정의 가능하다.
	}
	
	
	final public void run() {
		startCar();
		drive();// 이 시나리오는 변하면 안된다(final)
		wiper(); // 정의해준다
		stop();                       // 하위 클래스에서 재정의를 못한다	
		turnOff();
		carWash();  // 만약에 선언해준다면   구동
	}
	
}
