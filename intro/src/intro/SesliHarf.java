package intro;

public class SesliHarf {

	public static void main(String[] args) {
		char harf = 'Þ';
		
		switch (harf) {
		case 'A': 
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harftir: "+harf);
			break;
		case 'E': 
		case 'Ý':
		case 'Ö':
		case 'Ü':
			System.out.println("Ýnce sesli harftir: "+harf);
			break;
		default:
			System.out.println("Ünsüz bir harf girilmiþtir: "+harf);
		}
		
	}

}
