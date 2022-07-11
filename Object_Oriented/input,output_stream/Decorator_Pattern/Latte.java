package ch19;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {  // 컨스트럭트를 넣어야 하는 이유는 상위클래스인 Decorator에서 디폴트 컨스트럭트가 없기 때문에
		super(coffee);             // 하위클래스에서 반드시 매개변수가 있는 컨스트럭트가 슈퍼를 호출해야한다
	}
	
	public void brewing() {
		super.brewing(); // 슈퍼의 제조법을 부르는 코드
		System.out.println("Ading milk");
	}
	

}
