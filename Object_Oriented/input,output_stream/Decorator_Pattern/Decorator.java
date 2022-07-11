package ch19;

public abstract class Decorator extends Coffee { //Decorator 혼자 쓸일 이 없고 상속용이기 때문에 다 구현을 해도 abstract 써준다
	
	Coffee coffee; // 반드시 인자로 받아야한다.
	public Decorator(Coffee coffee) {   // 데코레이터는 자기 혼자 못돌아감  // 커피에서 상속받은 것들은 다 들어올 수 있다
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		
		coffee.brewing();
		
	}

}
