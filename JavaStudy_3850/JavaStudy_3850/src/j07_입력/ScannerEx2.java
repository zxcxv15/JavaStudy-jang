package j07_입력;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		/*
		 * 이름(name): 장원영 연락처(phone): 010-2028-3850 직업(job): 학생 성별(gender): 남 나이(age): 27
		 * 주소(address): 부산광역시 부산진구
		 * 
		 * 
		 * 고객의 이름은 장원영이고 직업은 학생입니다. 나이는 27이고 성별은 남성입니다. 연락처: 010-2028-3850 주소: 부산광역시
		 * 부산진구 이메일(email):zxcxv10 @ naver.com
		 */

		Scanner in = new Scanner(System.in);

		String name = null;
		String phone = null;
		String job = null;
		String gender = null;
		int age = 0;
		String address = null;
		String email = null;

//		System.out.print("이름: ");
//		name = in.next();
//		System.out.print("연락처: ");
//		phone = in.next();
//		System.out.print("직업: ");
//		job = in.next();
//		System.out.print("성별: ");
//		gender = in.next();
		System.out.print("나이: ");
		age = Integer.parseInt(in.next());
//		in.nextLine();
//		System.out.print("주소: ");
//		address = in.nextLine();
//		System.out.print("이메일: ");
//		email = in.next();

		System.out.println("");
		System.out.println("고객의 이름은" + name + "이고 직업은" + job + "입니다.");
		System.out.println("나이는" + Integer.toString(age + 1) + "이며 성별은" + gender + "입니다.");
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		System.out.println("이메일: " + email);

	}

}
