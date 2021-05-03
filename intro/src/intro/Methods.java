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
			mesajVer("Arad���n�z say� bulundu: " + aranacakSayi);
		} else {
			mesajVer("Arad���n�z say� bulunamad�: " + aranacakSayi);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
