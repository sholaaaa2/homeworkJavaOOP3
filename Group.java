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

	public Student findStudent(String surname) {
		for (int i = 0; i < this.groupOfStudent.length; i++) {
			if (this.groupOfStudent[i] != null && this.groupOfStudent[i].getSurname() != null && this.groupOfStudent[i].getSurname().equals(surname)) {
				return this.groupOfStudent[i];
			}
		}
		return null;
	}
	
	public void deleteStudent(String surname) {
		for (int i = 0; i < this.groupOfStudent.length; i++) {
			if (this.groupOfStudent[i] != null && this.groupOfStudent[i].getSurname() != null && this.groupOfStudent[i].getSurname().equals(surname)) {
				this.groupOfStudent[i] = null;
			}
		}
	}

	@Override
	public String toString() {
		return "Group [groupOfStudent=" + Arrays.toString(groupOfStudent) + "]";
	}

}

