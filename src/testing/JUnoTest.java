package testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class JUnoTest {

	@Test
	public void calculatorTest() {
		JUnoTesting calculator = new JUnoTesting();
		assertNotEquals(4, calculator.addNumbers(7, 3));
	}
	
	@Test
	public void boolTester() {
		JUnoTesting bool = new JUnoTesting();
		assertFalse(bool.straightLean());
	}
}
