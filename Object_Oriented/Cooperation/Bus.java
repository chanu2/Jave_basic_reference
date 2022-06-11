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
		System.out.println(busNumber+"���� ������ �°� ���� "+personnel+"�� �̰�,"+" ������ "+ income+"�� �Դϴ�");
	}
	 
}
