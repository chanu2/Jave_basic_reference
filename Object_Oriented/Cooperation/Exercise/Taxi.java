package ch14;

public class Taxi {
	int income;
	String taxiCompany;
	
	public Taxi(String taxiCompany ) {  
		this.taxiCompany=taxiCompany;
		
	}
	
	public void take(int income) {// 다른 클레스 불러오기
		this.income+=10000;
		
	}
	
	public void taxiShow() {
		System.out.println(taxiCompany+"의 수입은"+income+"원 입니다");
	}

}
