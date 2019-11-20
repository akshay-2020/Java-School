import java.util.ArrayList;

public class Student extends Person {

	private ArrayList<Integer> certificates= new ArrayList<Integer>(); 

														   /*Subject addCertificate*/ 	
	public Student(String name, char gender, Integer age ) {
		super(name, gender, age);
		//this.certificates = addCertificate.getID();
	}

	public void graduate(Subject addID) {
		this.certificates.add(addID.getID());


	}

	public ArrayList getCertificates() {
		return this.certificates;
	}

	public boolean hasCertificate(Subject checkCertificate) {

		for(int element: certificates){
			if(element != checkCertificate.getID()) {
				this.certificates.add(checkCertificate.getID());
				return true;
			}

		}

		return false;


	}
}