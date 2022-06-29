package ch16;

public class Player {
	
	private PlayerLevel level;      // PlayerLevel 타입으로 level변수를 하나 정의
	
	public Player() {   // 컨스트럭트에서 player를 하나 생성하면 new BeginnerLevel()를 level에 할당하고
		level = new BeginnerLevel();
		level.showLevelMessage();  // 현재 레벨을 알려준다.
		
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) { //upgradeLevel 해주며 매개 변수에는 AdvancedLevel player2 = new AdvancedLevel()
		this.level = level;                       // 인스턴스가 들어와야한다.
		level.showLevelMessage();
	}
	
	public void play(int count) {   // PlayerLevel level의 메서드인 go를 불러온다.
		level.go(count);
		
		
	}

	
			
}

