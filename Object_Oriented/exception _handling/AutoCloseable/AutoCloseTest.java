package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {
		 AutoCloseObj obj = new AutoCloseObj();
		 
		 try(obj){
			 throw new Exception(); // 강제로 Exception 만들기
		 }catch(Exception e){ // 그냥 Exception으로 처리 어떤 예외인지 상관없이
			 System.out.println("exception");
		 }
		 
		 System.out.println("end");
	}

}
