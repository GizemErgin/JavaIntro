package Kodlamaio;

public class StudentManager {
	public void Add(Student student) {
		System.out.println("�u ��renci eklendi: " + student.getName() + " " + student.getSurname());
	}
	
	public void Delete(Student student) {
		System.out.println("�u ��renci silindi: " + student.getName() + " " + student.getSurname());
	}
}

