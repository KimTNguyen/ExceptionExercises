/**
 * Modify Exercise9 by adding a finally clause. Verify that your finally clause
 * is executed, even if a NullPointerException is thrown.
 *
 * @author Kim Thy Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

public class Exercise13 {
	static void throwExceptions() throws MyException1, MyException2, MyException3 {
		throw new MyException1("Exception1");
	}

	public static void main(String[] args) {
		try {
			throwExceptions();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("in finally block");
		}
	}
}

