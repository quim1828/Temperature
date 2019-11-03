package exceptions;

public class TemperatureException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public TemperatureException(String msg) {
		super(msg);
	}

}
