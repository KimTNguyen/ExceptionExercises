
/**
 * Create your own exception class using the extends keyword. Write a
 * constructor for this class that takes a String argument and stores it inside
 * the object with a String reference. Write a method that displays the stored
 * String. Create a try-catch clause to exercise your new exception.
 * 
 * @author Kim Thy Nguyen
 * @version %I, %G
 * @since 1.0
 *
 */

class MyException extends Exception {
	String message = null;

	public MyException(String s) {
		super(s);
		message = s;
	}
	
	public void printMessage() {
		System.out.println(message);
	}
}

public class Exercise4 {
	public static void catchException() throws MyException {
		throw new MyException("my message");
	}
	public static void main(String[] args) {
		try {
			catchException();
		} catch (MyException e) {
			e.printMessage();
		}
	}

}


