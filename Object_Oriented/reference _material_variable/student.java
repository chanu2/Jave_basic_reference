package ch08;

public class Student {
	public String studentName;
	public int studentId;
	
	Subject korea;  // 참조 자료형으로 변수를 사용한다
	Subject math; 
	
	
	
	public Student(String studentName,int studentId) {
		this.studentName=studentName;
		this.studentId=studentId;
		
		korea = new Subject();   // 참조 자료형 불러오기!! 무조건 해야함
		math = new Subject();
	}
	
	public void setKoreaSubject(String name,int score) {
		korea.subjectName=name;
		korea.score=score;
		
	}
	
	public void setMathSubject(String name,int score) {
		math.subjectName=name;
		math.score=score;
	}
	
	
	public void studentShowInfo() {
		int total=math.score+korea.score;
		System.out.println(studentName+" 학생의 총점은"+total+" 점 입니다" );
	}
	

}
