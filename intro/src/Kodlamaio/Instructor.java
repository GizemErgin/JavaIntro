package Kodlamaio;

public class Instructor extends User {

	private int instructorId;
	private int givenCourseId;
	
	public Instructor() {
		super();
	}

	public Instructor(int userId, String name, String surname, String email, String password, int instructorId, int givenCourseId) {
		super(userId, name, surname, email, password);
		this.givenCourseId = givenCourseId;
		this.instructorId = instructorId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getGivenCourseId() {
		return givenCourseId;
	}

	public void setGivenCourseId(int givenCourseId) {
		this.givenCourseId = givenCourseId;
	}



}
