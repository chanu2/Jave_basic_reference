package ch02;

public class Student implements Cloneable{   // 복제할 수 있다는 내용을 선언
	private int studentNumber;  // private 변수를 선언한다
	private String studnetName;
	
	public Student(int studentNumber,String studnetName) {
		this.studentNumber=studentNumber;
		this.studnetName=studnetName;
	}
	
	public void setStudentName(String name) {
		this.studnetName=name;
	}

	@Override
	public String toString() {      // toString 오버라이드 
		return studentNumber+","+studnetName;
	}
 
	
	@Override         //equals는 두 인스턴스의 주소값을 비교하여 true false로 반환   -- 주소값을 hashcode라고 한다 
	public boolean equals(Object obj) {           // equals,hashCode() 짝을 이루어 오버라이딩 해주어야한다
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNumber == std.studentNumber) {
				return true;
				
			}
			else return false; 
		}
		return false;
		
	}

	@Override
	public int hashCode() {
		
		return studentNumber;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {  //객체 원본을 그대로 복사 new와는 다른 개념
		return super.clone();
	}
	
	

	
	 
}
