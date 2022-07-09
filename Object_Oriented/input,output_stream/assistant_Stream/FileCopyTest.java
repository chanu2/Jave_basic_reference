// chapter6 안에 a.zip파일이 있을 때 파일을 복사하는 문제

package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	public static void main(String[] args) {
		
		long millisecond = 0;
	
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));//버퍼로 감싸준다(더 빨리 읽고 쓰기위해서)  // 여기서 읽고
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){ // 여기서 쓴다 
			millisecond=System.currentTimeMillis();  // 현재시간
			
			int i;
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond=System.currentTimeMillis()-millisecond;  // 걸린시간
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(millisecond+" 소요되었습니다");
		
		
		//Socket socket = new Socket();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  // InputStream로 읽고  InputStreamReader로 한글을 읽고 BufferedReader 더빠르게 읽고 
		//BufferedReader readline() 한 줄씩 읽기 기능이 있다.
		
		
	}

}
