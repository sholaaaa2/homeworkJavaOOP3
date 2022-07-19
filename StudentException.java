package homework;

public class StudentException extends Exception{
	@Override
	public String getMessage() {
		return "This enought students";
	}
}
