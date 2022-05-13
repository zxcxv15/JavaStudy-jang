package j16_스태틱;

public class Student {
	private static int SCAutoIncrement; //static변수의 생성자를 만든것
	private int studentCode = 20220000;
	private String name;
	
	public Student(String name) {
		studentCode += ++SCAutoIncrement;
		this.name = name;
		
	}
	public void studentInfo() {
		System.out.println("학번: " + studentCode);
		System.out.println("이름: " + name);
	}

}
