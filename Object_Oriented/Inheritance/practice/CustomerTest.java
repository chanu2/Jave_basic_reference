package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerKim = new Customer();
		customerKim.setCustomerName("김찬우");
		customerKim.setCustomerId(10010);
		customerKim.bonusPoint=1000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		 VipCustomer customerHa = new  VipCustomer();  
		 customerHa.setCustomerName("하재은");   // 맴버변수에 접근할 수 있다.
		 customerHa.setCustomerId(10020);
		 customerHa.bonusPoint=10000;
		 System.out.println(customerHa.showCustomerInfo());		
	
	}
	
	
	 

}
