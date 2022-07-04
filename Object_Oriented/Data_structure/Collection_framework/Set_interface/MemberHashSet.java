package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;    // F1을 잘 이용해야 좋은 개발자가 될 수 있어요  // 아무것도 <>에 넣지않으면 object타입이 나온다
	
	public MemberHashSet() {
		hashSet = new HashSet<>(); 
	}
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMerber(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		/*for(int i=0; i<arrayList.size(); i++ ) {
			Member member = arrayList.get(i);
			
			int trmpId = member.getMemberId();     // iterator를 이용하지 않은 순회
			if(trmpId == memberId) {
				arrayList.remove(i);
				return true; 
			}
		}
		
		System.out.println(memberId+"가 존재하지 않습니다");
		return false; */
		
		Iterator<Member> ir = hashSet.iterator(); // Iterator를 이용한 순회  --> 반환 받을 타입을 써야한다
		while(ir.hasNext()) {  //hasNext() --> 다음 값이 존재하면 while실행     Iterator는 인덱스 0 번 이전에서 시작한다
			Member member = ir.next(); // 다음 값을 가져온다 Member 타입으로 
			int trmpId = member.getMemberId();     
			if(trmpId == memberId) {                 // list에서 get을 통해 가져올 수 있지만  set일 때는 get이 없어 iterator 사용
				hashSet.remove(member);
				return true; 
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false; 
		
	}
	 
	public void showMember() {
		for(Member member : hashSet ) {
			System.out.println(member);  // toString으로 이동 ~~
		}
		System.out.println();
	}
	
}
