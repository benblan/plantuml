package org.fabrique.plantuml.domain.exception;

public class NotSupportedException extends RuntimeException {

	private static final long serialVersionUID = 2566093349888562731L;

	public NotSupportedException(final String message) {
		super(message);
	}

	public NotSupportedException() {
		super();
	}

}
