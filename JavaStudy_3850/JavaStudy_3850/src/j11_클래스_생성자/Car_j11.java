package j11_클래스_생성자;

public class Car_j11 {

	String company;
	String model;
	String color;

	// 리턴 자료형이 없고 클래스 이름이랑 같아야 된다.

	Car_j11() { // 기본 생성자(no argument constructor)
		System.out.println("생성자 호출?");

	}

	Car_j11(int num, int num2) { // 사용자 지정 생성자(argument constructor)
		System.out.println(num + num2);
	}

	Car_j11(String company, String model, String color){ //전체 생성자 (All argument constructor)
		this.company = company;
		this.model = model;
		this.color = color;
		
		System.out.println(this);
	
}
}