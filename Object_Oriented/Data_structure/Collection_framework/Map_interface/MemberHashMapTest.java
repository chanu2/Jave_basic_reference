package ch14;


public class MemberHashMapTest {   // 정렬되지는 않는다!!

	public static void main(String[] args) {
		
		
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member4 = new Member(1004, "aark"); 
		Member member1 = new Member(1001, "chanwoo");
		Member member2 = new Member(1002, "HA");         
		Member member3 = new Member(1003, "sue");       
		
		memberHashMap.addMember(member2);  
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member4);
		memberHashMap.addMember(member3);
		
		 
		
		memberHashMap.showAll();
	
		
	}

}
