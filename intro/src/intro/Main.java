package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun=8.20;
		
		int vade=36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}
		else if(dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");

		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		
		
		String[] krediler = {
				"Hýzlý Kredi",
				"Multu Emekli Kredi",
				"Konut Kredi",
				"Msb Kredi"
		};
		
		for(String kredi: krediler) {
			System.out.println(kredi);
		}

} 
}
