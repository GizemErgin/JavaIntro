package intro.PolymorphismDemo;

public class FileLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Dosyaya loglandý: " + message);
	}
}
