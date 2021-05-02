package Kodlamaio;

public class StudentManager {
	public void Add(Student student) {
		System.out.println("Şu öğrenci eklendi: " + student.getName() + " " + student.getSurname());
	}
	
	public void Delete(Student student) {
		System.out.println("Şu öğrenci silindi: " + student.getName() + " " + student.getSurname());
	}
}

