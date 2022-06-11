package ch14;

public class StudentTaxiTest {

	public static void main(String[] args) {
		Student studentKim = new Student("김찬우",100000);
		Taxi yellowTaxi = new Taxi("운수좋은 택시회사");
		studentKim.takeTaxi(yellowTaxi);
		studentKim.showStudent();
		yellowTaxi.taxiShow();
	}

}
