package com.example.ci;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void testStringReverse() {
		Example e = new Example();
		assertTrue(e.stringReverse("hello world!").equals("!dlrow olleh"));
	}

	@Test
	public void testStringReverseHandlesNull() {
		Example e = new Example();
		assertTrue(e.stringReverse(null) == null);
	}

	@Test
	public void testWordJumble() {
		Example e = new Example();
		String s = "This is a word jumble.";
		String j = e.wordJumble(s);
		assertTrue(s.length() == j.length());
		String[] ss = s.split("\\s+");
		String[] js = j.split("\\s+");
		assertTrue(ss.length == js.length);
		for (int i = 0; i < ss.length; i++) {
			assertTrue(ss[i].charAt(0) == js[i].charAt(0));
			assertTrue(ss[i].charAt(ss[i].length() - 1) == js[i].charAt(js[i].length() - 1));
		}
	}

	@Test
	public void testWordJumbleHandlesNull() {
		Example e = new Example();
		assertTrue(e.wordJumble(null) == null);
	}

	@Test
	public void testWordJumbleShortSentence() {
		Example e = new Example();
		assertTrue(e.wordJumble("hi").equals("hi"));
	}

}
