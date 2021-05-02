package Kodlamaio;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("Þu eðitmen eklendi: " + instructor.getName() + " " + instructor.getSurname());
	}
	
	public void Delete(Instructor instructor) {
		System.out.println("Þu eðitmen silindi: " + instructor.getName() + " " + instructor.getSurname());
	}
}

