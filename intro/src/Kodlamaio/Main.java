package Kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Programlama");
		
		Student student1 = new Student();
		student1.setUserId(2);
		student1.setStudentId(1);
		student1.setName("Gizem");
		student1.setSurname("Ergin");
		student1.setEmail("gizem@gizem.com");
		student1.setPassword("12345");
		student1.setTakenCourseId(2);
		
		Instructor instructor1 = new Instructor();
		instructor1.setUserId(1);
		instructor1.setInstructorId(1);
		instructor1.setName("Engin");
		instructor1.setSurname("Demiroð");
		instructor1.setEmail("engin@engin.com");
		instructor1.setPassword("55555");
		instructor1.setGivenCourseId(2);

		Course course1 = new Course(
				1, 
				1, 
				"Yazýlým Geliþtirme Kampý C# + ANGULAR",
				"2 ay sürecek Yazýlýmcý Geliþtirme Yetiþtirme Kampý",
				0
				);
		
		Course course2 = new Course(
				2, 
				1, 
				"Yazýlým Geliþtirme Kampý JAVA + REACT",
				"2 ay sürecek Yazýlýmcý Geliþtirme Yetiþtirme Kampý",
				0
				);
		
		Course course3 = new Course(
				3, 
				1, 
				"Programlamaya Giriþ Ýçin Temel Kurs",
				"Python, Java ve C# gibi tüm programlama dilleri için temel programlama mantýðý",
				0
				);
		
		
		Category[] categories = {
			category1
		};
		
		User[] users = {
				student1,
				instructor1
			};
		
		Student[] students = {
				student1	
			};
		
		Instructor[] instructors = {
			instructor1	
		};
		
		Course[] courses = {
			course1,
			course2,
			course3
		};
		
		
		System.out.println("KULLANICILAR");
		for(User user:users) {
			System.out.println(user.getUserId() + " " + user.getName());
		}
		
		
		System.out.println("----------------------------------");
		System.out.println("ÖÐRENCÝLER");
		for(Student student: students) {
			System.out.println(student.getUserId()+ " "+ student.getName() + " " + student.getSurname());
		}
		
		System.out.println("----------------------------------");
		System.out.println("EÐÝTMENLER");
		for(Instructor instructor: instructors) {
			System.out.println(instructor.getInstructorId() + " " + instructor.getName() + " " + instructor.getSurname());
		}
		
		System.out.println("----------------------------------");
		System.out.println("KURSLAR");
		for(Course course: courses) {
			System.out.println(course.getId() + " " + course.getCourseName());
		}

		
		
		System.out.println("----------------------------------");
		System.out.println("KATEGORÝLER");
		for(Category category: categories) {
			System.out.println(category.getId() + " "+ category.getCategoryName());
		}
		
		System.out.println("----------------------------------");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course3);
		courseManager.Delete(course1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor1);

		StudentManager studentManager = new StudentManager();
		studentManager.Add(student1);
	
		
	}
}