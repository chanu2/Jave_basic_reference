package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member1 = new Member(123, "chanwoo");
		Member member2 = new Member(1234, "HA");
		Member member3 = new Member(1235, "sue");
		
		
		memberHashSet.addMerber(member1);
		memberHashSet.addMerber(member2);
		memberHashSet.addMerber(member3);
		
		Member member4 = new Member(1235, "park");   // Id가 같아도 들어가 버린다 // HashSet 쓰는 관리할 클래스 내부에서 정보가 같은지의 여부를 확인해야 한다
		memberHashSet.addMerber(member4);  //add할때 중복되는 것은 add하지 않는다 add메서드는 잘들어갔는 지 아닌지 boolean형으로 반환
		memberHashSet.showMember();
		
		//  equals 와 hashcode에 조건을 걸어준다.
		
	}

}
