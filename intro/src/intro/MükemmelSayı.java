package intro;

public class M�kemmelSay� {

	public static void main(String[] args) {
		int number=5;
		int toplam = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				toplam += i;
			}
		}
		if(toplam==number) {
			System.out.println("M�kemmel bir say�d�r: "+number);
		}else {
			System.out.println("M�kemmel bir say� de�ildir: "+number);
		}
		
	}

}
