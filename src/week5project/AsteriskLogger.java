package week5project;

public class AsteriskLogger implements Logger  {

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		
	}

	@Override
	public void Error(String Error) {
		 int length = Error.length() + 8;
		    StringBuilder sb = new StringBuilder();

		    for (int i = 0; i < length; i++) {
		        sb.append("*");
		    }

		    System.out.println(sb.toString());
		    System.out.println("***ERROR: " + Error + "***");
		    System.out.println(sb.toString());
		
	}

}
