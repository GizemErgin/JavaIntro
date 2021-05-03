package intro.PolymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Veritabanýna loglandý: " + message);

	}
}
