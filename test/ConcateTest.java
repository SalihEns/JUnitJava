package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class ConcateTest {

	@Test
	public void testConcatenate() {
		Junit test = new Junit(); 
		String result = test.concatenate("one", "two") ; 
		assertEquals("onetwo", result);
		
		
	}

}
