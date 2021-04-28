package intro;

public class Arrays {

	public static void main(String[] args) {
		String[] ogrenciler = {
			"Gizem",
			"Ece",
			"Hanife",
			"Ezgi"
		};
		
		//ForEach
		for (String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("--------------------------");
		
		//For
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
	}

}
