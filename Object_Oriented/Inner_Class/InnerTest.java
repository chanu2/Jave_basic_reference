package ch01;

class OutClass{
	
	private int num =10;
	private static int sNum =20;
	private InClass inClass;
	
	public OutClass() {   // 대부분 외부 클래스가 만들어 지고 내부클래스도 만들어 주는 코드
		inClass = new InClass();
	}
	 
	private class InClass{  // inner 클래스 선언  이너클래스는 아웃클래스가 생성된 이후에 생성된다. 
		int iNum =100;
		//static int sInNum = 500; 내부클래스에서는 사용불가  
		void inTest() {
			System.out.println("OutClass num = "+num +" 외부클래스의 인스턴스 변수");
			System.out.println("OutClass SNum = "+sNum +" 외부클래스의 스태틱  변수");
			System.out.println("inClass num = "+iNum +" 내부클래스의인스턴스 변수");
		}
	}
	public void usInClass() {
		inClass.inTest(); 
	}
	
	static class InStaricClass{  // 정적 클래스
		int iNum =100;
		static int sInNum =200;
		
		void inTest() {
			System.out.println("OutClass num = "+ iNum +" 내부클래스의 인스턴스 변수");  // num에서 오류 발생 외부클래스가 생성되지 않고 호출될 수 있기때문에
			System.out.println("OutClass SNum = "+sNum +" 외부클래스의 스태틱  변수");
			System.out.println("inClass num = "+sInNum +" 내부클래스의 스태틱 변수");
		}
	
		static void sTest() {
			//System.out.println("OutClass num = "+ iNum +" 내부클래스의 인스턴스 변수");  tatic class InStaricClass 생성 되지않아도 호출가능해서 사용할 수 없다
			System.out.println("OutClass SNum = "+sNum +" 외부클래스의 스태틱  변수");
			System.out.println("inClass num = "+sInNum +" 내부클래스의 스태틱 변수");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		//OutClass outClass = new OutClass();
		//outClass.usInClass();
		
		
		//OutClass.InClass inner = outClass.new InClass();   // class InClass가 private가 아닐때 이렇게 쓸 수도 있다
		//inner.inTest();
		
		OutClass.InStaricClass sInClass = new OutClass.InStaricClass();
		sInClass.inTest();
		System.out.println();
		
		OutClass.InStaricClass.sTest(); // static으로 클래스 생성과 상관없이 호출가능

	}

}
