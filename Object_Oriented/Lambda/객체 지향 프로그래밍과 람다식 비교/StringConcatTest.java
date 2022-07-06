package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		
	
		
		StringConcatIpl stringConcatIpl = new StringConcatIpl();
		stringConcatIpl.makeString("Hellow", "world");
		
		StringConcat stringConcat = (x,y)-> System.out.println(x+","+ y);  // 람다가 클래스 없이 돌아가는 것은 아니다. 익명클래스가 있다 
		stringConcat.makeString("Hellow", "world");
		
		StringConcat concat = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {   // 익명 클래스가 숨어져 있다
				// 람다식이 이렇게 변하게 된다
				System.out.println( s1+",,,,,,,,"+ s2);
			}
		};
		concat.makeString("Hellow", "world");
	}

}
