
// 클래스를 사용하는 법

package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student1 studentKim = new Student1(); 
		
		System.out.println(studentKim.showStudentInfo());  //멤버 변수는 만들어지면 자동으로 초기화된다.
		
		Student1 studentHa = new Student1(20212056,"jaeeun",2);
		System.out.println(studentHa.showStudentInfo());
	}

}
