package week5project;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String Log) {
		StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < Log.length(); i++) {
	        sb.append(Log.charAt(i) + " ");
	    }

	    System.out.println(sb.toString());
		
	}

	@Override
	public void Error(String Error) {
		StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < Error.length(); i++) {
	        sb.append(Error.charAt(i) + " ");
	    }

	    System.out.println("ERROR: " + sb.toString());
		
	}

}
