package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;  // 파일을 읽어주는 
		try {
			fis = new FileInputStream("a.txt");  // 예외처리가 필요하다
			try {
				fis.close();    // 파일을 열었으면 항상 닫아줘야한다
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();  // 틀린 곳을 추적해준다.
			System.out.println(e);
			//return;  end는 불리지 않지만 finally는 불린다. 
//			try {
//				fis.close();
//			} catch (IOException e1) {                    너무 많아 지고 복잡해진다. 그래서 finally를 이용한다
//				e1.printStackTrace();
//			}
			
		}finally {
			if(fis != null) {  // 파일이 열렸을 때만 닫아 줘야하기 때문에 조건문을 걸어준다.
				try {
					fis.close();
				} catch (IOException e) {   /// finally는 항상 불린다!!!
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		
		System.out.println("end");
	}

}
