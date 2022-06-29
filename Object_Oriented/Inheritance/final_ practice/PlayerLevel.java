package ch16;

public abstract class PlayerLevel {  // 상위 추상클래스로 정의 하고 추상 매서드들을 하위클래스에 맞게 설정한다.
	
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	final public void go(int count) {  // 일련의 순서 바꿀 수 없다!!
		run();
		for(int i = 0; i<count;i++) {   //템플릿 메서드 
			jump();   // 매개변수 만큼 반복
		}
		turn();
		
	}
	
	

}
