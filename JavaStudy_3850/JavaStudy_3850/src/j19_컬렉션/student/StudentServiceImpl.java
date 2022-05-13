package j19_컬렉션.student;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

	private final Scanner scanner;
	private final ArrayList<Student> studentDate;

	@Override
	public boolean addStudent() {
		System.out.println("[학생정보 추가]");
		Student student = new Student();
		System.out.print("이름: ");
		student.setName(scanner.nextLine());
		System.out.print("학년: ");
		student.setStudentYear(scanner.nextInt());
		System.out.print("취미: ");
		ArrayList<String> hoobys = new ArrayList<String>();
		for (int i = 0; true; i++) {
			System.out.print(i + " : ");
			String hooby = scanner.nextLine();
			if (hooby.equals("")) {
				break;
			}
			hoobys.add(hooby);
		}
		student.setHooby(hoobys);
		studentDate.add(student);
		return true;
	}

	@Override
	public Student getSttudentByStudentCode(int studentCode) {
		for (Student student : studentDate) {
			if (student.getStudentCode() == studentCode) { // hashCode,equals로 사용가능.
				return student;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Student> getStudent() {
		return studentDate;
	}

	@Override
	public boolean updateStudent(int studentCode) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		System.out.print("[학생 정보 수정]");
		for (Student student : studentDate) {
			if (student.getStudentCode() == studentCode) {
				System.out.print("1. 이름: " + student.getName());
				System.out.print("2. 학년: " + student.getStudentYear());
				System.out.print("3. 취미: " + student.getHooby());
				System.out.println("수정하고 싶은 정보의 번호를 모두 입력해주세요.(띄어쓰기로 구분)");
				do {
					indexList.add(scanner.nextInt());

				} while (scanner.hasNext());

				for (int i : indexList) {
					if (i == 1) {
						System.out.print("수정 할 이름: ");
						student.setName(scanner.nextLine());
					} else if (i == 2) {
						System.out.print("수정 할 학년: ");
						student.setStudentYear(scanner.nextInt());
						scanner.nextLine();
						System.out.print("수정 할 취미: ");
					} else if (i == 3) {
						// student.setHooby(null);
					} else {
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean removeStudent(int studentCode) {
		for (int i = 0; i < studentDate.size(); i++) {
			if (studentDate.get(i).getStudentCode() == studentCode) {
				studentDate.remove(i);
				return true;
			}
		}
		return false;
	}
}