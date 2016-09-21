
/**
 * Create a class called FailingConstructor with a constructor that might fail 
 * partway through the construction process and throw an exception. In main( ),
 * write code that properly guards against this failure.
 *
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

import java.io.*;

public class Exercise22 {
	public static void main(String[] args) {
		try {
			FailingConstructor f = new FailingConstructor("java.txt");
			try {
				System.out.println("read file");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				f.closeFile();
			}
		} catch (Exception e) {
			System.out.println("Construction failed");
			e.printStackTrace();
		}
	}
}

class FailingConstructor {
	private BufferedReader in;
	FailingConstructor(String fileName) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e1) {
			try {
				in.close();
			} catch (Exception e2) {
				System.out.println("problems with closing file in FailingConstructor()");
				e2.printStackTrace();
				throw new Exception(e2.getMessage(), e1);
			}
		}
	}

	public void closeFile() {
		try {
			in.close();
			System.out.println("file is closed");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(new Exception(e.getMessage()));
		}
	}
}