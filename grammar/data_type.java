
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




// package ch06;

// public class VariableTest {

// 	public static void main(String[] args) {
// 		byte bnum=127;
// 		System.out.println(bnum);
// 		long num=12345678900L;
// 		System.out.println(num);
// 	}

// }




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







