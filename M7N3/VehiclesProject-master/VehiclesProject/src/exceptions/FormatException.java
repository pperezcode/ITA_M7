package exceptions;

@SuppressWarnings("serial")
public class FormatException extends Exception {
	
	public FormatException() {}
	
	public FormatException(String errorMessage) {
		super(errorMessage);
	}

}
