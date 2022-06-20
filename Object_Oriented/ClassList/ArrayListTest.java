/*객체 배열을 구현한 클래스 ArrayList

java.util 패키지에서 제공되는 ArrayList


기존의 배열 선언과 사용 방식은 배열의 길이를 정하고 요소의 개수가 배열의 길이보다 커지면 배열을 재할당하고 복사해야 했음


배열의 요소를 추가하거나 삭제하면 다른 요소들의 이동에 대한 구현을 해야 함


ArrayList는 객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해 주는 클래스


이미 많은 메서드들이 최적의 알고리즘으로 구현되어 있어 각 메서드의 사용 방법만 익히면 유용하게 사용할 수 있음
*/





package ch23;

import java.util.ArrayList;

import ch19.Book;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>(); //생성자    ArrayList선언 이클래스가 어디에 있다라는걸 알려줘야함(import)
		// ctrl+shift+o  // 라이브러리 가져오기
		library.add(new Book("태박산맥1","김찬우"));  // 객체를 생성해주고 넣어야한다
		library.add(new Book("태박산맥2","김찬우")); 
		library.add(new Book("태박산맥3","김찬우"));
		library.add(new Book("태박산맥4","김찬우")); 
		library.add(new Book("태박산맥5","김찬우"));
		
		for(int i=0;i<library.size();i++) {  // size() 요소의 개수 전체가아니라 몇개가 들어가 있는지
			library.get(i).showInfo();
		}
	}

}


// 꿀팀 마우스를 갖다 놓고 F1누르면 자바 도움이나온다 거기서 매서드와 등 확인하여 사용 할 수 있다.
