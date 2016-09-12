/**
 * Modify Exercise3 so that the catch clause logs the results.
 * 
 * @author Kim Thy Nguyen
 * @version %I, %G
 * @since 1.0
 *
 */
import java.util.logging.*;
import java.io.*;

public class Exercise7 {

	private static Logger logger = Logger.getLogger("Exercise7");

	private static void getLogger(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		int[] i = { 1, 2, 3 };

		try {
			i[3] = 8;
		} catch (ArrayIndexOutOfBoundsException e) {
			getLogger(e);
		}

	}

}