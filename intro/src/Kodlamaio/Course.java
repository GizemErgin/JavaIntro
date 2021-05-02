package Kodlamaio;

public class Course {
	private int id;
	private int instructorId;
	private String courseName;
	private String description;
	private int price;
	
	public Course() {
		super();
	}

	public Course(int id, int instructorId, String courseName, String description, int price) {
		super();
		this.id = id;
		this.instructorId = instructorId;
		this.courseName = courseName;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
