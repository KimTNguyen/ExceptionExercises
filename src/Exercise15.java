/**
 * Exercise15.java doesn’t fail by throwing a RuntimeException inside the try block.
 *
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

public class Exercise15 {
	private static Switch sw = new Switch();
	public static void f() throws OnOffException1, OnOffException2 {
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try {
			sw.on();
			f();
			sw.off();
		} catch (OnOffException1 e) {
			e.printStackTrace();
			sw.off();
		} catch (OnOffException2 e) {
			e.printStackTrace();
			sw.off();
		} finally {
			System.out.println("switch off in finally block");
			sw.off();
		}
	}
}