package j11_클래스_생성자;

public class CarTest {

	void print() {
		System.out.println("test 출력");
	}
	
	public static void main(String[] args) {
//		CarTest carTest = new CarTest();		
//		carTest.print();
		
		Car_j11 c1 = new Car_j11("KIA","5","화이트"); //생성자 호출
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		
	}

}
