package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());  // FileNotFoundException의 상위 이셉션 IOException으로 대체 // read하면서 IOException 발생 
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
			try {
				fis.close();   // close과정에서 발생하는 예외처리 
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch(Exception e2){
				System.out.println(e2);     // 파일이 null인데 close할 때 발생하는 예외처리  이게 없으면 end가 안찍히고 비정상 종료된다
			}
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(Exception e2){
				
				System.out.println(e2);   // 파일이 null인데 close할 때 발생하는 예외처리
			}
		}
		System.out.println("end");
	}

}
