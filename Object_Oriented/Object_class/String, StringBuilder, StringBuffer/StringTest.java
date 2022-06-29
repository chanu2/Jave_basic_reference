package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); // 메모리를 확인하는 절차
		java= java.concat(android);
		System.out.println(java); //javaandroid가 출력되기는 하지만
		System.out.println(System.identityHashCode(java));  // 두개의 adress가 다르다
		
		// "java" 메모리는 사라지지 않고 "android"도 사라지지 않기 떄문에 메모리를 많이 잡아먹는다. 

		
	}

}
