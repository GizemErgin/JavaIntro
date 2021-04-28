 package intro;

public class MiniProjeAsalSayý {

	public static void main(String[] args) {
		int number=-1;
		boolean isPrime =true;
		 
		if(number==1) {
			System.out.println("Sayý asal deðildir: "+number);
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayý: "+number);
			return; 
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayý asaldýr: "+number);
		}else {
			System.out.println("Sayý asal deðildir: "+number);
		}
		
	}

}
