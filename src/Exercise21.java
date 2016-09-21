/**
 * Demonstrate that a derived-class constructor cannot catch exceptions thrown by its 
 * base-class constructor.
 *
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

class Father {
	Father() throws Exception {
		throw new Exception("exception from Father");
	}
}

public class Exercise21 extends Father {
	Exercise21() throws Exception {
	}

	public static void main(String[] args) {
		try {
			Exercise21 ch = new Exercise21();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}