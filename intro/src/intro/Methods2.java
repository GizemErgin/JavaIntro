package intro;

public class Methods2 {

	public static void main(String[] args) {
		int sayi = topla(20,10);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}
