package Kodlamaio;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("�u e�itmen eklendi: " + instructor.Name + " " + instructor.Surname);
	}
	
	public void Delete(Instructor instructor) {
		System.out.println("�u e�itmen silindi: " + instructor.Name + " " + instructor.Surname);
	}
}
