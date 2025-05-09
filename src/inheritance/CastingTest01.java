package inheritance;

public class CastingTest01 {
	public static void main(String[] args) {
		Student student = new Student("Duly");
		System.out.println(student.name);

		Person person = student;
		person.name = "Cogildong";
		System.out.println(person.name);
	}
} 
/////////////////Person 시작///////////////////////
class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}
/////////////////Student 시작//////////////////////
class Student extends Person {
	String dept;

	public Student(String name) {
		super(name);
	}
}
////////////////////끝////////////////////////////


 
