package ch01;


class Book{
	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
		
	}

	@Override
	public String toString() {   // toString override
		return title+','+author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("돈키호테","kim");
		System.out.println(book);  //ch01.Book@1c4af82c 뒤에 있는 값은 인스턴스 메모리의 위치에 대한 가상 메모리값(jvm이 준 값이다 (실제 ㅁ모리 값은 아니다))
		
		String str = new String("test");
		System.out.println(str); //test 문자열 값이 나온다 tostring이 오버라이딩 이미 재정의가 되었기 때문이다
		
	}

}
