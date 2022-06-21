package ch03;

public class VipCustomer extends Customer {  // 비슷하고 필요하기 떄문에 상속을 받는다.
	
	double saleRatio;
	private String agetID;
	
	/*public VipCustomer() {  // 상위클래스가 디폴트 생성자가 아니라면 직접 명시해줘야한다
		//원래는 상위클래스의 생성자(constructor)를 호출해야한다. 만약에 코드가 없으면 compiler가 super();을 넣어준다
		//super(); 직접 쓰지 않아도 된다  --> 하위 클래스가 상위클래스의 인스턴스의 참조값을 가지게 된다.
		
		super(0,"no_name"); // 상위클래스 생성자를 받는 방법1
		bonusRatio=0.05;
		customerGrade="VIP";      // 오류가 난다면 customerGrade가 private로 선언되었기 떄문 상위 클래스에는 외부 크래스가 접근을 못하지만
		// 하위클래스는 접근 할 수 있도록 protected를 사용한다. 
		saleRatio=0.1;
		System.out.println("VipCustomer() call");
	} */
	
	public VipCustomer(int customerId, String customerName) {  //무조건 필요한 것은 아니다. 그래도
		super(customerId, customerName);
		customerGrade="VIP";
		bonusRatio=0.05;                       // 자기가 필요한 변수를 만들 수 있다. 상속받은 이외의 변수들을!!
		saleRatio=0.1;
		System.out.println("VipCustomer(int,String) call"); // int,String이 호출됨
		}
	
	public String getAgentId() {
		return agetID;
	}
	

}
