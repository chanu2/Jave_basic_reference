package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerlist = new ArrayList<>();
		
		Customer customerKim = new Customer(1010,"김삿갓");
		Customer customerLee = new Customer(1011,"이종필");
		Customer customerHa = new GoldCustomer(1012,"하재은");
		Customer customerChoi = new GoldCustomer(1013,"최유빈");
		Customer customerPark = new GoldCustomer(1014,"박수빈");
		Customer customerJun = new VipCustomer(1015,"준지");
		
		customerlist.add(customerKim);
		customerlist.add(customerChoi);
		customerlist.add(customerHa);
		customerlist.add(customerJun);
		customerlist.add(customerLee);
		customerlist.add(customerPark);
		
		
		for(Customer customer : customerlist ) {
			System.out.println(customer.showCustomerInfo());
			System.out.println("-------------------------------");
			}
		
		int price=10000;
		
		for(Customer customer : customerlist) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+" 님이 내실 금액은"+ cost+" 원 입니다.");
			System.out.println(customer.getCustomerName()+" 님의 포인트는"+ customer.bonusPoint+" 점 입니다.");
		}
		
	}
	

}
