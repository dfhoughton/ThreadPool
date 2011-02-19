package dfh;

/**
 * Just your standard {@link Exception} class to tag exceptions thrown from this package.
 * <p>
 * <b>Creation date:</b> Feb 19, 2011
 *
 * @author David Houghton
 *
 */
public class ThreadPoolException extends Exception {
	public ThreadPoolException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;
}
