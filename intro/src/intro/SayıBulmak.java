package intro;

public class Say�Bulmak {

	public static void main(String[] args) {
		int[] sayilar= {
		   1, 2, 5, 7, 9, 0
		};
		int aranacakSayi=5;
		boolean varMi = false;
		
		for (int sayi: sayilar) {
			if(sayi==aranacakSayi) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Arad���n�z say� bulundu: " + aranacakSayi);
		}else {
			System.out.println("Arad���n�z say� bulunamad�: " + aranacakSayi);
		}
	}

}
