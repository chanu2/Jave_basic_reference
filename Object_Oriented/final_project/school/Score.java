package school;

public class Score {
	private int studentId;
	private Subject subject;
	private int point;
	
	public Score(int studentId,Subject subject,int point) {
		this.point=point;
		this.studentId = studentId;
		this.subject = subject;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		return "학번: " + getStudentId()+ ", " + subject.getSubjectName() + " : " + point;
	}
	
	
	
}
