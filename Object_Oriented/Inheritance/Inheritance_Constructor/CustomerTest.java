package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerKim = new Customer(10010,"김찬우");
		//customerKim.setCustomerName("김찬우");                     //vip 커스터머가 생기기 전에 customer의 생성자가 먼저 생성된 것을 확인할 수 있다.
		//customerKim.setCustomerId(10010);                        // 그렇기 때문에 맴버 변수를 사용할 수 있다.
	    customerKim.bonusPoint=1000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		VipCustomer customerHa = new  VipCustomer(10020,"하재은");  
		//customerHa.setCustomerName("하재은");   // 맴버변수에 접근할 수 있다.
		//customerHa.setCustomerId(10020);
		customerHa.bonusPoint=10000;
		System.out.println(customerHa.showCustomerInfo());		
		
		
		//형변환이 가능하다
		//Customer vc = new VipCustomer(123, "no_name");
		// 형변환 가능
		//vc.을 확인해보면 VipCustomer인스턴트로 생성은(Agent,saleRatio등 ) 되지만 형변환으로 Customer되었기 떄문에 Customer의 type만 사용가능
		
	}
	
	
	 

}
