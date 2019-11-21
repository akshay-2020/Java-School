import java.util.ArrayList;

public class Student extends Person {

	private ArrayList<Integer> certificates= new ArrayList<Integer>(); 

														   /*Subject addCertificate*/ 	
	public Student(String name, char gender, Integer age ) {
		super(name, gender, age);
		//this.certificates = addCertificate.getID();
	}

	public void graduate(Subject addID) {

	System.out.println("************************");
		System.out.println(addID.getID());
		System.out.println(certificates);
		//hasCertificate(addID);
			this.certificates.add(addID.getID());
		
		System.out.println(certificates);
		System.out.println("************************");
		


	}

	public ArrayList getCertificates() {
		return this.certificates;
	}

	public boolean hasCertificate(Subject checkCertificate) {
		boolean check = false;
		boolean oldAndNew = false;
		boolean empty = true;

		if(certificates.isEmpty() == empty){
			System.out.println("New Certificate");
			check = false;

			}

		for(int element: certificates){


			if(element == checkCertificate.getID()){
				System.out.println("Already got it");
				check = true;
				oldAndNew = true;
			} else if(element != checkCertificate.getID()) {
				//this.certificates.add(checkCertificate.getID());
				System.out.println("New Certificate");
				check = false;
				   }

			

			


		}
		
		if(check != oldAndNew){
			check = true;
		} 
		System.out.println(check);
		return check;
		

		


	}
}