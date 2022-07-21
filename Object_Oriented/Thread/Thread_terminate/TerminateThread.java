interrupt()


다른 Thread에 예외를 발생시키는 interrupt를 보낸다.


Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때 interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음


---------------------------------------------------------------------------------------------------------------------------------------

Thread 종료하기


Thread를 종료할 때 사용함


무한 반복의 경우 while(flag)의 flag 변수값을 false로 바꾸어 종료를 시킴



---------------------------------------------------------------------------------------------------------------------------------------



package ch21;

import java.io.IOException;

public class TerminateThread extends Thread{

	private boolean flag = false;   
	int i;
	
	public TerminateThread(String name){
		super(name);
	}
	
	public void run(){
		
		
		while(!flag){  // flag가 TRUE일때 반복분 실행
			try {
				sleep(100);     // 재우기
			} catch (InterruptedException e) {  // InterruptedException 예외처리 하기
				e.printStackTrace();
			}
		}
		
		System.out.println( getName() + " end" );  //  getName()는 Thread이름 가져오기
		
	}
	
	public void setFlag(boolean flag){  //flag를 바꿔주는 메서드   //flag를 통해서 무한 반복문을 제어한다!!
		this.flag = flag;     
	}
	
	
	public static void main(String[] args) throws IOException {

		TerminateThread threadA = new TerminateThread("A");  // 이떄 A는 Thread이름
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true){
			in = System.in.read();   // 입력을 받는 코드
			if ( in == 'A'){
				threadA.setFlag(true);
			}else if(in == 'B'){
				threadB.setFlag(true);
			}else if( in == 'C'){
				threadC.setFlag(true);
			}else if( in == 'M'){
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}else{
				System.out.println("type again");
			}
		}
		
		System.out.println("main end");
		
	}
}
