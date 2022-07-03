package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {
		MyArrayStack stack =new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);  //array를 3으로 잡았기 때문에 들어가지 않는다
		stack.printAll();  
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());  // 탑의 위치의 값을 반환한다.
		
		
		

	}

}
