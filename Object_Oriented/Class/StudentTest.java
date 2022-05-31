// class를 사용하는 법


package ch04;

public class StudentTest {  

	public static void main(String[] args) {
		Student studentKim =new Student();  // 스튜던트 하나를 생성해라   // 이때 생성되는 객체 (studentLee)를 인스턴스라고 한다
                                            // 클래스를 기반으로 여러개의 인스턴스가 생성된다
		studentKim.studentId=123456;
		studentKim.setStudentName("ChanWoo");
		studentKim.address="서울 노원구";
		studentKim.showStudentInfo();
		
		
 		Student studentHa = new Student();   //객체를 사용하려면 항상 생성자를 써줘야한다. 그리고 메모리들이 힙에 저장된다
		studentHa.studentId =53123;
		studentHa.setStudentName("Jaeeun");
		studentHa.address="대전 유성구";
		studentHa.showStudentInfo();
		
		
	
	} 

}

