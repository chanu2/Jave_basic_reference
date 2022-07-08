package ch08;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer1 = new Customer("chanWoo", 40, 100);
		Customer customer2 = new Customer("ha", 20, 100);
		Customer customer3 = new Customer("gun", 13, 50);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		
		System.out.println("고객 명단을 출력합니다");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s)); // 이름만 출력
		
		System.out.println("총 여행 비용");
		System.out.println(customerList.stream().mapToInt(c -> c.getCost()).sum());
		
		System.out.println("20세 이상 고객");
		customerList.stream().filter(n-> n.getAge() >=20).map(p -> p.getName()).sorted().forEach(s -> System.out.println(s));
		//스트림 필터로 20세 이상 고객선별 맵을 통해서 toSTRING을 출력하는 것이 아니라 이름만 꺼내온다. 정렬후 각각 출력한다
		
		
	}

}
