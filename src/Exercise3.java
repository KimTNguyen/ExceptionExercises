/**
 * Write code to generate and catch an ArrayIndexOutOfBoundsException
 * 
 * @author Kim Thy Nguyen
 * @version %I, %G
 * @since 1.0
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3 };

		try {
			i[3] = 8;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
