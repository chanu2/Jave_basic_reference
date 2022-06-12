package ch16;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		//static이기 때문에 바로 인스턴트를 생성하지 않아도 Company에접근할 수 있다.
		Company company2 = Company.getInstance();
		System.out.println(company1);
		System.out.println(company2);
		Calendar calendar = Calendar.getInstance();  
	}

}
