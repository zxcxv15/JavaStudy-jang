package j19_컬렉션.student;

import java.util.ArrayList;

public interface StudentService {
	public boolean addStudent();
	public Student getSttudentByStudentCode(int studentCode);
	public ArrayList<Student> getStudent();
	public boolean updateStudent(int studentCode);
	public boolean removeStudent(int studentCode);

}
