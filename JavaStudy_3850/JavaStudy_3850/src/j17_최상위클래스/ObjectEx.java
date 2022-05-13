package j17_최상위클래스;

public class ObjectEx {
	public static void main(String[] args) {
		Object obj = new Object();
		String toString = obj.toString();
		System.out.println(toString);
		// toString은 생략이 가능하다.

		User user = new User(2022001, "junil", "1234", "김준일", "skjil1218@kakao.com");
		User user2 = new User(2022001, "junil", "1234", "김준일", "skjil1218@kakao.com");
		System.out.println(user.equals(user2)); // equals는 오버라드 가능
		System.out.println(user.hashCode() == user.hashCode());
		// Object o = user2;
		// System.out.println(user == user2); //주소값 비교 == 는 오버라이드 안됨
		// System.out.println(10 == 10); //리터럴 상수

	}
}
