package ch18;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];    //int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10}; 이렇게 쓸 수도 있다.
		int total=0;
		for(int i=0,num=1 ;i<arr.length;i++ ) {
			arr[i]=num++;
			
		}
			
//		for (int i=0;i<arr.length;i++) {
//			
//			total+=arr[i];
//		}
		for(int num1 : arr) {                    // 처음부터 끝까지 돌때 사용된다 0~n-1
	//이 엘리먼트가 해당되는 타입
			total+=num1;    // num1에 순차적으로 값이 들어간다.
		}
			System.out.println(total);
		
		
	}

}


//배열 초기화 하는법
/*
int[] arr1 = new int[10];  10개의 배열이 생성됨
int arr2[] = new int[10];



int[] numbers = new int[] {10, 20, 30};  //개수 생략해야 함

int[] numbers = {10, 20, 30};            // new int[]  생략 가능 

int[] ids; 
ids = new int[] {10, 20, 30};            // 선언후 배열을 생성하는 경우는 new int[] 생략할 수 없음

*/





// 배열을 통한 Alphabets 출력 프로그램

/*
package ch18;

public class CharArrayTest {

	public static void main(String[] args) {
		char alphabets[] = new char[26];   // 배열 선언
		char al = 'A';
		
		for (int i=0;i<alphabets.length;i++) {
			 alphabets[i]=al++;   		}  // 문자와 정수 합이 가능하다
		for(char all : alphabets) {       // 전체를 도는 코드 
			System.out.println(all+" "+(int)all);
			
		
		}
		System.out.println(1+'A'); // 문자도 정수이다
	
	}

}

*/

