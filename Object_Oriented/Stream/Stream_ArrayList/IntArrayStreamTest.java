package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		for (int num : arr) {
			System.out.println(num);
		}
		 System.out.println();
		 
		 IntStream is = Arrays.stream(arr);   // Int일때 가능한 매서드들을 알수 있다.
		 is.forEach(n -> System.out.println(n)); // 이코드가 실행되고 is. 불가능하다 다 사라지기 때문에
		 //Arrays.stream(arr).forEach(n -> System.out.println(n)); // 이렇게 쓰는 것도 가능하다  /forEach하나씩 꺼내서 무엇을 할것 인가 람다식으로 
		
		 int sum = Arrays.stream(arr).sum();  // 스트림을 다시 만들어 줘야한다
		 System.out.println(sum);
		
		
		
	}

}
