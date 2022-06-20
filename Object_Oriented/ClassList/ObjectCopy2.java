package ch19;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		library[0] = new Book("나의라임오렌지나무1","김찬우");
		library[1] = new Book("나의라임오렌지나무2","김찬우");
		library[2] = new Book("나의라임오렌지나무3","김찬우");
		library[3] = new Book("나의라임오렌지나무4","김찬우");
		library[4] = new Book("나의라임오렌지나무5","김찬우");
		
		copyLibrary[0]= new Book();    // 객체를 이미 만들고 타이틀과 어썰을 넣어준다.
		copyLibrary[1]= new Book();    // 같이 바뀌지 않는다. --> 같은 주소를 가르키지 않는다.
		copyLibrary[2]= new Book();
		copyLibrary[3]= new Book();
		copyLibrary[4]= new Book();
		for(int i=0;i<library.length;i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
			
		}
		
		
		library[0].setAuthor("재은");
		library[0].setTitle("귀염");
		
		
		System.out.println("== library==");
		for(Book book:library) {
			System.out.println(book);
			book.showInfo(); 
			
		}
		System.out.println("== copyLibrary==");
		for(Book book:copyLibrary) {
			System.out.println(book);
			book.showInfo();
			
		}


	}

}
