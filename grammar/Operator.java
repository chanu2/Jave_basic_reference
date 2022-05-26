// 증감 연산자!!!!!


/*
public class OperaterTest {

	public static void main(String[] args) {
		int gameScore =150;
		int lastScore = ++gameScore;   //gameScore+=1  // *statement가 끝나기전에 값이 증감된다.* 
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		gameScore =159;
		lastScore = gameScore++;     // statement가 끝나고 나서 값이 증가된다
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		
		gameScore =170;
		lastScore = --gameScore;     // statement가 끝나기 전에 값이 감소
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		
		
		gameScore =200;
		lastScore = gameScore--;     // statement가 끝나고 나서 값이 감소
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		
	} /*
	
	
	



//  단락 회로 평가 

/*
package ch15;

public class Logic {

	public static void main(String[] args) {
		int num1 =10;
		int i =2;
		boolean value=((num1=num1+10)<10) && (i=i+2)<10;
		System.out.println(value);   //false
		System.out.println(num1);    // 20
		System.out.println(i);       //2   논리 곱이기 떄문에 둘다 True를 만족 해야 하지만 처음에 fales가 나왔기 때문에
	}                                //    두번쨰 조건은 실행되지 않기 떄문에 i 값은 그대로이다.  */
	







//삼항연산자//


// 조건식 ? 결과1:결과2;    --> 조건식이 참이면 결과1 아니면 결과2 ex)    int num =(3>1)? 10:20;




/*
package ch16;

import java.util.Scanner;    // Scanner선언

public class ConitionTest {

	public static void main(String[] args) {
		int max;
		System.out.println("두수를 입력받아 더 큰수를 반환하세요");
		Scanner scanner = new Scanner(System.in); // 입력을 받는 코드
		int num1= scanner.nextInt();  // int로 입력을 받는다
		int num2= scanner.nextInt();  // int로 입력을 받는다
		max = (num1>num2)? num1:num2; // 삼항 연산자 
		System.out.println(max);
		
	}

}  */






// 비트 연산자

/*
package ch17;

public class BitOperation {

	public static void main(String[] args) {
		int num1=5;  //00000101
		int num2=10; //00001010
		
	System.out.println(num1 & num2);  //00000000
	System.out.println(num1 | num2);  //00001111
	System.out.println(num1 ^ num2);  //00001111 --> 같을 떄만 0
	System.out.println(~num1);        //11111010 음수 
	System.out.println(num1 << 2);    // 000010100
	System.out.println(num1); // num 값이 변하지는 않는다.
	System.out.println(num1 <<=2);  // 대입연산자를 통해서 값을 바꿔줄 수 있다.
	
	
	
	}

} */


