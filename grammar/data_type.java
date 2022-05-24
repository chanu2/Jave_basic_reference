
// package ch04;

// public class BinaryTest {

// 	public static void main(String[] args) {
// 		int num=10;  
// 		int Bnum = 0B1010;    //이진수를 나타내는 0B
// 		int oNUM =012;        // 8진수를 나태내는  0
// 		int xNUM =0XA;        // 16진수를 나타내는 0X
// 		System.out.println(Bnum);
// 		System.out.println(oNUM);
// 		System.out.println(xNUM);
// 	}


// 변수를 선언할 때는 처음에 소문자로 시작하다가 단어가 바뀌었을 떄 처음에 대문자를 사용해주는 관습을 따른다.





//byte : 1바이트 단위의 자료형 동영상, 음악 파일, 실행 파일의 자료를 처리할 때 사용
//short: 2바이트 단위의 자료형 C/C++ 언어와 호환 시 사용

//int 

// 자바에서 사용하는 정수에 대한 기본 자료 형
// 4바이트 단위의 자료형 
// 프로그램에서 사용하는 모든 숫자(리터럴)은 int 로 저장됨    --> 리터럴 우리가 프로그램안에서 정수를 쓰게되면 정수는 무조건 4byte로 잡힌다(이미 지정된 데이터 타입으로 잡혀있는 상태)
// 32 비트를 초과하는 숫자는 long 자료형으로 처리


//long

// 8바이트 자료형
// 숫자의 뒤에 알파벳 L 또는 l 을 써서 long 형임을 표시 함
// 예) int num = 12345678900; // 오류   int의 범위를 넘어가기 떄문에
// long lnum = 12345678900; //오류     이미 리터럴 이기 때문에 정수가 4btye로 잡혀있기 때문에
// long lnumber = 12345678900L; // ok     L이라는 표시를 해줘야한다



//데이터 타입 정수형
// package ch06;

// public class VariableTest {

// 	public static void main(String[] args) {
// 		byte bnum=127;                                  
// 		System.out.println(bnum);
// 		long num=12345678900L;
// 		System.out.println(num);
// 	}

// }



//데이터 타입 실수형
//실수는 리터럴에 의해서 기본적으로 8BYTE인 double에 저장된다


// package ch07;

// public class Doubletest {

// 	public static void main(String[] args) {
// 		double dnum=3.14;
// 		float fnum = 3.14f;  실수는 double로 자동으로 설정되기 떄문에 float 실수형을 사용하게 되면 8byte --> 4btye로 바뀌기 때문에 range를 벚어난다 그렇기 때문에 f를 써줘야한다.
// 		System.out.println(dnum);
// 		System.out.println(fnum);
// 	}

// }


// 부동소수점

// 실수는 정수 보다 정밀하기 때문에 정수와는 다른 방식으로 표현해야 함
// 부동 소수점 방식으로 실수 값 0.1 표현  ----->  1.0*10**(-1)
// 지수부와 가수부로 표현 함
// 컴퓨터에서는 밑수를 2로 사용
// 정규화 : 가수가 밑수보다 작은 한 자리까지 가수로 표현 되는 것
// 컴퓨터에서는 밑수가 2 이므로 정규화를 하게 되면 가수부분의 첫 번째 자리 숫자는 항상 1임 
// 예) 0.2 표현 0.4 X 2-1  정규화 하면 1.6 X 2-3






//부동 소수점의 오류 예제


//    public class DoubleTest2 {

// 	public static void main(String[] args) {

// 		double dnum = 1;                                      출력값-------->1001.000000000159
		
// 		for(int i = 0; i<10000; i++) {
// 			dnum = dnum + 0.1;
// 		}
// 		System.out.println(dnum);
// 	}
// }




//문자 타입
// character set: 문자를 숫자로 변환한 값의 세트
// encoding: 문자가 숫자로 변환되는 것
// decoding: 숫자에서 다시 문자로 변환되는 것
// ASKII code: 알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트
// UNICODE: 전 세계 표준으로 만든 문자 세트
// UTF-8: 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음
// UTF-16: 2바이트로 문자를 표현



