package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{  // 이미 String에는 Comparable이 구현되있다

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);  // 원래 그래도
	}
	
}

public class MyCompareTest {

	public static void main(String[] args) {
		
		
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());  // 오름차순으로 나온다
		set.add("park");
		set.add("kim");
		set.add("lee");
		
		System.out.println(set);

	}

}
