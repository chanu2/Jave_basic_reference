package ch02;

public class AddTest {

	public static void main(String[] args) {
		Add addL =(x,y)->{return x+y;};   //Add인터페이스의 add 함수를 구현한 것 이다. // 람다식 생략 참고
		System.out.println(addL.add(2,3));
	}

}
