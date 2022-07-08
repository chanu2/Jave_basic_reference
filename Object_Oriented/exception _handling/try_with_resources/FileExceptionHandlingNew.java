package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandlingNew {

	public static void main(String[] args) {
		
	
		//FileInputStream fis = null;  // 파일을 읽어주는 
		
		try (FileInputStream fis = new FileInputStream("a.txt")){ //FileInputStream는 AutoCloseable 가지고있어 자동으로 close된다
			
			System.out.println("read");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {//IOException CLOSE할때 발생할 수 있는 오류/ try내부에 쓰면 close저절로됨
			e.printStackTrace();
		}
		
		System.out.println("end");
			
			
	}

}
