package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		
		rf.writeInt(100);  // int 형으로 4바이트 
		System.out.println("pos: "+ rf.getFilePointer() );
		rf.writeDouble(3.14); // double 8 바이트
		System.out.println("pos: "+ rf.getFilePointer() );
		rf.writeUTF("안녕하세요"); // 한글은 한글자에 3바이트  + 스트링은 마지막에 null 캐릭터 2바이트
		System.out.println("pos: "+ rf.getFilePointer() );
		
		
		rf.seek(0);  // 맨 처음 포지션으로 포인터를 이동시킨다 // 포지션위치를 원하는 곳으로 갈 수 있다
 		
		int i = rf.readInt();
		double d = rf.readDouble();
		String s = rf.readUTF();
		
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
	}

}
