package comparing;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Studentdemo {

	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();
		Collections.sort(studentList, Student.Comparators.AGE);

	}

}
