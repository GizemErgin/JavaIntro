 package intro;

public class MiniProjeAsalSay� {

	public static void main(String[] args) {
		int number=-1;
		boolean isPrime =true;
		 
		if(number==1) {
			System.out.println("Say� asal de�ildir: "+number);
			return;
		}
		
		if(number<1) {
			System.out.println("Ge�ersiz say�: "+number);
			return; 
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("Say� asald�r: "+number);
		}else {
			System.out.println("Say� asal de�ildir: "+number);
		}
		
	}

}
