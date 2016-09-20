/**
 * Exercise14.java can fail by throwing a RuntimeException inside the try block.
 *
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

public class Exercise14 {
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
		}
	}
}

class Switch {
	private boolean state = false;

	public boolean read() {
		return false;
	}

	public void on() {
		state = true;
		System.out.println(this);
	}

	public void off() {
		state = false;
		System.out.println(this);
	}

	public String toString() {
		return state ? "on" : "off";
	}

}

class OnOffException1 extends Exception {

}

class OnOffException2 extends Exception {

}