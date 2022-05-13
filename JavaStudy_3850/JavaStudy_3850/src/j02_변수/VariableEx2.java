package j02_변수;

public class VariableEx2 {

	public static void main(String[] args) {
		/*
		 * 문제.1
		 * 이름: 장원영
		 * 
		 * 문자형 변수 
		 * firstName1 
		 * firstName2
		 * lastName1
		 *  
		 */
		char lastName1 = '장';
		char firstName1 = '원';
		char firstName2 = '영';
		
		//문자형 변수 출력
		System.out.print("이름: ");
		System.out.print(lastName1);
		System.out.print(firstName1);
		System.out.print(firstName2);
		
		System.out.println();
		
		System.out.println("이름: "+ lastName1 + firstName1 + firstName2);
		
		System.out.println(""+lastName1 + firstName1 + firstName2);
		
		
		char alphabet_a = 'a';
		System.out.println(alphabet_a + 1);
	}

}
