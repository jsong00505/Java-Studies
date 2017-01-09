package jsong00505.core.utils;

public class HTTPUtilException extends Exception {

	private static final long serialVersionUID = -6367151228774692606L;

	/**
	 * @param message
	 */
	public HTTPUtilException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public HTTPUtilException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public HTTPUtilException(Throwable cause) {
		super(cause);
	}
}
