package ch02;

public class VipCustomer extends Customer {  // 비슷하고 필요하기 떄문에 상속을 받는다.
	
	double saleRatio;
	private String agetID;
	
	public VipCustomer() {
		bonusRatio=0.05;
		customerGrade="VIP";      // 오류가 난다면 customerGrade가 private로 선언되었기 떄문 상위 클래스에는 외부 크래스가 접근을 못하지만
		// 하위클래스는 접근 할 수 있도록 protected를 사용한다. 
		saleRatio=0.1;
	}
	public String getAgentId() {
		return agetID;
	}
	

}
