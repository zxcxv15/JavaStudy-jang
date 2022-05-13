package j10_메소드;

import java.util.Scanner;

public class MethodEx3 {

	static int max(int num1, int num2, int num3) {
		int result = 0;
		if(num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		if(result < num3) {
			result = num3;
		}
		return result; 
	}
	static int max2(int num1, int num2, int num3, int num4) {
		int result = 0;
		if(num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		if(result > num3) {
			result = num3;
		}
		if(result < num4) {
			result = num4;
		}	
		return result; 
	}
	
	static int min(int num1, int num2, int num3) {
		int result = 0;
		if(num1 < num2) {
			result = num1;
		}else {
			result = num2;
		}
		if(result > num3) {
			result = num3;
		}	
		
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		System.out.print("세 수를 입력하세요: ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		System.out.println("최대값: " + max(num1, num2, num3));
		System.out.println("최소값: " + min(num1, num2, num3));
		
	}
	
}
