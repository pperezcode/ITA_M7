package exceptions;

@SuppressWarnings("serial")
public class DifferentWheelsException extends Exception {

	public DifferentWheelsException() {}
	
	public DifferentWheelsException (String errorMessage) {
		super(errorMessage);
	}	

}
