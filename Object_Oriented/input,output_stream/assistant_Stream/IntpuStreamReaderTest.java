package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntpuStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader irs = new InputStreamReader (new FileInputStream("reader.txt"))){ // FileInputStream을 감싸겠다
			
			int i;
			while( (i= irs.read()) != -1 ) {   // 보조스트림으로 읽습니다
				System.out.print((char)i);
			}
		}catch(IOException e){  //close는 딱히 신경 쓸거 없다
			
			System.out.println(e);
		}

	}

}
