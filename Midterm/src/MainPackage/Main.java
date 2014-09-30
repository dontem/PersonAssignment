package MainPackage;


public class Main {
	public static void main(String[] args) {
		Person person = new Person("Bill Gates", "333 Microsoft Lane",
				"302-565-1314", "billgates@udel.edu");

		Person student = new Student("Steve Jobs", "345 Apple Road",
				"302-478-1390", "jobs@udel.edu", "Sophomore");

		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
	}
}
