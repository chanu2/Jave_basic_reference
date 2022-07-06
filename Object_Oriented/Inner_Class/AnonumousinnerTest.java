package ch01;

class Outer2{
	
	int outNum=100;
	static int sNum =10;
	
	Runnable getRunnable(int i) {   //Runnable 인터페이스   // 매개 변수도 스텍 메모리  
		
		int num = 40 ; // 로컬 변수 선언 // i,num은 호출되고 나서 사라진다.
		return new Runnable() {  // 메서드안에 클래스가 있다(지역 내부 클레스) //MyRunnable 쓸일이 별로 없어서 class MyRunnable implements Runnable을 바꾼다 
			
			int localNum =70; 

			@Override
			public void run() { // Runnable로 바꾸고 나면 나중에 또 호출될 수 있는 여지가 있다. 그러나 i,num은 호출되고 나서 사라진다. 
				
				//i=12;  assign오류가 발생할 수 있다. 결국 i,num은 스택에 잡히면 안된다. 컴파일러에서 자동으로 상수화 시킨다. 값을 바꿀 수 없다.
				//num=30;
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

			
			}
			
			
		}; // implements의 끝은 여기 까지다 라고 알려줌
		// return 	new MyRunnable(); 지워 버린다   이것이 바로 Anonumousinnerclass이다.
	}
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {                 // 다른 방식으로 Anonumousinnerclass  사용하는 법
			System.out.println("Runnable class"); 
		}
	};
	
}
public class AnonumousinnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);   
		runner.run();
		out.runnable.run();

	}

}
