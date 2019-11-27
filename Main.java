import java.util.Arrays;
public class Main {


	public static void main(String args[]){
		Subject subject1 = new Subject(1, 2, 3); // id specilsim duration
		Subject subject2 = new Subject(2, 3, 4);
		Course  course1 = new Course(subject1, 2);
		Student student1 = new Student("Alice", 'F', 25);
		Student student2 = new Student("Bob", 'M', 30);
		Student student3 = new Student("Charlie", 'M', 35);
		Student student4 = new Student("Donna", 'F', 40);
		Teacher teacher1 = new Teacher("Teacher1", 'F', 25);
		Demonstrator demonstrator1 = new Demonstrator("Demonstrator1", 'F', 25);
		OOTrainer ootrainer1 = new OOTrainer("OOTrainer1", 'F', 25);
		GUITrainer guitrainer1 = new GUITrainer("GUITrainer1", 'F', 25);

		

		//boolean enrolled;
		Student[] students = course1.getStudents();
		//System.out.println(course1.getSize());
		course1.enrolStudent(student1);
		//System.out.println(course1.getSize());
		//System.out.println(course1.getStudents());
		course1.enrolStudent(student2);
		//System.out.println(course1.getSize());
		//System.out.println(course1.getStudents());
		course1.enrolStudent(student3);
		//System.out.println(course1.getSize());
		//System.out.println(course1.getStudents());

		School school = new School(subject1, course1, student1, teacher1);

		/*enrolled = course1.enrolStudent(student4);
		System.out.println(enrolled);*/

		/*System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();

		System.out.println(course1.daysUntilStarts);*/

		/*student1.graduate(subject1);*/
		/*student1.hasCertificate(subject1);*/
		/*student1.graduate(subject1);*/
		/*student1.hasCertificate(subject1);*/
		/*student1.graduate(subject2);*/
		/*student1.hasCertificate(subject2);*/

/**/




/*
		course1.enrolStudent(student1);
		course1.enrolStudent(student2);
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		student1.hasCertificate(subject1);
		student2.hasCertificate(subject1);
		course1.aDayPasses();
		System.out.println(course1.getStatus());
		student1.hasCertificate(subject1);
		student2.hasCertificate(subject1);*/



		/*student1.graduate(subject1);
		student1.hasCertificate(subject1);
		student1.graduate(subject2);
		student1.hasCertificate(subject1);*/


		/*boolean enrolled;
		Student[] students;
		course1.enrolStudent(student1); //true

		enrolled = course1.enrolStudent(student2); // true

		course1.aDayPasses();
		students = course1.getStudents();
		System.out.println(students);
		System.out.println("Size" + course1.getSize());

		course1.aDayPasses();
		enrolled = course1.enrolStudent(student3);
		students = course1.getStudents();
		System.out.println("Size" + course1.getSize());*/

		/*Student[] students;
		students = course1.getStudents();
		System.out.println("Size " + course1.getSize());
		course1.enrolStudent(student1);
		students = course1.getStudents();
		System.out.println("Size " + course1.getSize());
*/
/*
		boolean enrolled;
		enrolled = course1.enrolStudent(student1);*/
		/*System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);*/

	/*	Student[] test = new Student[3];
		System.out.println(Arrays.toString(test));
		test[0] = student1;
		System.out.println(Arrays.toString(test));
		test[1] = student2;
		System.out.println(Arrays.toString(test));
		test[2] = student3;
		System.out.println(Arrays.toString(test));
*/

		/*boolean enrolled;
		Student[] students;
		course1.enrolStudent(student1);
		course1.aDayPasses();
		enrolled = course1.enrolStudent(student2);
		students = course1.getStudents();
		System.out.println("Size " + course1.getSize());
		System.out.println(Arrays.toString(students));
		/*course1.aDayPasses();*/
		/*enrolled = course1.enrolStudent(student3);
		System.out.println("Student 3 did he git in? " + enrolled);
		students = course1.getStudents();
		System.out.println("Size " + course1.getSize());*/
		/*boolean success = course1.setInstructor(teacher1);

		System.out.println(success);

		System.out.println(teacher1.getName());*/
		/*teacher1.assignCourse(course1);
		System.out.println(teacher1.getAssignedCourse );*/

		/*course1.enrolStudent(student1);
		System.out.println(course1.getStudents());
		System.out.println(student1);
		System.out.println(course1.getStatus());
		System.out.println(course1.getInstructor());
		System.out.println(course1.isCancelled());*/

		//Student[] setofStu = course1.getStudents();
		/*for(Student element : setofStu){
			System.out.println(element);
		}*/
		System.out.println(school);
	}
}