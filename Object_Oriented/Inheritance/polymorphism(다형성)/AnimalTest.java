package ch06;

import java.util.ArrayList;

class Animal{

	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두빌로 걷 습니다");   // 오버라이딩
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
	
}


class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
	
}


class Eagle extends Animal{
	public void move() {
		System.out.println("하늘을 날아다닙니다");
	}
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아갑니다");
		
	}
}




public class AnimalTest {

	public static void main(String[] args) {
		Animal haniaml = new Human();    // Animal 타입으로 선언하고 휴먼 클래스를 만들어준다
		Animal saniaml = new Tiger();
		Animal taniaml = new Eagle();
		
		//AnimalTest test = new AnimalTest(); // AnimalTest를 만들어준다.
		//test.moveAnimal(haniaml);   
		//test.moveAnimal(saniaml);   // 상위클래스인 Animal로 형변환한다.
		//test.moveAnimal(taniaml);
		
		ArrayList<Animal> animalList = new ArrayList<>();   //ArrayList를 이용한 코드
		animalList.add(taniaml);
		animalList.add(saniaml);
		animalList.add(haniaml);
		
		for(Animal animal : animalList) {
			animal.move();
			
		}
		
		
		
		
		
		
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();   // animal. human이 가지고 있는 readBook이나 Eagle의 FLYING 매서드 들은 사용할 수 없다 오로지 Animal 메소드만 사용 할 수 있다.(사용하려면 다운 캐스팅 필요함) 
		//사람이 두빌로 걷 습니다,호랑이가 네발로 걷습니다, 하늘을 날아다닙니다
		// 어떤 인스턴스 형이 들어갔느냐에 따라서 다르게 나온다 (가상 메서드 방식에 의해서)
		// 상속이 되면 하위클래스들을 상위클래스 하나로 통제할 수 있다 	
		
	}

}
