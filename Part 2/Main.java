public class Main {


	public static void main(String args[]){
		Subject subject = new Subject(1,2,3); //id specialism duration
		subject.setDescription("Course description");
		String name = subject.getDescription();
		System.out.println(name);

		Course course = new Course(subject, 2); // subject untilstart
		System.out.println(course.getDaysToRun());
		/*System.out.println(course.getStatus());
		course.aDayPasses();
		System.out.println(course.getStatus());
		course.aDayPasses();
		System.out.println(course.getStatus());
		course.aDayPasses();
		System.out.println(course.getStatus());
		course.aDayPasses();
		System.out.println(course.getStatus());
		course.aDayPasses();
		System.out.println(course.getStatus());
		course.aDayPasses();
		System.out.println(course.getStatus());	*/
		



	}
}