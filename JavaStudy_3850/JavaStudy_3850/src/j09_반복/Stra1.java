package j09_반복;

public class Stra1 {
	/*
	 * 
	 * * ** *** **** *****
	 * 
	 * ****** **** *** ** *
	 * 
	 * 
	 * * ** ****
	 * 
	 * 
	 * * *** ***** ******* *********
	 * 
	 */

	public static void main(String[] args) {
		int n = 10;
		
		// 1
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 2
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 3
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();

		// 4
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 5

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}