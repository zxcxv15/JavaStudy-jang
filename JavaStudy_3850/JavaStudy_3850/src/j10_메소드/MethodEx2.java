package j10_메소드;

import java.util.Scanner;

public class MethodEx2 {
	/*
	 * 윤년 계산을 메소드를 이용해서 만들기. year1, 2, 3 입력
	 * 
	 * calcLeapYear()
	 * 
	 * year1 = 윤년입니다. year2 = 윤년이 아닙니다. year3 = 윤년입니다.
	 * 
	 */
	static void calcLeapYear(int year) {
		if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {			
		System.out.println(year + " 년도는 윤년입니다.");
	}else {
		System.out.println( year + "년도는 윤년이 아닙니다.");
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year1 =0;
		int year2 =0;
		int year3 =0;
		
		System.out.print("년도1 입력: ");
		year1 = sc.nextInt();
		System.out.print("년도2 입력: ");
		year2 = sc.nextInt();
		System.out.print("년도3 입력: ");
		year3 = sc.nextInt();
		
		calcLeapYear(year1);
		calcLeapYear(year2);
		calcLeapYear(year3);
		
		
	}
}
