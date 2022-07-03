package ch06;

public class TreeDPrintTest {

	public static void main(String[] args) {
		Powder powder = new Powder(); // 재료는 파우더 하나를 만들어 준다.
		TreeDPrint2 printer = new TreeDPrint2();
		printer.setMaterial(powder);   // 오브젝트 타입이기 떄문에 가능하다	
		
		Powder p = (Powder)printer.getMaterial();  // Powder로 형변환 해줘야한다  but 너무 번거롭다 
	}

}
