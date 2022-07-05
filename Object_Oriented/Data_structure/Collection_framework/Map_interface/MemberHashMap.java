package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer,Member> hashMap;    // key 값은 인티저 value값은 Member 형
	
	public MemberHashMap(){
		hashMap = new HashMap<Integer,Member>();
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(),member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		System.out.println("no element ");
		return false;
	}
	public void showAll() {  // hashmap에서는 키 값 또는 벨류값 둘중에 하나로 가져와야 한다
		Iterator<Integer> ir = hashMap.keySet().iterator();   // 그냥 hashMap출력해도 키값 벨류값 페어로 나온다
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
