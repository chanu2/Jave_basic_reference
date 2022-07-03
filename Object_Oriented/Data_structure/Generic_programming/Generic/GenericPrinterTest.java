package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder =new Powder();	
		GenericPrinter<Powder> powderPrint = new  GenericPrinter<>();  // 변수로 사용할 타입을 써줘야 한다.  //  이것이 실행되면 컴파일러에서 GenericPrinter클래스에서 T가 Powder로 바뀌기 때문에 따로 변형하지 안아도 댐 
		powderPrint.setMaterial(powder);
		
		
		Powder p = powderPrint.getMaterial();  // Powder로 형변환 하지 않아도 되는 이유는    // Object 타입과 비교댐
		System.out.println(powderPrint.toString());
		
		
		Plastic plastic = new Plastic();
		GenericPrinter plasticPrint = new  GenericPrinter<>();  // 이렇게 쓸 수도 있지만 그러면 자동으로 object형으로 받게된다
		plasticPrint.setMaterial(plastic);
		
		Plastic p1 = (Plastic)plasticPrint.getMaterial(); // 변환을 Plastic으로 바꿔야한다.
		System.out.println(plasticPrint.toString());
	}

}
