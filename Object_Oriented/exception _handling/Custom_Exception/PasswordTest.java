package ch10;

public class PasswordTest {
	
	private String password;
	 
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordExcetion {
		if(password == null) {
			throw new PasswordExcetion("비밀번호는 null일 수 없습니다");
		}
		else if(password.length() < 5) {
			throw new PasswordExcetion("비밀번호는 5자 이상이어야 합니다");
		}
		else if(password.matches("[a-zA-Z]+")) { // matches 특정 패턴의 문자열을 포함하는지 확인할 수 있습니다
			throw new PasswordExcetion("비밀번호는 숫자나 특수기호를 포함해야합니다");
		}
		
		this.password = password;
		
	}
	
	
	
	public static void main(String[] args)  {
		PasswordTest test = new PasswordTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류없이 만들어짐");
		} catch (PasswordExcetion e) {
			System.out.println(e.getMessage());
		}
		
		
		password = "abc";
		
		try {
			test.setPassword(password);
			System.out.println("오류없이 만들어짐");
		} catch (PasswordExcetion e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("오류없이 만들어짐");
		} catch (PasswordExcetion e) {
			System.out.println(e.getMessage());
		} 
		
		password = "abcde1%";
		try {
			test.setPassword(password);
			System.out.println("오류없이 만들어짐");
		} catch (PasswordExcetion e) {
			System.out.println(e.getMessage());
		} 

	}

}
