package Kodlamaio;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("�u e�itmen eklendi: " + instructor.getName() + " " + instructor.getSurname());
	}
	
	public void Delete(Instructor instructor) {
		System.out.println("�u e�itmen silindi: " + instructor.getName() + " " + instructor.getSurname());
	}
}

