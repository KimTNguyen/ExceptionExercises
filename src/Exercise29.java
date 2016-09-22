/**
 * Modify all the exception types in Stormylnning.java so that they extend
 * RuntimeException, and show that no exception specifications or try blocks 
 * are necessary. Remove the ‘//!’ comments and show how the methods can
 * be compiled without specifications.
 * 
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

class BaseballException extends RuntimeException {}
class Foul extends RuntimeException {}
class Strike extends RuntimeException {}

abstract class Inning {
	public Inning() throws BaseballException {}
	public void event() throws BaseballException {
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {}
}

class StormException extends RuntimeException {}
class RainedOut extends RuntimeException {}
class PopFoul extends RuntimeException {}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class Exercise29 extends Inning implements Storm {
	// no exception specifications are necessaryneeded since all the exception 
	// types extend RuntimeException
	public Exercise29() {}

	public void walk() {
		throw new PopFoul();
	}
	public void rainHard() { 
		throw new RainedOut();
	}
	public void event() {
		throw new RainedOut();
	}

	public void atBat() {
		throw new PopFoul();
	}
	public static void main(String[] args) {
		// no try blocks are necessaryneeded since all the exception types extend 
		// RuntimeException

		Exercise29 si = new Exercise29();
		si.atBat();

		// this block won't be executed since the above code throws exception
		// without catching
		System.out.println("next block");
		Inning i = new Exercise29();
		i.atBat();
		
	}
}