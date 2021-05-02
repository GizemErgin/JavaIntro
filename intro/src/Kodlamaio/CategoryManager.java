package Kodlamaio;

public class CategoryManager {
	public void Add(Category category) {
		System.out.println("Þu kategori eklendi: " + category.getCategoryName());
	}
	
	public void Delete(Category category) {
		System.out.println("Þu kategori silindi: "+ category.getCategoryName());
	}
}
