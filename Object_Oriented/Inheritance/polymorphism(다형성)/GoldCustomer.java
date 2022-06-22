package ch06;

public class GoldCustomer extends Customer{
	double saleRatio;  // 필요한 변수 선언

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio=0.02;
		saleRatio=0.1;
		customerGrade="GOLD";  
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price - (int)(price*saleRatio) ;
	}
	

}
