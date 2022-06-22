package ch10;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행 합니다");
		System.out.println("자동차가 스스로 방향을 바꿉니다");
	}

	@Override
	public void stop() {
	
		System.out.println("장애물 앞에서 스스로 정지합니다	");
		
	}

	@Override
	public void wiper() {
		System.out.println("자동차가 스스로 창문을 닦습니다	"); // 기능으ㄹ 삽입하여 오류 발생 다시 구현해줘야함
	}

	@Override
	public void carWash() {
		System.out.println("자동차가 스스로 세차를 합니다"); // 사용하기위해서 재정의를 한다.. 
	}
	
	

}
