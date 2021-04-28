package intro;

public class Switch {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':

			System.out.println("Mükemmel: Geçtiniz");
			break;

		case 'B':
		case 'C':

			System.out.println("Ýyi: Geçtiniz");
			break;

		case 'D':

			System.out.println("Fena Deðil: Geçtiniz");
			break;

		case 'F':

			System.out.println("Kötü: Kaldýnýz");
			break;

		default:
			System.out.println("Geçersiz bir not girdiniz!");
		}
	}

}
