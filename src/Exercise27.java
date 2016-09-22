/**
 *  Modify Exercise 3 to convert the exception to a RuntimeException.
 *
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

public class Exercise27 {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3 };
		RuntimeExceptionDemo t = new RuntimeExceptionDemo();
		try {
			t.getValueFromArray(i, 3);
		} catch (RuntimeException e) {
			try {
				throw e.getCause();
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("Index out of bound");
				e1.printStackTrace();
			} catch (Throwable e2) {
				System.out.println("Throwable");
				e2.printStackTrace();
			}
		}

		//t.getValueFromArray(i, 3);
	}

}

class RuntimeExceptionDemo {
	public int getValueFromArray(int[] array, int index) {
		int value;
		try {
			value = array[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException(e);
		}
		return value;
	}
}