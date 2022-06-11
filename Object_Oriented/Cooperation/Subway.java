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
		System.out.println(subwayNumber+"호선의 지하철의 승객 수는 "+personnel+"명 이고,"+" 수입은 "+ income+"원 입니다");
	}

}
