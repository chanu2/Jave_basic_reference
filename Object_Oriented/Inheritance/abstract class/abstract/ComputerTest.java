package ch09;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer desktop = new Desktop();  //상속은 업 캐스팅 가능하다  //추상 메서드를 포함한 클래스는 인스턴스화 불가하다(new 불가)
		desktop.display();
	}

}
