package ch06;

public class Student1 {  
	
	public int studentNumber;     //멤버 변수   
	public String studentName;   
	public int grade;             // 멤버 변수와 지역변수는 다른 타입의 변수다!!   --> 객체가 만들어질 때 초기화된다.
	
	public Student1() {
		// default 생성자는 생성자가 하나도 없을 때 자동으로 만들어진다.  번외로 default 생성자를 안만들게 할 수 있다. 
	}
	public Student1(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;  // this를 사용하면 멤버변수  사용하지 않으면 매개변수이다.
		this.studentName = studentName;
		this.grade=grade;
	
	}
	public String showStudentInfo() {
		
	  //int i;
		return studentName+" 학생의 학번은"+studentNumber+"이고 학년은"+grade+"학년 입니다";  // +i를 추가한다면 에러가 발생한다 왜냐하면 i는 지역변수이기 때문에 초기화가 되지 않는다. 
		
	}

}
