package ch17;

public class Car {
	private static int serialNum=10000;
	
	private int carNum;
	
	public Car() {  // createCar()메서드로 받은 후 인스턴트를 생성해준다
		serialNum++;   
		carNum=serialNum;
		
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	
}
