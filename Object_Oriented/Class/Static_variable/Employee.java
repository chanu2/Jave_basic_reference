package ch15;

public class Employee {
	private static int serialNum=1000;    // public 가능하다
	
	private int employId;
	private String employName;
	private String department;
	
	
	
	public static int getSerialNum()  {
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
