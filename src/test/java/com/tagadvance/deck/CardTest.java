package com.tagadvance.deck;

import org.junit.Test;

import com.google.common.testing.NullPointerTester;

public class CardTest {

	@Test
	public void testConstructorThrowsNullPointerException() {
		NullPointerTester tester = new NullPointerTester();
		tester.testAllPublicConstructors(Card.class);
	}

}
