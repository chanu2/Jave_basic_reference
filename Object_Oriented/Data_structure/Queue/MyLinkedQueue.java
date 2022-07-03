package ch05;

import ch03.MyLinkedList;  // import 시켜 줘야한다
import ch03.MyListNode;

interface Queue{
	public void enQueue(String data);  //추가하는   // 인터페이스를 선언한다
	public String deQueue();
	public void printQueue();
	
}
public class MyLinkedQueue extends MyLinkedList implements Queue {
	
	MyListNode front;
	MyListNode rear;

	@Override
	public void enQueue(String data) {
		MyListNode  newNode;    // 선언
		if(isEmpty()) {
			newNode = addElement(data);  // 만든다 
			front = newNode;         //  node           --- 맨처음으로 들어갈 때
			rear =newNode;       
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData()+"-> added");
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			return null;
		}
		
		String data = front.getData();
		front = front.next;  // 앞을 빼고나서 fornt를 바꿔준다.
		
		if(front==null) {
			rear=null;   // 제거하고 아무것도 없을 때
		}
		return data;
	}

	@Override
	public void printQueue() {
		
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp !=null) {
				System.out.print("->");
			}
		}
		System.out.println(); 
		
	}

}
