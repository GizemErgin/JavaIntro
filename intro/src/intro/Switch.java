package intro;

public class Switch {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':

			System.out.println("M�kemmel: Ge�tiniz");
			break;

		case 'B':
		case 'C':

			System.out.println("�yi: Ge�tiniz");
			break;

		case 'D':

			System.out.println("Fena De�il: Ge�tiniz");
			break;

		case 'F':

			System.out.println("K�t�: Kald�n�z");
			break;

		default:
			System.out.println("Ge�ersiz bir not girdiniz!");
		}
	}

}
