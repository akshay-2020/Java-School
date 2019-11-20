public class Main {


	public static void main(String args[]){
		Subject subject1 = new Subject(1, 2, 3);
		Subject subject2 = new Subject(2, 3, 4);
		Course  course1 = new Course(subject1, 2);
		Student student1 = new Student("Alice", 'F', 25);
		Student student2 = new Student("Bob", 'M', 30);
		Student student3 = new Student("Charlie", 'M', 35);
		Student student4 = new Student("Donna", 'F', 40);

		boolean enrolled;
		enrolled = course1.enrolStudent(student1);

		System.out.println(enrolled);




	}
}