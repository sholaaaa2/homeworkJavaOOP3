package homework;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("John", "Vazovsky", 18, 2);

		Group gr = new Group();

		for (int i = 0; i < 11; i++) {
			try {
				gr.addStudent(st1);
				System.out.println(gr.toString());
			} catch (StudentException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println(gr.findStudent("Vazovsky"));
		System.out.println(gr.findStudent("Aboba"));

	}

}
