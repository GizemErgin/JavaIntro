package intro;

public class RecapDemo2 {

	public static void main(String[] args) {
		double[] myList = {
				1.2,
				1.3,
				4.3,
				5.6,
				6.13
		};
		double total=0;
		double max = myList[0];
		
		for(double number:myList) {
			if (max<number) {
				max=number;
			}
			System.out.println(number);
			total=total+number;
		}
		
		System.out.println("Toplam: "+total);
		System.out.println("En Büyük: "+max);


	}

}
