package main.java.com.nocampo.jersey.excepcion;

public class ImprimirFacturaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3102012674899873117L;
	public ImprimirFacturaException() { 
		super(); 
	}
	public ImprimirFacturaException(String message) { 
		super(message); 
	}
	public ImprimirFacturaException(String message, Throwable cause) {
		super(message, cause); 
	}
	public ImprimirFacturaException(Throwable cause) { 
		super(cause); 
	}

}
