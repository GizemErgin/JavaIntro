package intro.PolymorphismDemo;

public class EmailLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Email gönderildi: " + message);
	}
}
