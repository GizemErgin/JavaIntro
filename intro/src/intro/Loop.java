package intro;

import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {
		//FOR
		for (int i=2; i<10; i+=2) {
			System.out.println(i);			
		}
		System.out.println("For Döngüsü Bitti");
		
		//WHILE
		int i=2;
		while (i<10) {
			System.out.println(i);			
			i=i+2;
		}
		System.out.println("While Döngüsü Bitti");

		//DOWHILE
		i=2;
		do {
			System.out.println(i);			
			i=i+2;
		} while (i<10);
		System.out.println("Do While Döngüsü Bitti");

	}

}
