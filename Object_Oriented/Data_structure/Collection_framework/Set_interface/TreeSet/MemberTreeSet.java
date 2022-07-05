package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;    // F1을 잘 이용해야 좋은 개발자가 될 수 있어요  // 아무것도 <>에 넣지않으면 object타입이 나온다
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());//  Comparator일때
		//treeSet = new TreeSet<>(); Comparable일 때
	}
	
	
	public void addMerber(Member member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		
		
		Iterator<Member> ir = treeSet.iterator(); // Iterator를 이용한 순회  --> 반환 받을 타입을 써야한다
		while(ir.hasNext()) {  //hasNext() --> 다음 값이 존재하면 while실행     Iterator는 인덱스 0 번 이전에서 시작한다
			Member member = ir.next(); // 다음 값을 가져온다 Member 타입으로 
			int trmpId = member.getMemberId();     
			if(trmpId == memberId) {                 // list에서 get을 통해 가져올 수 있지만  set일 때는 get이 없어 iterator 사용
				treeSet.remove(member);
				return true; 
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false; 
		
	}
	 
	public void showMember() {
		for(Member member : treeSet ) {
			System.out.println(member);  // toString으로 이동 ~~
		}
		System.out.println();
	}
	
}
