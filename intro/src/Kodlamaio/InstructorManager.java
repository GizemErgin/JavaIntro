package Kodlamaio;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("Þu eðitmen eklendi: " + instructor.Name + " " + instructor.Surname);
	}
	
	public void Delete(Instructor instructor) {
		System.out.println("Þu eðitmen silindi: " + instructor.Name + " " + instructor.Surname);
	}
}
