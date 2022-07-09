package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {   // 파일을 쓰는것 

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch(IOException e){ // IOException 상위클래스로서 포함한다 
			System.out.println(e);
		}
		System.out.println("end");
	}

}
