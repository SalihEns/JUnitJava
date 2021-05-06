package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Junit test = new Junit(); 
		int result = test.multiply(3, 4) ; 
		assertEquals(12, result);
		
		// EXAMPLES
//		ArrayIntList list = new ArrayIntList();
//		list.add(42);
//		list.add(-3);
//		list.add(17);
//		list.add(99);
//
//		assertEquals(4, list.size());
//		assertEquals(17, list.get(2));
//		assertTrue(list.contains(-3));
//		assertFalse(list.isEmpty());
		
		//BAD CODING! 
//		// This code uses bad style.
//		assertTrue(list.size() == 4);         // bad; use assertEquals
//		assertTrue(list.get(2) == 17);        // bad; use assertEquals
//		if (!list.contains(-3)) {
//		    fail();                           // bad; use assertTrue
//		}
//		assertTrue(!list.isEmpty());          // bad; use assertFalse and delete the !
		
//		>>>>>>// MORE EXAMPLES//  <<<<
//		
//		@Test
//		public void testAddAndGet1() {
//		    ArrayIntList list = new ArrayIntList();
//		    list.add(42);
//		    list.add(-3);
//		    list.add(17);
//		    list.add(99);
//		    assertEquals(42, list.get(0));
//		    assertEquals(-3, list.get(1));
//		    assertEquals(17, list.get(2));
//		    assertEquals(99, list.get(3));
//
//		    assertEquals("second attempt", 42, list.get(0));   // make sure I can get them a second time
//		    assertEquals("second attempt", 99, list.get(3));
//		}

//		@Test
//		public void testSize1() {
//		    ArrayIntList list = new ArrayIntList();
//		    assertEquals(0, list.size());
//		    list.add(42);
//		    assertEquals(1, list.size());
//		    list.add(-3);
//		    assertEquals(2, list.size());
//		    list.add(17);
//		    assertEquals(3, list.size());
//		    list.add(99);
//		    assertEquals(4, list.size());
//		    assertEquals("second attempt", 4, list.size());   // make sure I can get it a second time
//		}
//
//		@Test
//		public void testIsEmpty1() {
//		    ArrayIntList list = new ArrayIntList();
//		    assertTrue(list.isEmpty());
//		    list.add(42);
//		    assertFalse("should have one element", list.isEmpty());
//		    list.add(-3);
//		    assertFalse("should have two elements", list.isEmpty());
//		}
//
//		@Test
//		public void testIsEmpty2() {
//		    ArrayIntList list = new ArrayIntList();
//		    list.add(42);
//		    list.add(-3);
//		    assertFalse("should have two elements", list.isEmpty());
//		    list.remove(1);
//		    list.remove(0);
//		    assertTrue("after removing all elements", list.isEmpty());
//		    list.add(42);
//		    assertFalse("should have one element", list.isEmpty());
//		}
//
//		
		
		
		
		
	}

}
