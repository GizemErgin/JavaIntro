package intro;

public class Methods {

	public static void main(String[] args) {

		sayiBulmaca();
	}

	
	
	
	public static void sayiBulmaca(){
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacakSayi = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Aradýðýnýz sayý bulundu: " + aranacakSayi);
		} else {
			mesajVer("Aradýðýnýz sayý bulunamadý: " + aranacakSayi);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
