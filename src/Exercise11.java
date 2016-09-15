/** Create a class with two methods, f() and g(). In g(), throw an exception
 * of a new type that you define. In f(), call g(), catch its exception and,
 * in the catch clause, wrap g()'s exception in a RuntimeException. Test your 
 * code in main().
 *
 * @author Kim Thy Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

public class Exercise11 {
	static void f() {
		try {
			g();
		} catch (MyException2 e2) {
			throw new RuntimeException(new MyException1("thrown from f()"));
		}
	}

	static void g() throws MyException2 {
		throw new MyException2("thrown from g()");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (RuntimeException e1) {
			e1.printStackTrace();
		}
	}
}