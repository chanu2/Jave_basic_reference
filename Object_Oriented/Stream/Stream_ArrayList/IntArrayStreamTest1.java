package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.print(n + "\t"));
		System.out.println();
					
		int sum  = Arrays.stream(arr).sum();
		System.out.println("sum: " + sum);
		
		List<Integer> list = new ArrayList<Integer>(); // 컬렉션
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum2 = list.stream().mapToInt(n->n.intValue()).sum(); // mapToInt 스트림을 IntStream으로 변환해주는 메서드다.
		System.out.println(sum2);
	}

}
