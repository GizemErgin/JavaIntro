package intro;

public class SesliHarf {

	public static void main(String[] args) {
		char harf = '�';
		
		switch (harf) {
		case 'A': 
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harftir: "+harf);
			break;
		case 'E': 
		case '�':
		case '�':
		case '�':
			System.out.println("�nce sesli harftir: "+harf);
			break;
		default:
			System.out.println("�ns�z bir harf girilmi�tir: "+harf);
		}
		
	}

}
