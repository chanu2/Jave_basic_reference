package ch03;
// 연결리스트는 대부분 두가지로 구현하는데
// head에 data를 넣고 시작하는 연결리스트(현재 내가 사용하는 방식)
// head node는 비워두고 다음부터 data가 들어가는 연결리스트

public class MyLinkedList {

	private MyListNode head;
	int count;
	
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public MyListNode addElement( String data )
	{
		MyListNode newNode;  // 새로 들어갈 노드
		if(head==null){  // 첫 노드일 떄                  
			newNode = new MyListNode(data);           // 맨 처음일 떄
			head=newNode;
		}
		else {
			newNode = new MyListNode(data);   // 맨 마지막에 넣기
			MyListNode temp = head;  // 연결리스트의 마지막을 찾아야 한다!
			while(temp.next != null) {  // 노드의 링크 부분이 null일때 까지
				temp=temp.next; // 이동해주는 코드
			}
			temp.next=newNode;  //링크에 넣어주기
		}
		count++;
		return newNode; //반환
	}
	
	public MyListNode insertElement(int position, String data )
	{
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null; // 앞의 노드를 찾기위해서
		
		MyListNode newNode = new MyListNode(data); 
		
		if (position < 0 || count > position ) {  // 포지션이 가능한 위치인가 확인 
			return null;
		}
		if(position==0) { // 맨앞으로 들어가는 경우
			newNode.next = head; //삽입할 노드의 링크값에 head를 너어준다
			head=newNode;
		}
		else {
			for(i = 0; i <position;i++) { // pre의 위치를 찾아준다
				preNode = tempNode;
					tempNode = preNode.next;
			}
				newNode.next = preNode.next;
				preNode.next = newNode; 
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position)  //이전 노드를 찾는것이 중요함
	{
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		if (position < 0 || count > position ) {  // 포지션이 가능한 위치인가 확인 
			return null;
		}
		
		if(position==0) { 
			head = tempNode.next;  // 처음을 제거할 떄
		}
		
		else{
			for(i=0;i<position;i++) {
		
			preNode = tempNode;
			tempNode = preNode.next;   // 지워지는 노드는 temp 
			
			}
			preNode.next= tempNode.next;
			 
		}
		count--;
		return tempNode;
			
			
		
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}
