package ch02;

public class MyArray {  // 케퍼서티를 잡는다고 하고 캐퍼서티를 다 사용하지는 않는다.

	int[] intArr;   	//int array   리스트를 잡고 시작하게 된다 100개 그러나 우리가 사용하는 요소가 더 적을 수도 있다.
	int count;  		//개수
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		count = 0;    // 컨스트럭트로서 아무것도 입력되지 않으면 
		ARRAY_SIZE = 10;  
		intArr = new int[ARRAY_SIZE];  // 사이즈를 10개 잡아라
	}
	
	public MyArray(int size)   // size가 입력되면 사이즈 만큼을 잡는다
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num)  //요소가들어오면
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;  // 넣고 나서 count를 1증가시킨다 그러므로 intArr[0]=num;이 들어간후 count를 증가 시킨다.
				
	}

	public void insertElement(int position, int num)
	{
		int i;
		if( position<0 || position > count ) {   // 추가할 위치가 너무 작거나 너무클 때
			System.out.println("error");
			return ;
			}
		if(count >= ARRAY_SIZE ) {  // 이미 꽉차있는 상태
			return;
		}
		
		for(i = count-1; i>= position;i--) {   // 끝에서 부터 모두 한칸 씩 옮기고 넣어준다.
			intArr[i+1]=intArr[i];
		}
		intArr[position]=num;
		count++;
	}
	
	public int removeElement(int position)   // 제거할 떄
	{
		int ret = ERROR_NUM;  // 에러 발생하면
		
		if (isEmpty()) { // 비어있을 때
			System.out.println("empty");
			return ret;
		}
		if(position < 0 || position > count-1 ) {  
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i<count-1;i++) {// 원하는 위치 값을 반환해주고 
			intArr[i]=intArr[i+1];             // 제거하기 원하는 다음 인덱스의 요소들을 i 인덱스로 넣어준다
		}
		count--;    // 제거했으므로 count-1
		return ret;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}
