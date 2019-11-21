import java.util.Arrays;

public class Course {
	private Subject subject;
	public int daysUntilStarts;
	private int daysToRun; //how long the subjects will be 
	private Student students[] = new Student[3];

	public Course(Subject subject, int daysStart) {

		this.subject = subject;
		this.daysUntilStarts = daysStart;
		this.daysToRun = subject.getDuration(); 

	}

	public boolean enrolStudent(Student enrol) {
		
		if(daysUntilStarts <=0){
			System.out.println("Course has already started");
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

		if(getSize() == 3) {
				System.out.println("Course is full");
				return false;
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
		return students;
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


	public void aDayPasses(){
		if(daysUntilStarts > 0){
			this.daysUntilStarts -= 1;
		}else if(daysToRun > 0){
			this.daysToRun -= 1;
		} 

		if(daysToRun == 0){

			
			for(int i = 0; i<getSize(); i++){
				if(students[i] ==  null){
					System.out.println("no one there...");

				} else if(students[i].hasCertificate(subject) != true){
				  	students[i].graduate(subject);
				}
			}
		
		}	

		
	}
}