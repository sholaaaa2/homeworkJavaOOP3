package homework;

import java.util.Arrays;

public class Group {
	private Student[] groupOfStudent = new Student[10];

	public Group() {

	}

	public void addStudent(Student stud) throws StudentException {
		for (int i = 0; i < this.groupOfStudent.length; i++) {
			if (this.groupOfStudent[i] == null) {
				this.groupOfStudent[i] = stud;
				return;
			}
		}
		throw new StudentException();

	}

	public String findStudent(String surname) {
		for (int i = 0; i < this.groupOfStudent.length; i++) {
			if (this.groupOfStudent[i].getSurname() != null && this.groupOfStudent[i].getSurname().equals(surname)) {
				return "Student on index " + i;
			}
		}
		return "Student not found";
	}

	@Override
	public String toString() {
		return "Group [groupOfStudent=" + Arrays.toString(groupOfStudent) + "]";
	}

}
