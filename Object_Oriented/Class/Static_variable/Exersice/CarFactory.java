package ch17;

public class CarFactory {
	
	
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {
		
	}
	
	
	public static CarFactory getInstance() {
		return instance;
		 
	}
	
	public Car createCar() { // Car의 객체를 생성해주는 메서드 반환값은 클레스 Car을 반환한다.
		 
		 return new  Car();  // Car 객체를 생성해서 리턴
	}
}





