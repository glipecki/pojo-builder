package net.lipecki.pojobuilder;

/**
 * Can't instantionate builder exception.
 */
public class CantInstantionatePojoBuilderException extends IllegalArgumentException {

	private static final long serialVersionUID = -7081207809511566600L;

	public CantInstantionatePojoBuilderException(final Throwable cause) {
		super("Can't instationate object for builder", cause);
	}

}
