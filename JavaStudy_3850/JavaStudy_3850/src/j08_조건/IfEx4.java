package j08_조건;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		int year = 0;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		year = scanner.nextInt();
		
		if(year%4==0) {
			if(year%400==0) System.out.println("1");
			else if(year%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
    }
}
