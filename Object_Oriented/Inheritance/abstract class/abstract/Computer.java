package ch09;

public abstract class Computer {  //추상 메서드를 만들기 위해서  추상클래스는 상속을 하기 위해서 만들었다.
	
	public abstract void display();  // computer를 상솓받을 하위 클래스들이 display 와 typing을 어떻게 할지는 모른다.(공통으로쓸 매서드만 구현)
	public abstract void typing();   // 하위 클래스에게 그 책임을 위임한다  (나는 구현하지 않을테니 상속받는 니들이 알아서 너한테 맞게 구현해라 )
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
}
