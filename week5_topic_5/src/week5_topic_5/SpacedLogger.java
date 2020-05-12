package week5_topic_5;
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder logResult = new StringBuilder();
		for(int i=0; i<log.length(); i++){
			logResult.append(log.charAt(i) + " ");
		}
		System.out.println(logResult);
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder errorResult = new StringBuilder();
		for(int i=0; i<error.length(); i++){
			errorResult.append(error.charAt(i) + " ");
		}
		System.out.println("ERROR: " + errorResult);		
	}

}
