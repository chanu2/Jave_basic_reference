package ch24;

import java.util.ArrayList;   // ArrayList 선언

public class Student {
	int studentNumber;
	String name;
	ArrayList<Subject> subjectList;   // 학생이 수강할 subject를 ArrayList로 만든다
	
	
	public Student(int studentNumber,String name){
		this.studentNumber=studentNumber;
		this.name=name;
		
		subjectList = new ArrayList<Subject>(); // <>안에 안써도 상관없다.
		
		
	}
	
	public void addSubject(String name,int score) {
		Subject subject = new Subject();   // 객체를 꼭 생성해줘야함 
		
		subject.setSbjectName(name);   // 점수와 과목을 넣어준다.
		subject.setSubjectScore(score);
		
		subjectList.add(subject); // 리스트에 추가한다.
		
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject s: subjectList){
			total+=s.getSubjectScore();
			System.out.println("학생"+name+"의" +s.getSbjectName()+"과목 성적은 "+ s.getSubjectScore()+" 입니다.");
		
			
		}
		System.out.println("학생"+name+"의"+" 총점은 "+total+" 점 입니다.");
		
	}
	
	

}
