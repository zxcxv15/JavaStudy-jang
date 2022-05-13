package j19_컬렉션.student;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Student {
	private static int studentCodetoIncrement = 20220000;
	private int studentCode;
	private String name;
	private int studentYear;
	private ArrayList<String> hooby;
	
	public Student() {
		studentCode = ++studentCodetoIncrement;
	}

}
