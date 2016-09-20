/** Create a class with two methods, f() and g(). In g(), throw an exception
 * of a new type that you define. In f(), call g(), catch its exception and,
 * in the catch clause, throw a different exception (of a second type that 
 * you define). Test your code in main().
 *
 * @author Kim Thy Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

 public class Exercise10 {
 	static void f() throws MyException1 {
 		try {
 			g();
 		} catch (MyException2 e2) {
 			throw new MyException1("MyException1", e2);
		}
 	}

 	static void g() throws MyException2 {
 		throw new MyException2("MyException2");
 	}

 	public static void main(String[] args) {
 		try {
 			f();
 		} catch (MyException1 e1) {
 			e1.printStackTrace();
 		}
 	}
 }
