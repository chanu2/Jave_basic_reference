package ch11;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2==0) {
			return error;
		}
		return num1/num2;
	}
	public void calShow() {
		System.out.println("모두 구현하였습니다");
	}

}
