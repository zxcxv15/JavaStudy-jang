package j06_문자열;

public class StringEx1 {

	public static void main(String[] args) {
		char fn1 = '원';
 		char fn2 = '영';
 		char ln = '장';
 		
 		String name = "장원영";
 		
 		System.out.println("사용자 이름(char): " + ln + fn1 + fn2);
 		System.out.println("사용자 이름: "+ name);
 		
 		System.out.println(name.contains("장"));

	}

}
