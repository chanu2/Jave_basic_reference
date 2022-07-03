package ch06;

public class GenericPrinter<T> { // 재너릭 타임 변수 써주기
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
