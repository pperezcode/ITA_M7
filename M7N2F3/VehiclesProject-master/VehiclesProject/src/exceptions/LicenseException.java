package exceptions;

@SuppressWarnings("serial")
public class LicenseException extends Exception {
	
	public LicenseException() {}

	public LicenseException(String errorMessage) {
		super(errorMessage);
	}
}