public class Subject  {
	
	private Integer id; // Unique id of Subject 
	private Integer specialism; // id to get right teachers 
	private Integer duration; // days of course 
	private String description;  // Description about the subject 

	public Subject(Integer id, Integer specialism, Integer duration) {
		this.id = id;
		this.specialism = specialism;
		this.duration = duration;
	}

	public Integer getID() {
		return id;
	}

	public Integer getSpecialism() {

		return specialism;
	}

	public Integer getDuration() {

		return duration;
	}

	public String getDescription() {
		return description;

	}

	public void setDescription(String description) {
		this.description = description;
		
	}
}