// char 2byte
// package ch08;

// public class CharacterTest {

// 	public static void main(String[] args) {

// 		char ch1 = 'A';
// 		System.out.println(ch1);
// 		System.out.println((int)ch1);  # 강제 정수로 전환
		
// 		char ch2 = 66;
// 		System.out.println(ch2);     
		
// 		int ch3 = 67;
// 		System.out.println(ch3);
// 		System.out.println((char)ch3);
		
// 		//char ch4 = -66;  음수는 대입 할 수 없음

//     		char ch5 = '한';
// 		char ch6 = '\uD55C';
		
// 		System.out.println(ch5);
// 		System.out.println(ch6);
// 	}
// }




//자료형(data type)- 논리형과 자료형 없이 변수 사용하기



// 논리형
// true(참), false(거짓) 두 가지만 나타냄
// 1바이트를 사용 함
// 값이 존재하는지, 배열이 비었는지, 결과가 참인지 거짓인지등을 표현



//지역 변수 자료형 없이 사용하기 (  자바 10 지원 됨 )


// Local variable type inference
// 추론 가능한 변수에 대한 자료형을 선언하지 않음
// 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
// 지역 변수만 사용 가능



// package ch09;

// public class Global {

// 	public static void main(String[] args) {
// 		var i =10;
// 		var j =10.0;
// 		var str ="test";
// 		System.out.println(i);
// 		System.out.println(j);
// 		System.out.println(str);
		
// 		var str2 =str;    
// 		System.out.println(str2);
		
// 		str ="hellow";     // 다른 문자열을 할당할 수 있다.
// 		//str=3;    //이미 문자열 데이터이기 떄문에 정수형 변수를 넣을 수 없다.
		
				
		
// 	}

// }




//상수(constant) 선언하기


// 상수를 사용하는 이유 가독성이 좋아지며
//상수는 변하지 않는 수
//원주률 3.14, 1년 12개월 등
//final 예약어를 사용하여 선언
//상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고
//혹, 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없음


/*
package ch12;

public class Final {

	public static void main(String[] args) {
		final int Max_Num=100;   //final 상수로 고정
		final int Mini_Num;
		Mini_Num =20;
		//Max_Num=20;   이미 고정된 값이 있기 때문에 바꿀 수 없다.
	
		System.out.println(Max_Num);
		System.out.println(Mini_Num);
		
	}

}     */




//**리터럴**

// 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함
// 리터럴은 상수 풀(constant pool)에 있음
// 정수 리터럴은 int 로 실수 리터럴은 double 로 저장됨
// 정수의 범위가 넘어가는 경우는 L,l을 float로 사용하려는 경우는 F,f 식별자를 써줘야 함




// 형변환

// 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
// 묵시적 형 변환(explicit type conversion, 자동 형 변환)과 명시적 형 변환(implicit type conversion, 강제 형 변환)이 있음
// 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 짐
// 덜 정밀한 자료형에서 더 정밀한 자료형으로읜 형 변환은 자동으로 이루어 짐  int->float




// package ch13;

// public class Riteral {

// 	public static void main(String[] args) {
// 		/*int inum = 2266;    
// 		byte bnum = (byte)inum;    강제 캐스팅하게 되면 손실이 발생한다.
		
// 		System.out.println(bnum);   
		
// 		double dnum = 3.14;   
// 		int jnum = (int)dnum;
// 		System.out.println(jnum); */
		
		
// 		double dnum =1.14;
// 		float fnum = 0.9f;
// 		// 형변환을 하는 순서에 따라 값이 변한다
// 		int inum = (int)dnum + (int)fnum;        
// 		int i2num = (int)(dnum+fnum);  //첫번째 double 형으론 변환됨  
// 		System.out.println(inum);       
// 		System.out.println(i2num);
				
		
// 	}

// }  




