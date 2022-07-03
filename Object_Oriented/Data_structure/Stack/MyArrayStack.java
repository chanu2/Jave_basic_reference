package ch04;

import ch02.MyArray; //ch02.MyArray 메서드를 이용하기 위해서 import해준다. 

public class MyArrayStack {
	 MyArray arrayStack;  // ch02 불러오기
	 int top; //맨위의 위치
	 
	 public MyArrayStack() {  // 아무것도 안할 떄
		 top = 0;
		 arrayStack = new MyArray();
	 }
	 public MyArrayStack(int size) {
		 top = 0;
		 arrayStack = new MyArray(size);
	 }
	 
	 public void push(int data) {  // 배열이면 꽉찼는지 확인해야한다. 링크드 리스트는 상관없음
		 if (isFull()){
			 System.out.println(MyArray.ERROR_NUM);
			 return ;
		 } 
		 
		 arrayStack.addElement(data);  // 끝에 추가하는 메서드
		 top++;
			  
		 
	 }
	 
	 public int pop() {
		if(isEmpty()) {
			return MyArray.ERROR_NUM;
		}
		
		return arrayStack.removeElement(--top); // 위치를 먼저 감소시키고 오퍼레이션을 진행한다
	 }
	 
	 public int peek() {
			if(isEmpty()) {
				return MyArray.ERROR_NUM;
			}
			
			return arrayStack.getElement(--top); //위치를 반환
		 }
	 
	 public boolean isEmpty() {
		 if(top == 0 ) {
			 return true;
		 }
		 else return false;
	 }
	 
	 public boolean isFull() {
		 if(top == arrayStack.ARRAY_SIZE) {
			 return true;
			 
		 }
		 else return false;
	 }
	 
	 public void printAll() {
		 arrayStack.printAll();
	 }
}
