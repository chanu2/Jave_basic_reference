package ch13;

public class Subway {
	int income;
	int personnel;
	int subwayNumber;
	
	
	public Subway(int subwayNumber) {
		this.subwayNumber=subwayNumber;
		
	}
	
	public void take(int income) {
		this.income+=1200;
		personnel++;	
	}
	
	public void subwayShow() {
		System.out.println(subwayNumber+"ȣ���� ����ö�� �°� ���� "+personnel+"�� �̰�,"+" ������ "+ income+"�� �Դϴ�");
	}

}
