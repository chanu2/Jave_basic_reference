package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerKim = new Customer(10010,"김찬우");
		customerKim.bonusPoint=1000;
		int price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo()+price);
		
		
		VipCustomer customerHa = new  VipCustomer(10020,"하재은");  
		price = customerHa.calcPrice(1000);
		
		customerHa.bonusPoint=10000;
		System.out.println(customerHa.showCustomerInfo()+price);		
		
		Customer vc = new VipCustomer(123, "no_name");
		System.out.println(vc.calcPrice(1000));  // 900이 나온다. vip의 인스턴스가  사용 가상함수 방식, 가상메서드
	
	}
	
	
	 

}
