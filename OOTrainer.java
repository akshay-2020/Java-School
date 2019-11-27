public class OOTrainer extends Teacher{
	
	public OOTrainer(String name, char gender, Integer age){

		super(name, gender, age);

	}

	public boolean canTeach(Subject subject){
		boolean teach = false;
		int specialism =  subject.getSpecialism();
		if(specialism == 1 || specialism == 2 || specialism == 3 ){
			teach = true;

		}

		return teach;

	}
}