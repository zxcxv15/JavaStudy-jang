package j11_클래스;

public class StudentTest {

	public static void main(String[] args) {
		new Student_j11(); // Student_j11 Object 생성(인스턴스)
		
		System.out.println(new Student_j11());
		System.out.println(new Student_j11());
	//////////////////////////////////////////////////////////	
		Student_j11 s1 = new Student_j11();
		s1.schoolName = "부산대학교";
		s1.name = "김준일";
		System.out.println(s1.schoolName);
		
		Student_j11 s2 = new Student_j11();
		s2.schoolName = "부경대학교";
		s2.name = "김준이";
		System.out.println(s2.schoolName);
		
		
		
		s1.goToSchool();
		s2.goToSchool();
		
		
	}

}
