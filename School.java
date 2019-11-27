import java.util.ArrayList;
import java.util.Collections;


public class School{

	private String schoolName = "Thomas More (Not a Scam)";
	private Subject subjects;
	private Course courses;
	private Student students;
	private Instructor instructors;
	private ArrayList<Student> allStudents = new ArrayList<Student>();
	private ArrayList<Subject> allSubjects = new ArrayList<Subject>();
	private ArrayList<Course> allCourses = new ArrayList<Course>();
	private ArrayList<Instructor> allInstructors = new ArrayList<Instructor>();


	public School(Subject subjects, Course courses, Student students, Instructor instructors){

		this.subjects = subjects;
		this.courses = courses;
		for(Student element: courses.getStudents()) {
         this.allStudents.add(element);
         //System.out.println(element);
      	}
		this.students = students;
		this.instructors = instructors;
	}


	public String toString(){
	/*	Integer courseSub =0;
		Student[] courseStud = new Student[courses.getSize()];
		String courseInstr = "";
		

		ArrayList<String> studentName = new ArrayList<String>();
		for(Course element : allCourses){ 
			courseSub = this.courses.getSubject().getID(); // Subjects associated with this course 
			

			courseStud = this.courses.getStudents(); 
			for(Student student: courseStud){
				studentName.add(student.getName());
			}
			courseInstr = this.courses.getInstructor().getName(); //  instructor for associated course
			
			
		}*/

		return  "All Students: " + allStudents +"\n" + "All Instrucotrs" + allInstructors   + "\n" + "All subjects: "  + allSubjects+ "\n" + "All Courses: " 
		+ allCourses+  "\n"+"Course: " + courses + " Subject: " + courses.getSubject() + " Students: " + courses.getStudents() + " Instructor: " + courses.getInstructor();

		
	}

	//Students 

	public void add(Student addStudent){
		this.allStudents.add(addStudent);
	}

	public void remove(Student removeStudents){
		this.allStudents.remove(removeStudents);

	}

	public ArrayList<Student> getStudents(){
		return allStudents;

	}

	// Subjects


	public void add(Subject addSubject){
		this.allSubjects.add(addSubject);
	}

	public void remove(Subject removeSubject){
		this.allSubjects.remove(removeSubject);

	}

	public ArrayList<Subject> getSubjects(){
		return allSubjects;
	}

	//Course 

	public void add(Course addCourse){
		this.allCourses.add(addCourse);
	}

	public void remove(Course removeCourse){
		this.allCourses.remove(removeCourse);

	}

	public ArrayList<Course> getCourses(){
		return allCourses;
	}

	//Instructor 

	public void add(Instructor addInstructor){
		this.allInstructors.add(addInstructor);
	}

	public void remove(Instructor removeInstructor){
		this.allInstructors.remove(removeInstructor);

	}

	public ArrayList<Instructor> getInstructors(){
		return allInstructors;
	}
}