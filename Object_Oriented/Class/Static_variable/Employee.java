package ch15;

public class Employee {
	private static int serialNum=1000;    // public 가능하다 그러나 시리얼 넘버에 다른사람이 접근하면 안된다
	
	private int employId;
	private String employName;
	private String department;
	
	
	
	public static int getSerialNum()  {  // 다른 사람이 마음대로 바꾸면 안되기 떄문에 setter를 삭제
	  //employName="찬우" 인스턴스가 로드되지 않은 상태일 수도 있기 때문에 가져다 쓸 수 없다
	  //int i =0; 과 같은 지역 변수는 가능하다	
		return serialNum;
	}
	
	public Employee(){  // 초기화는 생성자에서 담당
		serialNum++;
		employId=serialNum;
	}
	
	
	public int getEmployId() {
		return employId;
	}
	public void setEmployId(int employId) {    
		this.employId = employId;
	}
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
