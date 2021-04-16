package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumber {

	@Test
	public void test() {

		JUnitTestingClass junit= new JUnitTestingClass();
		int result = junit.addNumbers(100,200);
		assertEquals (300, result);
	}

}
