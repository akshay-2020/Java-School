public class Main {


	public static void main(String args[]){
		Subject subject = new Subject(1,2,3);
		subject.setDescription("Course description");
		String name = subject.getDescription();
		System.out.println(name);

		Course course = new Course(subject, 2);
		
	}
}