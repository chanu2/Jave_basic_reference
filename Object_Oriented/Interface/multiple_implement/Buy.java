package ch15;

public interface Buy {   // 인터페이스 만들기
	void buy();
	
	default void order() {   // 디폴트 메서드 만들기  implements 클래스에서 재정의 가능하다
		System.out.println("buy order");
	}
}
