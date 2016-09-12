/**
 * Write a class with a method that throws an exception of the type created in
 * Exercise4. Try compiling it without an exception specification to see what
 * the compiler says. Add the appropriate exception specification. Try out your
 * class and its exception inside a try-catch clause.
 *
 * @author Kim Thy Nguyen
 * @version %I, %G
 * @since 1.0
 *
 */

public class Exercise8 {
	public static void throwException() throws MyException {
		throw new MyException("my exception from Exercise8");
	}

	public static void main(String[] args) {
		try {
			throwException();
		} catch (MyException exception) {
			exception.printMessage();
		}
	}
}