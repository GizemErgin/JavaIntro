package Kodlamaio;

public class Student extends User{
	private int studentId;
	private int takenCourseId;

	public Student() {
		super();
	}

	public Student(int userId, String name, String surname, String email, String password, int studentId, int takenCourseId) {
		super(userId, name, surname, email, password);
		this.studentId = studentId;
		this.takenCourseId = takenCourseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getTakenCourseId() {
		return takenCourseId;
	}

	public void setTakenCourseId(int takenCourseId) {
		this.takenCourseId = takenCourseId;
	}


	
	


}
