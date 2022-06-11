package ch15;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeKie = new Employee();
		employeeKie.setEmployName("김찬우");
		
		System.out.println(Employee.getSerialNum());  // 노란줄이 뜨는 이유 static변수는 클레스이름으로 참조해서 사용한다.  (Employee.serialNum)
	
		Employee employeeLee = new Employee();
		employeeLee.setEmployName("이훈일");
	  
		System.out.println(employeeKie.getEmployName()+"님의 사번은"+employeeKie.getEmployId()+"입니다.");
		System.out.println(employeeLee.getEmployName()+"님의 사번은"+employeeLee.getEmployId()+"입니다.");
	
		
	}

}
