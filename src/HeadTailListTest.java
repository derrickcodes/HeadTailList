import static org.junit.Assert.*;

import org.junit.Test;


public class HeadTailListTest {

	@Test
	public void testHeadTailList() {
		HeadTailList list = new HeadTailList();
		assertEquals(0, list.getLength());
	}

	@Test
	public void testClear() {
		HeadTailList list = new HeadTailList();
		assertEquals(0, list.getLength());
	}

	@Test
	public void testIsEmpty() {
		HeadTailList list = new HeadTailList();
		assertEquals(0, list.getLength());
	}

	@Test
	public void testAddObject() {
		boolean ans;	// defaults to false
		HeadTailList list = new HeadTailList();
		list.add("apple");
		list.add("pear");
		ans = list.add("melon");
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("melon", list.getEntry(3));
		assertTrue(ans);
	}

	@Test
	public void testAddIntObject() {
		boolean ans;	// defaults to false
		HeadTailList list = new HeadTailList();
		list.add("apple");
		list.add("pear");
		list.add("melon"); 
		ans = list.add(3, "orange");	// input specific value at specific location
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("orange", list.getEntry(3));
		assertEquals("melon", list.getEntry(4));
		assertTrue(ans);
	}

	@Test
	public void testRemove() {
		HeadTailList list = new HeadTailList();
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		list.add("blueberry");
		list.remove(4);
		// test that strawberry was removed and blueberry became entry #4
		assertEquals("blueberry", list.getEntry(4));
	}

	@Test
	public void testReplace() {
		HeadTailList list = new HeadTailList();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		// replace 3rd value (banana) with melon then verify
		list.replace(3, "melon");
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("melon", list.getEntry(3));
		assertEquals("strawberry", list.getEntry(4));
	}

	@Test
	public void testGetEntry() {
		HeadTailList list = new HeadTailList();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("banana", list.getEntry(3));
		assertEquals("strawberry", list.getEntry(4));
	}

	@Test
	public void testContains() {
		HeadTailList list = new HeadTailList();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		assertEquals(true, list.contains("pear"));
	}

	@Test
	public void testIsFull() {
		HeadTailList list = new HeadTailList();
		boolean ans = false;
		assertEquals(ans, list.isFull());
	}

	@Test
	public void testGetLength() {
		HeadTailList list = new HeadTailList();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		assertEquals(4, list.getLength());
		list.add("melon");
		assertEquals(5, list.getLength());
	}

}
