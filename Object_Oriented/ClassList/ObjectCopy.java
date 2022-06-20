package ch19;
//System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드


//얕은 복사
//객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨
//즉, 두 배열이 같은 객체를 가리킴




public class ObjectCopy {

	public static void main(String[] args) {
		/// 객체를 카피하는 법
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];  // 복사 할 배열을 생성
		library[0] = new Book("나의라임오렌지나무1","김찬우");
		library[1] = new Book("나의라임오렌지나무2","김찬우");
		library[2] = new Book("나의라임오렌지나무3","김찬우");
		library[3] = new Book("나의라임오렌지나무4","김찬우");
		library[4] = new Book("나의라임오렌지나무5","김찬우");
		System.arraycopy(library, 0, copyLibrary, 0, 5);  // 같은 주소값을 반환하기 때문에 한곳을 바꾸면 다른쪽도 바뀐다.  
		// 객체를 카피하는 문법 (메서드)  
		//System.arraycopy(library, 0, copyLibrary, 0, 5) --> library의 0번째  부터 복사해서 copyLibrary의 0번째 부터 5개를 복사한다.
    
    
		library[0].setAuthor("재은");
		library[0].setTitle("레몬트리");  //주소를 공유하기 때문에 같이 바뀌게 된다.
		
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


