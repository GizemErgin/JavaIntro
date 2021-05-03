package intro.ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product1= new Product();
		
		product1.setId(1);
		product1.setName("Laptop");
		product1.setDescription("Asus Laptop");
		product1.setPrice(15000);
		product1.setStockAmount(3);
		
		Product product2 = new Product(2,
			"Klavye",
			"F Klavye",
			250,
			5);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		
		System.out.println(product1.getProductCode());
		System.out.println(product2.getProductCode());

	}

}
