package com.example.ci;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void testStringReverse() {
		Example e =  new Example();
		assertTrue(e.stringReverse("hello world!").equals("!dlrow olleh"));
	}
	@Test
	public void testStringReverseHandlesNull() {
		Example e =  new Example();
		assertTrue(e.stringReverse(null) == null);
	}

}
