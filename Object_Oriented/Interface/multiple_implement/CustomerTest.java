package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();  // 재정의 
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;  // up casting 형변환
		buyer.buy();
		buyer.order();
		
		 
		
		Sell seller = customer;
		seller.sell();
		seller.order();  // seller order가 호출이 안되는 이유는  Customer에서 재정의 했기 때문에 가상 매서드로 인해서
		//costumer order이 출력 된다
		
	}

}
