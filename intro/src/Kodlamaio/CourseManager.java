package Kodlamaio;

public class CourseManager {
	public void Add(Course course) {
		System.out.println("�u kurs eklendi: " + course.CourseName);
	}
	
	public void Delete(Course course) {
		System.out.println("�u kurs silindi: "+course.CourseName);
	}
}
