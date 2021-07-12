package exceptions;

@SuppressWarnings("serial")
public class WheelNumberException extends Exception {

	public WheelNumberException() {}
	
	public WheelNumberException (String errorMessage) {
		super(errorMessage);
	}	

}
