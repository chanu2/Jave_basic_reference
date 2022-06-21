package ch02;

public class Customer {
	protected int customerId;   // 접근상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근 할 수 없음,  외부 클래스는 접근 할 수 없지만, 하위 클래스는 접근 할 수 있도록 protected 접근 제어자를 사용
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
	
	
	public Customer() {     //생성자
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


// 우수고객일 때 할인률과 등을 안에 적어도 되지만 변수가 많아질 수 록 코드가 조잡해지고 해치게 된다. 그래서 class를 따로 만들어 상속을 사용 
