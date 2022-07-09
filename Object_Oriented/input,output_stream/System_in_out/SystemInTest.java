package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			InputStreamReader irs = new InputStreamReader(System.in);  // 이제 읽을 때는 i=System.in.read  -- > i=irs.read로 읽으면 됨 //InputStreamReader 바이트 단위로 된것들 다 감쌀 수 있다.
			while((i=System.in.read()) != '\n') { // 한 바이트 씩 읽고 int로 반환  // 한글쓰면 오류
				//System.out.println(i);   // System.in은  InputStream으로써 1바이트씩 나중에 보조 스트림으로 감싸 한국말도 확인할 수 있게한다
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
