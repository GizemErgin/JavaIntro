package Kodlamaio;

public class UserManager {
	public void Add(User user) {
		System.out.println("�u kullan�c� eklendi: " + user.getName() + " " + user.getSurname());
	}
	
	public void Delete(User user) {
		System.out.println("�u kullan�c� silindi: " + user.getName() + " " + user.getSurname());
	}
}

