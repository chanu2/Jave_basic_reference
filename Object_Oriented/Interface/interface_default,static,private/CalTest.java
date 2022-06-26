package ch14;

public class CalTest {

	public static void main(String[] args) {
		//생성할 수 있는 것은 completecalc 밖에 없다 인터페이스와 추상클래스는 인스턴스를 생성할 수 없기 떄문이다.
		//completecalc는 Calc에서 상속을 받은 것은 아니지만 Calc type이 구현되었다 type 상속을 했다라고 한다. 클래스는 다중으로 여러개의 타입을 내포할 수 있다
		// 크래스가 인터페이스 구현해준다 화살표 점선 모양 
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.substract(num1,num2));
		System.out.println(calc.times(num1,num2));
		System.out.println(calc.divide(num1,num2));
		
		calc.description();
		
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));   // 인터페이스 생성과 상관없이 사용가능 인터페이스 이름으로 사용했다.
		
		
		
	}

}
