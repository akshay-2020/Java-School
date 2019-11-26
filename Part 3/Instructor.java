public abstract class Instructor extends Person {
	Course assignedCourse;

	public Instructor(String name, char gender, Integer age){

		super(name, gender, age);

	}

	public void assignCourse(Course assign){

		this.assignedCourse = assign;
	}

	public void unassignCourse(){

			this.assignedCourse = null;
	}

	public Course getAssignedCourse(){
		Course getCourse = this.assignedCourse;
		if(this.assignedCourse == null){

			getCourse = null;
		}

		return getCourse;

	}

	public abstract boolean canTeach(Subject subject);
}