package junit.question1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	public void validInputs() {
		assertEquals(1, Factorial.factorial(0));
		assertEquals(1, Factorial.factorial(1));
		assertEquals(2, Factorial.factorial(2));
		assertEquals(6, Factorial.factorial(3));
		assertEquals(24, Factorial.factorial(4));
		assertEquals(120, Factorial.factorial(5));
	}
	
	@Test
	public void invalidInputs() {
		assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
		assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-10));
	}
}