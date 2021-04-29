package Kodlamaio;

public class Course {
	int Id;
	int InstructorId;
	String CourseName;
	String Description;
	int Price;
	
	public Course(int id, int instructorId, String courseName, String description, int price) {
		super();
		Id = id;
		InstructorId = instructorId;
		CourseName = courseName;
		Description = description;
		Price = price;
	}
}
