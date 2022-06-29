package ch03;

public class StringBiulderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);  //매개변수로 String이 가능하기 떄문에 java를 넣는다 
		System.out.println(System.identityHashCode(buffer)); // 동일한 주소가 나온다
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		
		String test = buffer.toString(); // toString을 사용하는 경우가 많다
		System.out.println(test);
	}

}
