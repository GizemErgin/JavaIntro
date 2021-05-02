package Kodlamaio;

public class UserManager {
	public void Add(User user) {
		System.out.println("Þu kullanýcý eklendi: " + user.getName() + " " + user.getSurname());
	}
	
	public void Delete(User user) {
		System.out.println("Þu kullanýcý silindi: " + user.getName() + " " + user.getSurname());
	}
}

