package j09_반복;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		System.out.print("반복할 횟수를 입력하세요: ");
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			System.out.println(i + 1);
			
		}
		for(int i = 0; i < n; i++) { //반복 횟수 변함 X
			System.out.println(n - i);
		}
	}
	
}