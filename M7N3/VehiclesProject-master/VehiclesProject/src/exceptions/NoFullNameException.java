package exceptions;

@SuppressWarnings("serial")
public class NoFullNameException extends Exception {
	
	public NoFullNameException() {}

	public NoFullNameException(String errorMessage) {
		super(errorMessage);
	}
	
}
