package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		date.setDay(12);
		date.setYear(2022);
		date.setMonth(100);
		// 만약에 private변수가 아니라면 
		// date.month=100; 에 직접 관여할 수 있기 떄문에 이런 값들을 private로 막아주고 메서드에서 제어한다
		// 쓸데없는 데이타 오용을 막을 수 있다
		
		
		
		date.showDate();
	}

}
