 package ch14;

public abstract class Calculator implements Calc { // 클래스에서 모두 구현해야한다. 모두 구현을 안한다면 추상 클래스가 된다. 

	@Override
	public int add(int num1, int num2) {      // 2개만 구현
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}

	

	

}
