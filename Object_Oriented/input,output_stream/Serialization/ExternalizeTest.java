package ch17;


import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


class Person1 implements Externalizable{  //Person 객체가 직렬화 가능하다고 명시해야 한다  // 직렬화가 불가능 한 멤버 있거나 할 필요 없는 것들 EX) 소켓 
	 String name;
	 String job;         // transient String job; 하면 JOB 멤버는 무시하고 디폴트값이 나온다 .이순신 ,null김찬우 ,null
	 
	 public Person1(){}
	 
	 public Person1(String name, String job) {
	 	this.name = name; 
		this.job =job; 
	 }
	 
	 public String toString() {
		 return name + " ," + job;
	 }

	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {   // 직접 구현해야한다
		obj.writeUTF(name);
		obj.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();   // 이름부터 했기 때문에 이름부터 읽기
		job = obj.readUTF();   // 쓸 것 들만 사용하면 된다
	} 
}

public class ExternalizeTest {

	public static void main(String[] args) {
		
		Person1 personLee = new Person1("이순신","대표이사");
		Person1 personKim = new Person1("김찬우","상무이사");
		
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");    // 안에다 new해도 되고 이런 방식으로도 가능
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			                                      
			oos.writeObject(personLee);                 //  Seriallization 한다고 하고
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		
		try(FileInputStream fos = new FileInputStream("serial.txt");    // 안에다 new해도 되고 이런 방식으로도 가능
				ObjectInputStream ois = new ObjectInputStream(fos)){
			
			Person1 pLee = (Person1)ois.readObject();  //readObject() 반환 값은 오브젝트이다 읽을 때 그 클래스가 없을 수도 있기 때문에 오류가 발생할 수 있다
			Person1 pKim = (Person1)ois.readObject();    // deSeriallization 한다고 한다(복원)
			 
			System.out.println(pLee); 
			System.out.println(pKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e1){
			System.out.println(e1);	
		}
	}

}
