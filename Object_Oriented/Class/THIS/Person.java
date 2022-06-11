// 12. 객체 자신을 가리키는 this

// this가 하는 일


// -인스턴스 자신의 메모리를 가리킴


// -생성자에서 또 다른 생성자를 호출 할때 사용


// -자신의 주소(참조값)을 반환 함








// 생성된 인스턴스 메모리의 주소를 가짐

// -클래스 내에서 참조변수가 가지는 주소 값과 동일 한 주소 값을 가지는 키워드









package ch12;

public class Person {     // 생성자에서 this를 이용하여 다른 생성자 부르기
	String name;
	int age;
	
	public Person() {      // default 컨스트럭쳐
		// 아래를 불러 온다
		//int age =10;   내부에 이런코드는 불가능하다
		this("no name",1);   //이게 가장 먼저 나와야한다   --- 아무 값이 입력 되지 않았을 때 초기화 해주기 위해 사용
		
	}
	public Person(String name,int age) { 
		this.name=name;
		this.age=age;
		
	}
	public void showPerson() {
		System.out.println(name+" "+age);
	}
	
	
	public Person getPerson() { // this의 역할 중에 자신의 주소를 반환할 수 있다  
		 //반환 인자
		return this;
	}
	
	// 테스트 코드를 한곳에 하는 법     
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);   //패키지 까지 포함된 class풀네임  jvm이 assign해준 인스턴스 주소
		Person person2=person.getPerson();
	   //반환 인자
		System.out.println(person2);
	}   

	
	 

}
