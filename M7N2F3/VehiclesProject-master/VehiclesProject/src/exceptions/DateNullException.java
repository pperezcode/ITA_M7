package exceptions;

@SuppressWarnings("serial")
public class DateNullException extends Exception {
	
	public DateNullException() {}
	
	public DateNullException(String errorMessage) {
		super(errorMessage);
	}

}
