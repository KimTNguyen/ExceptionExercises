/**
 * Define an object reference and initialize it to null. Try to call a method
 * through this reference. Now wrap the code in a try-catch clause to catch the
 * exception
 * 
 * @author Kim Thy Nguyen
 * @version %I, %G
 * @since 1.0
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		String temp = null;

		try {
			temp.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

}
