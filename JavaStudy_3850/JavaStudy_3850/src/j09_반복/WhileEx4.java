package j09_반복;

public class WhileEx4 {

	public static void main(String[] args) {
		int dan = 0; 

		while (dan < 8) {
			dan += 2;
			System.out.println(dan + "단");
			int num = 0;
			while (num < 9) {
				int result = dan * (++num);
				System.out.println(dan + " X " + num + " = " + result);
			}
			System.out.println("");
			dan -= 1;
		}
	}
}
