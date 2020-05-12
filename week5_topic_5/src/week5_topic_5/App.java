package week5_topic_5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = new AsteriskLogger();
		
		//4.
		logger.log("Hello");
		
		//5.
		logger.error("Hello");
		
		Logger spaced = new SpacedLogger();
		
		//7.
		spaced.error("Hello");
		
		//8.
		spaced.log("Hello");
	}

}
