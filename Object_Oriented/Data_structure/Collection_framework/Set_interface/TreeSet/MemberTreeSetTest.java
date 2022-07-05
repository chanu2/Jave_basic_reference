package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		/*
		TreeSet<String> set = new TreeSet<>();   // binary search tree이기 떄문에   // String은 이미 compareable이 있기때문에 정렬이 가능하다.
		
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신"); 
		
		System.out.println(set); //[강감찬, 이순신, 홍길동]
		*/
		
	    /*
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member member4 = new Member(1237, "park"); 
		Member member1 = new Member(123, "chanwoo");
		Member member2 = new Member(1234, "HA");         class ch13.Member cannot be cast to class java.lang.Comparable
		Member member3 = new Member(1235, "sue");        number class에  Comparable또는 Comparator가  구현이 되어있지 않기 때문에 정렬이 안된다 
		
		memberTreeSet.addMerber(member4);  
		memberTreeSet.addMerber(member1);
		memberTreeSet.addMerber(member2);
		memberTreeSet.addMerber(member3);
		
		 
		
		memberTreeSet.showMember();
	    */
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member member4 = new Member(1001, "park"); 
		Member member1 = new Member(1003, "chanwoo");
		Member member2 = new Member(1002, "HA");         
		Member member3 = new Member(1004, "sue");       
		
		memberTreeSet.addMerber(member4);  
		memberTreeSet.addMerber(member1);
		memberTreeSet.addMerber(member2);
		memberTreeSet.addMerber(member3);
		
		 
		
		memberTreeSet.showMember();
	
		
	}

}
