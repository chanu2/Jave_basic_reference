package ch19;

public class BookTest {

	public static void main(String[] args) {   // 객체 5개가 생성되는 것이 아니다.!!
		Book[] library = new Book[5];
		
//		for(int i=0; i<library.length;i++) {
//			System.out.println(library[i]);
//			
//		}
		
		library[0] = new Book("나의라임오렌지나무1","김찬우");  //객체를 각각 만들어 줘서 넣어야한다. 
		library[1] = new Book("나의라임오렌지나무2","김찬우");
		library[2] = new Book("나의라임오렌지나무3","김찬우");
		library[3] = new Book("나의라임오렌지나무4","김찬우");
		library[4] = new Book("나의라임오렌지나무5","김찬우");
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
			
		}
		
	}

}
