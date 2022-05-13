package j15_인터페이스;

public class Exam implements StartAndStop {

	//인터페이스의 추상메서드를 구현한 것들.
	@Override
	public void printInfo() {
		System.out.println("시험관리"); 
		
	}

	@Override
	public void start() {
		System.out.println("시험을 시작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("시험을 종료합니다.");
		
	}

}
