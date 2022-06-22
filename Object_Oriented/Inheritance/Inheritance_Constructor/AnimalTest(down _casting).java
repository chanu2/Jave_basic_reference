package ch08;

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
		
		AnimalTest test = new AnimalTest(); // AnimalTest를 만들어준다.
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
		
		test.testDownCasting(animalList);
		
		
		
		
			
	}
	
	public void testDownCasting(ArrayList<Animal> list) {  // ArrayList를 이용한 다운 캐스팅
		
		for (int i=0;i<list.size();i++) {
			Animal animal =list.get(i);  // i번째 인덱스에 있는 값을 가져온다
			
			if (animal instanceof Human) {  // 조건을 걸어줘야 한다
				Human human = (Human)animal;
				human.readBook();
				
			}
			else if (animal instanceof Tiger) {  // animal의 타입이 Tiger의 인스턴스인지 확인한다.
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
				
			}
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
				
			}
			
			else{
				System.out.println("unsupported type ");
			}
		}
		
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();   
		
	}

}
