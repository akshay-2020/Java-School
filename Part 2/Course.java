public class Course {
	private Subject subject;
	private int daysUntilStarts;
	private int daysToRun; //how long the subjects will be 

	public Course(Subject subject, int daysStart) {

		this.subject = subject;
		this.daysUntilStarts = daysStart;
		this.daysToRun = subject.getDuration(); 

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
	}
}