package ch11;

public class MakeReportTest {

	public static void main(String[] args) {
		MakeReport builder = new MakeReport();
		String report = builder.getReport();
		
		System.out.println(report);
		
		// 항상 이 메서드나 필드를 외부에 제공을 할 것인가? 안 할 것인가?  객체지향 설계를 할때 중요한 개념이다 
		// 어떻게 공개를 함으로써 클라이언트가 편하게 효율적으로 사용하도록 고안해야한다.
		
	
	}

}
