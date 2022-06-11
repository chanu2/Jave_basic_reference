package ch13;

public class Student {
	String studentName;
	int money;
	
	
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
		
		
	}
	
	public void takeBus(Bus bus) { // Bus 객체가 넘어온다
		bus.take(1000);
		this.money-=1000;
	}
	
	public void subwayTake(Subway subway) {
		subway.take(1200);
		this.money-=1200;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"원 입니다");
	}

}
