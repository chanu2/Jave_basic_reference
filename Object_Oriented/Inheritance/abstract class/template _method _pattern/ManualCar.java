package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 스스로 방향을 바꿉니다");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 브레이크를 밟아 정지합니다");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 버튼을 눌러 스스로 닦습니다	");
	}

}
