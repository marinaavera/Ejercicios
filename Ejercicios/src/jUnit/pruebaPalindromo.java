package jUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class pruebaPalindromo {
	@Test
	public void testIsPalindromo() {
		Palindromo p = new Palindromo();
		assertTrue(p.isPalindrome("radar"));
		assertFalse(p.isPalindrome("Marina"));
		assertFalse(p.isPalindrome(null));
	}
}
