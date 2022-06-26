package ch15;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;  // 하위클래스의 접근을 위해서
	
	public Shelf() {
		shelf = new ArrayList<>();  // 생성자에서 멤버 변수를 초기화하는 코드,
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size(); 
	}
}
