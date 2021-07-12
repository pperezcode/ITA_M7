package exceptions;

@SuppressWarnings("serial")
public class DiameterException extends Exception {

	public DiameterException() {}
	
	public DiameterException(String errorMessage) {
		super(errorMessage);
	}	

}
