package junit.question2;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverse_regularString() {
		assertEquals("cba", ReverseString.reverse("abc"));
		assertEquals("54321", ReverseString.reverse("12345"));
	}

	@Test
	public void testReverse_emptyString() {
		assertEquals("", ReverseString.reverse(""));
	}

	@Test
	public void testReverse_nullInput() {
		assertNull(ReverseString.reverse(null));
	}
}