package school;

import java.util.ArrayList;

public class School {
	
	private static School  instance = new  School();  // 싱그톤 패턴으로 클래스 생성
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School() {}  //생성자
	
	public static School getInstance() {   // 다른 곳에서 그래도 인스턴스에 접근하기 위해서
		if (instance==null) {
			instance =new School();  // 방어적인 코드
		}
		return instance;             //여기 까지가 싱글톤 페턴
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public static void setInstance(School instance) {
		School.instance = instance;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	
}
