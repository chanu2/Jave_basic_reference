package ch08;

public class StudentTest {   //

	public static void main(String[] args) {
		Student studentKim = new Student("chan",111);   // 클래스 사용하기
		studentKim.setKoreaSubject("국어",100);
		studentKim.setMathSubject("수학", 90);
		
		
		Student studentLee =new Student("jung",123);
		studentLee.setKoreaSubject("국어",100);
		studentLee.setMathSubject("수학",70);
		
		studentKim.studentShowInfo();
		studentLee.studentShowInfo();
		

	}

}
