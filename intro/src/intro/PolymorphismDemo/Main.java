package intro.PolymorphismDemo;

import java.io.File;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new DatabaseLogger(), new FileLogger()};
		
		for(BaseLogger logger:loggers){
			logger.log("Log mesajý");
		}
		
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		
	}
	
}
