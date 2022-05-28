//객체

// 온라인 쇼핑몰에 회원 로그인을 하고 여러 판매자가 판매하고 있는 제품 중 하나를 골라 주문을 한다

// 아침에 회사에 가는 길에 별다방 커피숍에 들려 아이스 카페라떼를 주문했다

// 성적확인을 위해 학사 관리 시스템에 로그인 하여 수강 한 과목들의 성적을 확인했다


//객체의 속성은 클래스의 멤머 변수(member variable)로 선언 함




//객체지향 프로그래밍을 할 때

// 객체를 정의 하고


// 각 객체의 속성을 멤버 변수로 역할을 메서드로 구현하고


// 각 객체간의 협력을 구현합니다.   }





// 클래스 코딩하기

// 클래스는 대문자로 시작하는것이 좋음


// java 파일 하나에 클래스는 여러 개가 있을 수 있지만, public 클래스는 하나이고, public 클래스와 .java 파일의 이름은 동일함


// camel notation 방식으로 명명




// 함수 호출법
/*
package ch03;

public class FunctionTest {
	
	public static int addNum(int num1,int num2) {  //반환값이 존재할 때
		int result=0;
		result=num1+num2;
		return result;
	}
	public static void sayHellow(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calSum() {
		int sum=0;
		int i;
		for(i=1;i<=100;i++ ) {
			sum+=i;
			
		}
		
		return sum;
		 
	}
	
	
	public static void main(String[] args) {  // main이라는 지역에 지역변수들 존재 n1,n2 등등
		int n1 = 10;                          // 메인함수에 지역변수 메모리들이 저장된다. 만약 addNum이라는 함수를 호출하게 되면
		int n2 = 20;                          //  [(n1,n2,total)->(num1,num2,result)]  이런식으로 스택메모리의 함수의 메모리 공간이 생긴다.(위에 쌓인다는 느낌)
		                                      // 반환이되면 자동으로 메모리 없어진다. [(n1,n2,total)]   지역변수는 그지역 {}에서 쓰고 자동으로 없어진다.
		int total=addNum(n1,n2);    // 함수 메모리 관점에서 접근하기 
		System.out.println(total);

		
		
		
		
		sayHellow("hellow my name is chan");
		
		
		
		
		int total2=calSum();
		System.out.println(total2 );
		
		
		
		 
	}

}

*/


// 메서드

// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수


// 멤버 함수 (member function)이라고도 함


// 메서드를 구현함으로써 객체의 기능이 구현 됨


// 메서드의 이름은 그 객체를 사용하는 객체(클라이언트)에 맞게 짓는것이 좋음
// 예) getStudentName()

