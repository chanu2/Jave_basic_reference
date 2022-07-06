package ch02;

@FunctionalInterface  // 컴파일러에게 알려준다 
public interface Add {
	int add(int x , int y);  //매서드 하나만 선언
}
