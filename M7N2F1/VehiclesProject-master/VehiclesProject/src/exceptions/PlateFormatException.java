package exceptions;

@SuppressWarnings("serial")
public class PlateFormatException extends Exception {

	public PlateFormatException() {}
	
	public PlateFormatException (String errorMessage) {
		super(errorMessage);
	}	

}
