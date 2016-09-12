/**
 * Create two exception classes, each of which performs its own logging automatically.
 * Demonstrate that these work.
 * 
 * @author Kim Thy Nguyen
 * @version %I, %G
 * @since 1.0
 *
 */
import java.util.logging.*;
import java.io.*;

public class Exercise6 {

	public static void main(String[] args) {
		try {
			throw new FirstExceptionLogging();
		} catch (FirstExceptionLogging e) {
			System.err.println("Catch "+e);
		}

		try {
			throw new SecondExceptionLogging();
		} catch (SecondExceptionLogging e) {
			System.err.println("Catch "+e);
		}

	}

}

class FirstExceptionLogging extends Exception {
	private static Logger logger = Logger.getLogger("FirstExceptionLogging");

	public FirstExceptionLogging() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

class SecondExceptionLogging extends Exception {
	private static Logger logger = Logger.getLogger("SecondExceptionLogging");

	public SecondExceptionLogging() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
