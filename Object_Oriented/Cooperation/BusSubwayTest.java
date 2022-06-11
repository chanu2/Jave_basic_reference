package ch13;

public class BusSubwayTest {

	public static void main(String[] args) {
		Student studentP = new Student("박영웅",100000);
		Bus bus = new Bus(100);
		studentP.takeBus(bus);
		bus.busShow();
		studentP.showInfo();
		
		
		Student studentH =new Student("이훈일",1500);
		Subway subway = new Subway(2);
		studentH.subwayTake(subway);
		subway.subwayShow();
		studentH.showInfo();
		
		
		
		
		
		
	}

}
