package Kodlamaio;

public class CategoryManager {
	public void Add(Category category) {
		System.out.println("�u kategori eklendi: " + category.CategoryName);
	}
	
	public void Delete(Category category) {
		System.out.println("�u kategori silindi: "+ category.CategoryName);
	}
}
