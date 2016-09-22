/**
 * Modify Exercise 4 so that the custom exception class inherits from RuntimeException, 
 * and show that the compiler allows you to leave out the try block. 
 *
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

class CustomException extends RuntimeException {
	String message = null;

	public CustomException(String s) {
		super(s);
		message = s;
	}
	
	public void printMessage() {
		System.out.println(message);
	}
}

public class Exercise28 {
	public static void catchException() throws CustomException {
		throw new CustomException("my message");
	}
	public static void main(String[] args) {
		catchException();
	}

}