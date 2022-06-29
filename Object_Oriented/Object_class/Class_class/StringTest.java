package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");  // 런타임할때 발견하기 떄문에 위험성이 있다
		
		Constructor[] cons = c.getConstructors(); //Class 클래스가 가지고 있는 컨스트럭터를 확인할 수 있는 코드
		for(Constructor co : cons) { 
			System.out.println(co);
		}                                                //reflex 프로그램
		
		Method[] m = c.getMethods();  // Class 클래스의 메서드를 확인 할 수 있는 코드
		for(Method me : m) {
			System.out.println(me);
		}
	}

}
 
