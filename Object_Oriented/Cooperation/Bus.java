package ch13;

public class Bus {
	int income;
	int personnel;
	int busNumber;
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take(int income) {
		this.income+=1000;
		personnel++;
	}
	
	public void busShow() {
		System.out.println(busNumber+"번의 버스의 승객 수는 "+personnel+"명 이고,"+" 수입은 "+ income+"원 입니다");
	}
	 
}
