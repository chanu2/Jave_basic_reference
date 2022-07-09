package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")){   // 한 바이트 단위로만 읽기 때문에 한글을 읽으려면 
			
			byte[] bs = new byte[10];
			while( (i=fis.read(bs,1,9)) != -1 ){ // 파일을 다 읽을 때 까지   // bs,1,9 이런식으로도 가능
				for(int j=0 ; j<i;j++ ){
					System.out.print((char)bs[j]);      // 만약에 for(int a : bs) 로해서 출력하면 나머지도 더 나온다  자료가 남아있기 때문에 UVWXYZQRST 이것 까지 나온다.
				}
				System.out.println(" : " + i + " 바이트 읽음");
			}
			
		}catch(IOException e ) {
			System.out.println(e);
		}
	}

}
