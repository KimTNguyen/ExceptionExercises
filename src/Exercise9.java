/**
 * Create three new types of exceptions. Write a class with a method that throws
 * all three. In main(), call the method but only use a single catch clause that
 * will catch all three types of exception
 *
 * @author Kim Thy Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

public class Exercise9 {
	private static void throwExceptions() throws MyException1, MyException2, MyException3 {
		throw new MyException1("Exception1");
	}

	public static void main(String[] args) {
		try {
			throwExceptions();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyException1 extends Exception {
	MyException1(String msg) {
		super(msg);
	}
	MyException1(String msg, Throwable cause) {
		super(msg, cause);
	}
}

class MyException2 extends Exception {
	MyException2(String msg) {
		super(msg);
	}
}

class MyException3 extends Exception {
	MyException3(String msg) {
		super(msg);
	}
}
