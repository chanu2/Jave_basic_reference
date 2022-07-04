package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(123, "chanwoo");
		Member member2 = new Member(1234, "HA");
		Member member3 = new Member(1235, "sue");
		Member member4 = new Member(1236, "kim");
		Member member5 = new Member(1237, "jun");
		
		memberArrayList.addMerber(member1);
		memberArrayList.addMerber(member2);
		memberArrayList.addMerber(member3);
		memberArrayList.addMerber(member4);
		memberArrayList.addMerber(member5);
		
		memberArrayList.showMember();
		
		memberArrayList.removeMember(member2.getMemberId());
		
		memberArrayList.showMember();
		
		
	}

}
