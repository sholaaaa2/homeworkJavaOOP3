package homework;

public class Student extends Human {
	private int course;

	public Student(String name, String surname, int age, int course) {
		super(name, surname, age);
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", surname=" + this.getSurname() + ", age=" + this.getAge()
				+ "course=" + course + "]";
	}

}
