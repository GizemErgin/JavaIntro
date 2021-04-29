package Kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Programlama");
		Instructor instructor1 = new Instructor(1, "Engin","Demiro�");
		
		Course course1 = new Course(
				1, 
				1, 
				"Yaz�l�m Geli�tirme Kamp� C# + ANGULAR",
				"2 ay s�recek Yaz�l�mc� Geli�tirme Yeti�tirme Kamp�",
				0
				);
		
		Course course2 = new Course(
				2, 
				1, 
				"Yaz�l�m Geli�tirme Kamp� JAVA + REACT",
				"2 ay s�recek Yaz�l�mc� Geli�tirme Yeti�tirme Kamp�",
				0
				);
		
		Course course3 = new Course(
				3, 
				1, 
				"Programlamaya Giri� ��in Temel Kurs",
				"Python, Java ve C# gibi t�m programlama dilleri i�in temel programlama mant���",
				0
				);
		
		Category[] categories = {
			category1
		};
		
		Instructor[] instructors = {
			instructor1	
		};
		
		Course[] courses = {
			course1,
			course2,
			course3
		};
		
		for(Course course: courses) {
			System.out.println(course.Id + " " + course.CourseName);
		}
		
		for(Instructor instructor: instructors) {
			System.out.println(instructor.Id + " " + instructor.Name + " " + instructor.Surname);
		}
		
		for(Category category: categories) {
			System.out.println(category.Id + " "+ category.CategoryName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course3);
		courseManager.Delete(course1);
		
	}
}