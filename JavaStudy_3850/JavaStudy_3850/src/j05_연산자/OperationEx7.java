package j05_연산자;

public class OperationEx7 {

	public static void main(String[] args) {
		int a = 10;

		String flag = a > 5 || a % 2 == 0 ? "참" : "거짓";
		System.out.println(flag);

		String flag2 = "false";
		
		

		flag2 = a > 5 ? "참" : "거짓";

		if (a > 5) {
			flag = "참";
		} else {
			flag = "거짓";
		}
		System.out.println(flag2);
	}

}
