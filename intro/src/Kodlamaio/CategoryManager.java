package Kodlamaio;

public class CategoryManager {
	public void Add(Category category) {
		System.out.println("�u kategori eklendi: " + category.getCategoryName());
	}
	
	public void Delete(Category category) {
		System.out.println("�u kategori silindi: "+ category.getCategoryName());
	}
}
