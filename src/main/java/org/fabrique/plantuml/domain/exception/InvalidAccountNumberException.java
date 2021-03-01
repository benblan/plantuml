package org.fabrique.plantuml.domain.exception;

public class InvalidAccountNumberException extends RuntimeException {

	private static final long serialVersionUID = -7881771952438394017L;

	public InvalidAccountNumberException(final String message) {
		super(message);
	}

	public InvalidAccountNumberException() {
		super();
	}
}
