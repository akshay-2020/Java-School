import java.util.Arrays;
import java.util.ArrayList;

public class Course {
	private Subject subject;
	public int daysUntilStarts;
	private int daysToRun; //how long the subjects will be 
	private Student[] students = new Student[3];
	private Instructor instructor;

	public Course(Subject subject, int daysStart) {

		this.subject = subject;
		this.daysUntilStarts = daysStart;
		this.daysToRun = subject.getDuration(); 
	}


	public boolean setInstructor(Instructor assignTeach){

		boolean available;
		if(assignTeach.canTeach(this.subject) == true ){
			this.instructor = assignTeach; 
			available = true;
			System.out.println("the instructor can teach the course");

		}else{

			System.out.println("the instructor can NOT the course");
			available = false;

		}

		return available;

	}


	public boolean hasInstructor(){
		boolean instructorAvailable;

		if(this.instructor == null){
			System.out.println("There is NO instructor for this course");
			instructorAvailable = false;

		}else{
			System.out.println("There is instructor for this course");
			instructorAvailable = true;
		}

		return instructorAvailable;
	}

	public boolean enrolStudent(Student enrol) {
		
		
		if(daysUntilStarts <=0){
			System.out.println("Course has already started");
			return false;
		}


		if(getSize() == 3) {
				System.out.println("Course is full");
				return false;
		}

		
		for(Student element: students){

			if(element == null){
				System.out.println("Added Student");
				int i = getSize();
				students[i] = enrol;
				return true;
			}
		} 

		return true;
	}

	public int getSize() {
		int index = 0;

		for(Student element: students){
			if(element != null){
				index++;
			}

		}
		return index;
	}



	public Student[] getStudents() {
		Student[] courseStudent = new Student[getSize()];

		if(getSize() != 0){
			for(int i=0; i<getSize(); i++){
				courseStudent[i] = students[i];

			}
		}
		return courseStudent;
	
	}	

	public Subject getSubject() {
		return subject;
	}

	public Integer getStatus() {

		if(daysUntilStarts > 0){
			return -daysUntilStarts;

		}else if (daysUntilStarts <= 0) {

			return daysToRun;
		}else{

			return 0;
		}
	}

	public boolean isCancelled(){
		boolean cancelled = false;

		
		if(daysUntilStarts<=0){ 
			if(this.instructor == null || getSize() == 0){
				this.instructor = null;

				Arrays.fill(students, null);
				cancelled = true;
			}else{
				cancelled = false;
			}
		}

		return cancelled;
	}


	public void aDayPasses(){
		boolean coursestart = true;
		if(daysUntilStarts > 0){
			this.daysUntilStarts -= 1;
		}else if(daysToRun > 0){
			
			if(this.instructor == null){
				System.out.println("No instructors...course is cancelled");
				coursestart = false;
			}else{	
				for(int i = 0; i<getSize(); i++){
					if(students[i] ==  null){
						System.out.println("no one there... course is cancelled");
						coursestart = false;
					}   
				}
			}

			if(coursestart ==true){
				daysToRun -= 1;
			}
		} 

		if(coursestart ==true && daysToRun == 0){ //  gradutaion 

			
			for(int i = 0; i<getSize(); i++){
				if(students[i] ==  null){
					System.out.println("no one there...");
				} else if(students[i].hasCertificate(subject) != true){
				  	students[i].graduate(subject);
				}
			}

			this.instructor = null;
		}		
	}

	public Instructor getInstructor() {
		return instructor;
	}
}