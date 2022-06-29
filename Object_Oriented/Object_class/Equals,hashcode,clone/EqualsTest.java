package ch02;

public  class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {// 항상 clone은 선언을 해줘야한다. 복제해도 된다는
		Student student1 = new Student(1235,"찬우");
		Student student2 = new Student(1235,"찬우");
		Student student3=student1; // 주소값만 복사한 것
		System.out.println(student1==student3); //당연히 같다   
		System.out.println(student1.equals(student2));  // 두개의 주소 값이 같냐?를 확인   우리가 학번이나 계좌,번호 이런것들이 같으면 같은 사람이란 것을 논리적으로 같다고 해야 합산도하고 출결도 하고 등 논리적으로 같다는것을 오버라이딩 하면 된다 equals
		//실제 주소는 다르지만 논리적으로 같다
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());  // 논리적으로 같기 떄문에 같은 hashcode반환
		
		/*
		//ex)
		String std1 = new String("abc");
		String std2 = new String("abc");
		System.out.println(std1.equals(std2));   //equals에서 true를 반환한다. 재정의 했기 때문에
		
		
		System.out.println(std1.hashCode());     // 같은 hashcode가 반환된다.
		System.out.println(std2.hashCode());
		*/
		
		System.out.println(System.identityHashCode(student1));  // 실제 hashcode 값 서로다른 값이 나온다 
		System.out.println(System.identityHashCode(student2));
		
		
		student1.setStudentName("재은");  //clone이기 때문에 같이 바뀌는 것을 확인할 수 있다.
		Student copyStudent = (Student)student1.clone(); // 원래는 오브젝트로 받지만 Student 타입으로 변환   // 복제 완료
		System.out.println(copyStudent); // 우리는 이미 toString을 정의했다
	}

}
