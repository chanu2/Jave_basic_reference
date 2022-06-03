package ch10;

public class BirthDay {
	private int day;    // int 디폴트값 0 
	private int month;    // private 변수를 선언한다. 접근이 불가함
	private int year;
	
	private boolean isValid; // 처음 객체가 만들어지면 멤버변수 디폴트값으로 false가 만들어진다. 
	
	public int getDay() {
		return day;         // get 값을 가져갈 때
	}
	
	public void setDay(int day) {   //set 값을 지정 할 때 
		this.day=day;
	}
	// 이클립스 source에 generate getter setter 누르면 자동으로 만들어 준다

	public int getMonth() {  // 메서드 이름이 바뀌어도 상관없다.
		return month;
	}

	public void setMonth(int month) {
		if(month <1|| month>12) {
			isValid=false;
			
		}
		else {isValid=true;
		
		this.month = month;
		}
		
		
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate(){
		if(isValid) { // True이면
			System.out.println(year + " 년"+ month +"월" + day+ " 일" + "입니다"); 
		} 	
		else {
			System.out.println("유효하지 않는 날짜"); 
		}
		
	}
	
	
	
}



