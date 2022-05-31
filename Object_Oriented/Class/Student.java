// 객체를 생성하는법



package ch04;

public class Student {
	public int studentId;   //    멤버 변수를 선언(일단 public을 붙여준다)
	public String studentName;
	public String address;
	
	
	public void showStudentInfo() {   //반환값이 없는 메서드 -- void는 반환 값이 없는 메서드 
		System.out.println(studentId+" 학번의 이름은 "+studentName+"님의 주소는 "+address+" 입니다"); //+오퍼레이터에 의해서 정수지만 문자형으로 
	}
	
	
	public String getStudentName() {  //메서드
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
}
