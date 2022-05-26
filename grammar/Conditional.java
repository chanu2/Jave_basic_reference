
//조건문//

/*
if( 조건식) {

    수행문1;   // 조건식이 '참'인 경우에 수행됨
}
else{
    수행문2;    // 조건식이 '참'이 아닌 경우에 수행됨
} */




// switch ~ case 문 //



/*
package ch19;

import java.util.Scanner;

public class SwichCaseTest {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day;
		switch(month) {
			case 1: case 3:case 5: case 6: case 8: case 11: case 12:
				day=31;
				break;
			case 2: day=30;
				break;	
			
			case 4: day=31;
				break;	
			
			case 7: day=33;
				break;	
			
			case 9: day=31;
				break;	
			case 10: day=30;
				break;	
			
			default:
		    	System.out.println("존재하지 않는 달");
		    	day=-1;
			
		
		}
		System.out.println(month+"월 달은"+day+"일 까지 있다"); */   // 자바 버전 14이하 일때
		
		
		
	// 최근 업그레이드된 기술 ///
/*
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month){
			case 1,3,5,7,9,12 -> {
				System.out.println("이번달은 31일 까지입니다");
				yield 31;
			}
			case 2->
				28;
			case 4,6,8,11 -> {
				System.out.println("이번달은 30일 까지입니다");
				yield 30;
				
			}
			default ->{
				System.out.println("존재하지 않는 달");
				yield -1;
				
			}
		
		};
		System.out.println(month+"월은"+day+"일까지 입니다");
		
	}

}
*/
