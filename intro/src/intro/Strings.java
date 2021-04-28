package intro;

public class Strings {

	public static void main(String[] args) {
		String mesaj="Bug�n Hava �ok G�zel.";
		
		System.out.println(mesaj);
		System.out.println("Eleman Say�s�: "+mesaj.length());
		System.out.println("5. Eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println("K���k b ile ba�l�yor mu? "+mesaj.startsWith("b"));
		System.out.println("Nokta ile bitiyor mu? "+mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.print("�lk 5 karakter: ");
		System.out.println(karakterler);
		
		System.out.println("(arama soldan) a harfinin soldan indeksi: "+ mesaj.indexOf('a'));
		System.out.println("(arama sa�dan) e harfinin soldan indeksi: "+ mesaj.lastIndexOf('e'));

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
