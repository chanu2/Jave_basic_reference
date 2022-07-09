package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {   // 파일을 쓰는것 

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt",true);//원래는 오버 라이트로 파일이 처음부터 다시 써지는데 true를 넣으면 append처럼 이어쓰기 가능하다
		
		try(fos){
			
			byte[] bs =new byte[26];
			byte data = 65;
			
			for(int i=0; i<bs.length; i++) {
				bs[i]=data++;
			}
			
			fos.write(bs); //bs,2,10 가능  c 부터 시작해서 10개
			
		}catch(IOException e){ // IOException 상위클래스로서 포함한다 
			System.out.println(e);
		}
		System.out.println("end");
	}

}
