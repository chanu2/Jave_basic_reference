package ch04;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
	public Customer(int customerId,String customerName ) {
		this.customerName=customerName;
		this.customerId=customerId;                     //이런 생성자일 때
		
		bonusRatio=0.01;
		customerGrade="SILVER";
		
	}
	
	public int calcPrice(int price) {
		bonusPoint+=bonusRatio*price;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+" 님의 등급은" +customerGrade+" 이며, 보너스 포인트는" + bonusPoint+ " 입니다";
	}


}


