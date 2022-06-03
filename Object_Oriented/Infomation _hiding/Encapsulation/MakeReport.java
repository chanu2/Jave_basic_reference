package ch11;

public class MakeReport {
	StringBuffer buffer = new StringBuffer();  // 늘어날 수 있는 buffer를 가지고 있는 클래스에 쭉 스트링을 연결하고 그것을 스트링 값으로 리턴 하는 방식
	                                           // 메모리 관점에서 + 보다 훨씬 효율적이다.
	private String line="=============================================\n";
	private String title ="이름\t  주소\t\t  전화번호 \n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);   //StringBuffer 클래스의 멤버변수인 append
		buffer.append(line);
		
	}
	
	
	private void generateBody() {
		buffer.append("chan \t");
		buffer.append("서울시 노원구 \t");    // \n : 줄바꿈, \t : 탭(Tab),\" : 큰 따옴표 ,\\ : 역슬래쉬
		buffer.append("01082527933\n");
		
		buffer.append("ha \t");
		buffer.append("대전 유성구 \t");
		buffer.append("01027310426\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	// 캡슐화 (encapsulation)
	// 현재까지 메서드들을 클라이언트에게 오픈 해봤자 크게 소용도 없고 이 순서대로 무조건 써야하는데 알 필요도 없어서 
	//  public String getReport()만 제공한다 
	public String getReport(){
		makeHeader();
		generateBody();
		makeFooter();
		
		return buffer.toString();
		
	}
	

}
