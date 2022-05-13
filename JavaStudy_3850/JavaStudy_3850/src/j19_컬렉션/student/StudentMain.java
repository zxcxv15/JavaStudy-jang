package j19_컬렉션.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> studentDate = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		StudentService studentService = new StudentServiceImpl(scanner, studentDate);
		studentService.addStudent();
		studentService.addStudent();
		Student student1 = studentService.getSttudentByStudentCode(2020001);
		Student student2 = studentService.getSttudentByStudentCode(2020002);
		System.out.println("학생1: " + student1);
		System.out.println("학생2: " + student2);
		
		System.out.println("[전체 학생 리스트]");
		System.out.println(studentService.getStudent());
		
		studentService.updateStudent(2022001);
		System.out.println(studentService.getSttudentByStudentCode(202220001));
		
		studentService.removeStudent(2022002);
		
		System.out.println("[전체 학생 리스트]");
		System.out.println(studentService.getStudent());
		
	}

}
