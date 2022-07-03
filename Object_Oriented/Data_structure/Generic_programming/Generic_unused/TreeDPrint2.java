package ch06;
// 다 수용할 수 있는 변수로 만든다   Object형으로 선언	
public class TreeDPrint2 {
	private Object material;    // 재료가 무엇이든 적용 될 수 있다
	
	
	
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
	
	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
}
