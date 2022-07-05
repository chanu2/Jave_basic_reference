package ch13;  // Id가 작은수 부터 차례대로 오름차순으로 정렬하고 싶다.

import java.util.Comparator;
import java.util.TreeSet;

public class Member implements Comparator<Member> {//Comparable 인터 페이스이기 때문에 구현이 필요하다  Comparator도 구현가능
	
	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름
	
	public Member() {
		
	}

	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override                                             //같은지의 여부를 판단해주는 코드를 작성
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId ) {
				return true;
			}
			else return false;
				
			
		}
		return false;
		
	}

	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}
    /*
	@Override
	public int compareTo(Member member) { // Member로 넘어온 이유는  Comparable<Member> 썻기 때문이다
		if(this.memberId> member.memberId) {  // this는 새로 들어가는 요소 기존에 있는 tree요소들과 비교하여 위치를 잡을 때 까지 하나씩 하나씩 넘어 온다(콜백 펑션)
			return 1;                         // 자동으로 비교가 된다
		}
		else if(this.memberId < member.memberId) {   // 오름차순으로 출력된다   // 내림차순으로 원하면 리턴 값을 바꾸어 주면된다
			return -1;
		}
		else return 0;  // 같을 떄 이지만 같은수가 들어 갈 수 없다 
		return(this.memberId - member.memberId)*(-1); // *-1 = 내림차순 단지 음수인지 양수인지 0인지가 궁금한것 
			
	
	
	}
	*/

	@Override
	public int compare(Member member1, Member member2) { // 매개변수 2개가 넘어온다  하나는 나이고 하나는 비교대상
		return (member1.memberId - member2.memberId);  // !!!반드시  treeSet = new TreeSet<Member>(new Member()); TreeSet컨스트럭트 안에 comparator가 구현된것을 지정해줘야한다
	}
}
