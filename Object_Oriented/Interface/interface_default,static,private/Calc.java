package ch14;

public interface Calc {  // 인터페이스는 상속이 아니다 구현한다고 한다
	double PI=3.14;
	int error = -99999999;
	
	int add(int num1 ,int num2);
	int substract(int num1 ,int num2);
	int times(int num1 ,int num2);
	int divide(int num1 ,int num2);
	
	default void description() {                       //인터페이스에서 만들수 있는 메서드   // 재정의가 가능하다 구현 클래스에서 
		System.out.println("정수의 사칙연산을 제공합니다");
		 myMethod();
	}
	
	static int total(int[] arr) {                     //인터페이스에서 만들수 있는 메서드
		
		int total = 0;
		for(int num :arr) {
			total+=num;
			
		}
		myStaticMethod();
		return total;
		
		
		
		
	}
	
	
	private void myMethod() {      // private를 이용한 메서드 선언 private는 재정의 할 수 없다
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
}
