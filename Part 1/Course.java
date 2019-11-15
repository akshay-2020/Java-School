public class Course {
	private Subject subject;
	private Integer daysUntilStarts;
	private Integer daysToRun; //how long the subjects will be 

	public Course(Subject subject, Integer daysStart){

		this.subject = subject;
		this.daysUntilStarts = daysStart;
	}
	public Subject getSubject() {
		return subject;
	}

	public Integer getStatus() {

		if(daysUntilStarts > 0){

			Integer negativeStart = -this.daysUntilStarts;
			return negativeStart;
		}else if (daysToRun > 0) {

			return daysToRun;
		}else{

			return 0;
		}
	}

	public void aDayPasses(){
		if(daysUntilStarts > 0){
			this.daysUntilStarts -= 1;
		}if(daysToRun > 0){
			this.daysToRun -= 1;
		}
	}
}