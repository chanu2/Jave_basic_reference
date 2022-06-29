package ch03;

public class TextBlockTest {

	public static void main(String[] args) {
		String testBlocks = """
				hellow,
				hi,
				how r u""";
		System.out.println(testBlocks);
		System.out.println(getBlockOfHtml());
		
	}
	
	
	
	public static String getBlockOfHtml() {  // 유용하게 사용할 수 있다.
	    return """
	            <html>

	                <body>
	                    <span>example text</span>     
	                </body>
	            </html>""";
	}


}
