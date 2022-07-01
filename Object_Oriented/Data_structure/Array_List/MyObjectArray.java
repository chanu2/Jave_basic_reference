package ch02;

public class MyObjectArray {

	private int count;
	private Object[] array;   // 리스트는 object형으로 여러가지 형을 사용가능하다
	public int ARRAY_SIZE;
	
	public MyObjectArray()
	{
		ARRAY_SIZE = 10;
		array = new Object[ARRAY_SIZE];
	}
	
	public MyObjectArray(int size)
	{
		ARRAY_SIZE = size;
		array = new Object[ARRAY_SIZE];
	}
	
	

	
	
	
}
