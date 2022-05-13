package j02_변수;

public class VariableEx1 {

	public static void main(String[] args) {
		
		//논리자료형(참,거짓 / 0,1)
		boolean trueAndFalse = true; // 선언과 초기화 
		boolean trueAndFalse2; //선언
		trueAndFalse2 = false; //초기화
		
		//논리자료형 출력
		System.out.println(trueAndFalse);
		System.out.println(trueAndFalse2);
		System.out.println("-----------------------");
		
		trueAndFalse = false;
		
		System.out.println(trueAndFalse);
		System.out.println(trueAndFalse2);

		System.out.println();
		
		//문자자료형
		char alphabet_a = 'a'; 
		char alphabet_b = 'b';
		char hangul_ga = '가';
		
		//문자자료형 출력
		System.out.println(alphabet_a);
		System.out.println(alphabet_b);
		System.out.println(hangul_ga);
		
		System.out.println();
		
		//정수자료형
		int number1 = 100;
		int number2 = 200;
		int number3 = number1 + number2;
		int number4 = 2140000000;
		long number5 = 220000000000l;
		
		//정수자료형 출력
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		//실수자료형
		double number6 = 15.11122;
		
		//실수자료형출력
		System.out.println(number6);
		
	}

}
