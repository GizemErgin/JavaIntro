package Kodlamaio;

public class CourseManager {
	public void Add(Course course) {
		System.out.println("Þu kurs eklendi: " + course.CourseName);
	}
	
	public void Delete(Course course) {
		System.out.println("Þu kurs silindi: "+course.CourseName);
	}
}
