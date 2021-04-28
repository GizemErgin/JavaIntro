package intro;

public class Strings {

	public static void main(String[] args) {
		String mesaj="Bugün Hava Çok Güzel.";
		
		System.out.println(mesaj);
		System.out.println("Eleman Sayýsý: "+mesaj.length());
		System.out.println("5. Eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!"));
		System.out.println("Küçük b ile baþlýyor mu? "+mesaj.startsWith("b"));
		System.out.println("Nokta ile bitiyor mu? "+mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.print("Ýlk 5 karakter: ");
		System.out.println(karakterler);
		
		System.out.println("(arama soldan) a harfinin soldan indeksi: "+ mesaj.indexOf('a'));
		System.out.println("(arama saðdan) e harfinin soldan indeksi: "+ mesaj.lastIndexOf('e'));

		String yeniMesaj= mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2,5));
 
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
		
	}

}
