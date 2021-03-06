package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashMapsTest {
	
	private HashMap<Integer, String> studentsName4;
	private HashMaps hashMapPrograms;

	@BeforeEach
	void hashMapSetUp() {
		studentsName4 = new HashMap<Integer, String>();
		studentsName4.put(1, "Sindhu");
		studentsName4.put(2, "Sahana");
		studentsName4.put(3, "Kavana");
		studentsName4.put(4, "Kavya");
		studentsName4.put(5, "Kiran");

	}
	
	@Test
	void getValueTest() {
		assertEquals("Sahana", HashMaps.getValue(studentsName4, 2));
	}
	
	@Test
	void createCopyTest() {
		assertEquals(5, HashMaps.getSize(studentsName4));
	}
	
	@Test
	void removeAllTest() {
		assertTrue(HashMaps.removeAll(studentsName4).isEmpty());
		
	}
	@Test
	void checkKeyMappingTest() {
		assertTrue(HashMaps.checkKeyMapping(studentsName4, 2));
		assertFalse(HashMaps.checkKeyMapping(studentsName4, 7));
		
	}
	
	@Test
	void checkValueMappingTest() {
		assertTrue(HashMaps.checkValueMapping(studentsName4, "Kavya"));
		assertFalse(HashMaps.checkValueMapping(studentsName4, "Kavan"));
	}
	
	@Test
	void getValueForKeyTest() {
		assertEquals("Kavya", HashMaps.getValueForKey(studentsName4, 4));
	}
	
	@Test
	void getCollectionViewTest() {
		Collection<String> values = new ArrayList<String>();
		values.add("Sindhu");
		values.add("Sahana");
		values.add("Kavana");
		values.add("Kavya");
		values.add("Kiran");
		assertArrayEquals(values.toArray(), HashMaps.getCollectionView(studentsName4).toArray());
	}

}
