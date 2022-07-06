package ch03;

public class MyNumberTest {

	public static void main(String[] args) {
		
		MyNumber myNumber = (x,y) -> x > y? x: y; //람다식 줄이기
		System.out.println(myNumber.getMax(10,20));
			
	
	}

}
