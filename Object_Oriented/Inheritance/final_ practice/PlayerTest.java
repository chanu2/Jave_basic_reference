package ch16;

public class PlayerTest {

	public static void main(String[] args) {
		Player chan = new Player();    // 객체를 생성한다.  // 플레이어는 1명이고 레벨이 증가할 수록 추가되는 기능들을 보여준다고 볼 수 있다.
		chan.play(1);  
		
		AdvancedLevel alevel = new AdvancedLevel();  //AdvancedLevel 타입의 객체를 생성한다
		chan.upgradeLevel(alevel);  //upgradeLevel를 통해서 level을 업그레이드 해준다.
		chan.play(2);
		
		
		SuperLevel slevel = new SuperLevel(); //SuperLevel 타입의 객체를 만들고
		chan.upgradeLevel(slevel); // 인스턴스를 매개변수로하여 레벨을 업그레이드한다.
		chan.play(3);
		
	}

}
