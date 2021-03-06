package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashSetsTest {
	
	 private HashSet<String> studentNames2;

		@BeforeEach
		void setUp() {
			studentNames2 = new HashSet<String>();
			studentNames2.add("Krishna");
			studentNames2.add("Karna");
			studentNames2.add("Arjuna");
			studentNames2.add("Bheema");
			studentNames2.add("Nakula");
		}


	@Test
	public void testAddElement() {
		String name = "Rama";
		HashSet<String> hashSet = HashSets.addElement(studentNames2, name);
		assertTrue(hashSet.contains("Rama"));
	}

	@Test
	public void testGetSize() {
		assertEquals(5, HashSets.getSize(studentNames2));
	}

	@Test
	public void testClearSet() {
		HashSet<String> hashSet = HashSets.clearSet(studentNames2);
		assertTrue(hashSet.isEmpty());
	}

	@Test
	public void testSetToArray() {
		Object[] arr = HashSets.SetToArray(studentNames2);
		assertArrayEquals(studentNames2.toArray(), arr);
	}

	@Test
	public void testCompareHashSet() {
		HashSet<String> hashSet = new HashSet<String>();
		assertFalse(HashSets.compareHashSet(studentNames2, hashSet));
	}

	@Test
	public void testGetEqualElements() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Sanku");
		hs.add("Dinku");
		HashSet<String> hashSet2 = HashSets.getEqualElements(studentNames2, hs);
		assertNotEquals(2, hashSet2.size());
		assertFalse(hashSet2.contains("Sanku"));
	}



}
