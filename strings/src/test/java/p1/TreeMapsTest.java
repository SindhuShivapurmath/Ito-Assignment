package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeMapsTest {

	private TreeMap<Integer, String> studentsName5;

	private TreeMaps treeMaps;

	@BeforeEach
	void treeMapSetUp() {
		studentsName5 = new TreeMap<Integer, String>();
		studentsName5.put(6, "Sindhu");
		studentsName5.put(7, "Sahana");
		studentsName5.put(8, "Kavana");
		studentsName5.put(9, "Lakshmi");
		studentsName5.put(10, "Kiran");
	}

	@Test
	void createTreeMapTest() {
		assertFalse(TreeMaps.createTreeMap().isEmpty());
	}
	@Test
	void getAllKeysTest() {
		Set<Integer> keySet = TreeMaps.getAllKeys(studentsName5);
		assertEquals(5, keySet.size());
	}

	
	@Test
	void deleteAllElementsTest() {
		assertTrue(TreeMaps.deleteAllElements(studentsName5).isEmpty());
	}

	
	@Test
	void getFirstKeyTest() {
		assertEquals(6, TreeMaps.getFirstKey(studentsName5));
	}

	
	@Test
	void getLastKeyTest() {
		assertEquals(10, TreeMaps.getLastKey(studentsName5));
	}

	
	@Test
	void reverseOrderKeyViewTest() {
		Set<Integer> sortedKeys = new HashSet<Integer>();
		sortedKeys.add(10);
		sortedKeys.add(9);
		sortedKeys.add(8);
		sortedKeys.add(7);
		sortedKeys.add(6);
		assertTrue(sortedKeys.equals(TreeMaps.reverseOrderKeyView(studentsName5)));
	}


	@Test
	void sortKeysTest() {
		Set<Integer> sortedKeys = new HashSet<Integer>();
		sortedKeys.add(6);
		sortedKeys.add(7);
		sortedKeys.add(8);
		sortedKeys.add(9);
		sortedKeys.add(10);
		assertTrue(sortedKeys.equals(TreeMaps.sortKeys(studentsName5)));
	}
}
