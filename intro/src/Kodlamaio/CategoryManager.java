package Kodlamaio;

public class CategoryManager {
	public void Add(Category category) {
		System.out.println("Þu kategori eklendi: " + category.CategoryName);
	}
	
	public void Delete(Category category) {
		System.out.println("Þu kategori silindi: "+ category.CategoryName);
	}
}
