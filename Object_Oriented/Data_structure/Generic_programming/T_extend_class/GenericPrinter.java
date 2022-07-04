package ch07;

public class GenericPrinter<T extends Meterial> { // 재너릭 타임 변수 써주기  // T에대한 제한을 해주는 것 
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}
