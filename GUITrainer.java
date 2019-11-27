public class GUITrainer extends Teacher{

	public GUITrainer(String name, char gender, Integer age){

		super(name, gender, age);

	}

	public boolean canTeach(Subject subject){
		boolean teach = false;
		int specialism =  subject.getSpecialism();
		if(specialism == 1 || specialism == 2 || specialism == 4 ){
			teach = true;

		}

		return teach;

	}

} 