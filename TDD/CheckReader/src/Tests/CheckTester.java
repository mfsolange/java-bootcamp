package Tests;
import static org.junit.Assert.*;

import org.junit.Test;

import Check.Check;


public class CheckTester {

	@Test
	public void readCheckTest() {
		Check check = new Check((double)672534.09);
		assertEquals("Six hundred Seventy Two thousand Five hundred Thirty Four dollars with 09/100 cents",check.read());
	}

}
