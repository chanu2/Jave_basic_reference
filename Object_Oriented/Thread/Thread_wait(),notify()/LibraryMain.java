package ch23;

import java.util.ArrayList;

class FastRibrary{
	
	public ArrayList<String> shelf = new ArrayList();
	
	public FastRibrary() {
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
		
		
	}
	
	public synchronized String lendBook() throws InterruptedException {  // 아래에서 핸들링 하고 있기 때문에 쓰로우 한다
		
		Thread t = Thread.currentThread();  // 매서드를 실행하고 있는 Thread에 대한 정보
		
		while (shelf.size() == 0) { // 리소스가 없다면
			System.out.println(t.getName() + " waiting start");
			wait();   //object 매서드   // 이 매서드를 수행하고 있는 Thread를 non-runable 상태로 빠지게 한다
			System.out.println(t.getName() + " waiting end");
		}
		
		if(shelf.size() > 0) {
			
			String book = shelf.remove(0);   // 맨앞에 있는 책 빌려가기
			System.out.println(t.getName() + ": "+book + " lend");
			return book;
			
		}
		else return null;
		
	}
	
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		shelf.add(book);
		notifyAll();  // non - runnable 상태의 Thread를 다 깨운다 
		System.out.println(t.getName() + ": "+ book + " return");
		
	}
}

class Student extends Thread{
	
	public Student (String name) {
		super(name);  //super는 Thread!!!
	}
	
	public void run() {
		
		
		try {
			String title = LibraryMain.library.lendBook();
			
			if(title == null) {
				System.out.println(getName() + "빌리지 못했다");
				return;
			}
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		
	}
}

public class LibraryMain {
	
	public static FastRibrary library = new FastRibrary();

	public static void main(String[] args) {
		
		Student st1 = new Student("std1");
		Student st2 = new Student("std2");
		Student st3 = new Student("std3");
		Student st4 = new Student("std4");
		Student st5 = new Student("std5");
		Student st6 = new Student("std6");
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		st6.start();
		
		
		
	}

}
