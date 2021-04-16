package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitString {

	@Test
	public void test() {
		JUnitTestingClass junitstring = new JUnitTestingClass();
		String result = junitstring.addString("hello","world");
		assertEquals ("helloworld", result);	}

}
