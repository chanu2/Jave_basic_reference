package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
	public static final String LINE = "-------------------------------------\n";
	private StringBuffer buffer = new  StringBuffer();  // 스트리 버퍼를 이용한 나열
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();  // 과목에 대한 리스트를 가져온다
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		
		return buffer.toString(); //toString으로 변환
	}
	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);    // 인스턴스로 static에 접근한다
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE );
		buffer.append(GenerateGradeReport.HEADER );
		buffer.append(GenerateGradeReport.LINE);

	}
	
	public void makeBody(Subject subject) {
		
		ArrayList<Student> studentList = subject.getStudentList();  // subject 내부에 만든 학생 리스트를 가져온다
		
		for(int i=0; i<studentList.size();i++ ) {
			
			Student student = studentList.get(i);  // 하나 꺼내오기  
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajor().getSubjectName() + "\t");
			buffer.append(" | ");
			
			
			getScoreGrade(student,subject.getSubjectId());  //학생별 학점을 계산해준는 매서드 사용
			buffer.append("\n");
			buffer.append(LINE);

			
			
			
			
		}
		
		
		
	}
	
	public void getScoreGrade(Student student, int subjectId) { 
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajor().getSubjectId();  // 자신의 중점 과목의 id를 가져온다
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};  //학점 평가 클래스들 // 리스트에 인스턴스를 넣는다
		for(int i=0; i<scoreList.size(); i++) {
			Score score = scoreList.get(i);
			
			if(score.getSubject().getSubjectId() == subjectId) {  // 국어과목 성적을 확인하려면 학교에 국어과목과 학생의 score리스트를 통해서 국어 과목을 가져와야한다. 이 코드를 작성하지 않으면 국어점수를 확인 할때 수학점수도 같이 나온다 
				String grade;
				if(score.getSubject().getSubjectId() == majorId) {
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());   // utils에서 선언한 SAB_TYPE = 1이기 때문에 gradeEvaluation 리스트에서 인덱스가 1인 MajorEvaluation를 가져온다
				}
				else {
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
				
			}
						

		}
		
	}
	
	public void makeFooter(){
		buffer.append("\n");
	}

	
	
	

}
