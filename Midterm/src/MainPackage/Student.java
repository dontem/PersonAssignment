package MainPackage;


public class Student extends Person {

	// Class_status has been declared final because it is a constant
	public final String class_status;

	public Student(String name, String address, String phone, String email,
			String classStatus) {
		super(name, address, phone, email);
		class_status = classStatus;
	}
}

