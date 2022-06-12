package ch16;

public class Company {  //하나의 회사라는 객체는 유일해야 한다.
	
	private  static Company instance = new Company();   // 유일한 인스턴스는 내부에서 만들어야한다 
	private Company() {   // 생성자를 만들면 컴파일러는 default값으로 생성자를 제공하지 않는다
		                  // 생성자를 아무나 접근 못 하도록 private 해준다
	}
	
	public static Company getInstance() {   // 다른 곳에서 그래도 인스턴스에 접근하기 위해사
		if (instance==null) {
			instance=new Company();  // 방어적인 코드
		}
		return instance;             //여기 까지가 싱글톤 페턴
		
		
	}	
	
}
