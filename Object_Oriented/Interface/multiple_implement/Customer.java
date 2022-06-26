package ch15;

public class Customer implements Buy,Sell{  // 임플리먼트 상속을 여러개 받을 수 있다

	@Override
	public void sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
           // default 메서드가 중복되었을 때 오류로 둘중에 하나를 바꿔주던지 해라
		System.out.println("costumer order");   //아무거나 변경해준다
		
	}
	
	public void hello() {        // 메서드 추가
		System.out.println("Hellow");
	}
	
}
