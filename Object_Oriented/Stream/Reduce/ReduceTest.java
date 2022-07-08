package ch07;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{  // reduce가 길어지면  BinaryOperator를 implements해서 만들어서 사용

	@Override
	public String apply(String s1, String s2) {  // 두개를 받아서 계속 실행
		if(s1.getBytes().length >= s2.getBytes().length) {             // reduce 직접 바로 사용
			return s1;
		}
		else return s2;
		
	}
	
} 

public class ReduceTest {

	public static void main(String[] args) {
		String greetings[]= {"안녕하세요~~","HELLOW","GOOd morning","반갑스므니다!!"};  // 컬렉션이 아니다
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) ->
			{if(s1.getBytes().length >= s2.getBytes().length) {             // reduce 직접 바로 사용
				return s1;
			}
			else return s2;}	
		));
		
		
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
