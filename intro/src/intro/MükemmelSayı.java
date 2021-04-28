package intro;

public class MükemmelSayý {

	public static void main(String[] args) {
		int number=5;
		int toplam = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				toplam += i;
			}
		}
		if(toplam==number) {
			System.out.println("Mükemmel bir sayýdýr: "+number);
		}else {
			System.out.println("Mükemmel bir sayý deðildir: "+number);
		}
		
	}

}
