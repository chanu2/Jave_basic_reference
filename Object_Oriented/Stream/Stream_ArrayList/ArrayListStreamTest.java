package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>(); // List는 상위클래서 arrayList와 linkedList등
		sList.add("kimsdf");
		sList.add("hasdfsd");
		sList.add("jun");
		Stream<String> stream = sList.stream(); // 콜렉션들은 다 stream을 호출가능 
		stream.forEach(s -> System.out.println(s));
		
		sList.stream().sorted().forEach(s-> System.out.println(s + "\t")); 
		System.out.println();
		sList.stream().map(s ->s.length()).forEach(n-> System.out.println(n + "\t"));  // map은 객체 자체에 대한 연산을 실행 할때 get,set메서드 등등 이용할 때   
		sList.stream().filter(s -> s.length() >=5).forEach(s-> System.out.println(s + "\t")); 
		System.out.println(); 
	}

}
