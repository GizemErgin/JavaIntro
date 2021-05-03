package intro.MethodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		int sonuc2 = dortIslem.Topla(1, 2, 3);
		System.out.println(sonuc);
		System.out.println(sonuc2);

	}

}
