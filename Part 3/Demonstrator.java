public class Demonstrator extends Instructor {
	public Demonstrator(String name, char gender, Integer age){

		super(name, gender, age);

	}

	public boolean canTeach(Subject subject){
		boolean teach = false;
		if(subject.getSpecialism() == 2){
			teach = true;

		}

		return teach;

	}

}