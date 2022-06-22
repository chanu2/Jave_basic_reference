package ch06;

public class VipCustomer extends Customer {  // 비슷하고 필요하기 떄문에 상속을 받는다.
	
	double saleRatio;      //추가적인 변수는 선언해준다.
	private String agetID;
	

	
	public VipCustomer(int customerId, String customerName) {  //무조건 필요한 것은 아니다. 그래도
		super(customerId, customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		
		}
	
	//source에 override를 하면 사용할 수 있는 메서드가 나온다.	
	@Override   // 컴파일러에게 오버라이드된 메서드라는 것을 알려준다
	public int calcPrice(int price) {  // calcPric e가하나만 없어도 오류발생한다. (오버라이드 된 메서드이기 때문에)
		bonusPoint+= price * bonusRatio;
		price-=(int)price*saleRatio;
		return price;
	}



	public String getAgentId() {
		return agetID;
	}
	

}
