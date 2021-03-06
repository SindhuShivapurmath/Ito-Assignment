package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollectionsTest {

	private ArrayList<String> studentNames;
	
	@BeforeEach
	void setUp() {
		studentNames = new ArrayList<String>();
		studentNames.add("Sindhu");
		studentNames.add("Sahana");
		studentNames.add("Kavana");
		studentNames.add("Raksha");
		studentNames.add("Akshu");
		
	}
	
	@Test
	public void tesInsertElementAtFirst() {
		String name = "Kavya";
		ArrayList<String> arrayList = Collections.insertElementAtFirst(studentNames, name);
		assertSame(name, arrayList.get(0));
	}

	@Test
	public void testRetriveElement() {
		String name =Collections.retriveElement(studentNames, 2);
		assertEquals(name, "Kavana");
	}
	
	@Test
	public void testUpdateElement() {
		String name = "Sindhu S M";
		ArrayList<String> arrayList = Collections.updateElement(studentNames, 2, name);
		assertSame(name, arrayList.get(2));
		assertNotSame(name, arrayList.get(3));
	}
	
	
	@Test
	public void testRemoveElementFromThirdPosition() {
		ArrayList<String> arrayList = Collections.removeElementFromThirdPosition(studentNames);
		assertNotSame("Sindhu S M", arrayList.get(3));
	}
	
	@Test
	public void testSearchElement() {
		String name = "Sindhu";
		boolean result =  Collections.searchElement(studentNames, name);
		assertTrue(result);
	}
	
	@Test
	public void testSortArrayList() {
		ArrayList<String> arrayList = Collections.sortArrayList(studentNames);
		java.util.Collections.sort(studentNames);
		assertArrayEquals(studentNames.toArray(), arrayList.toArray());
	}
	
	@Test
	public void testEmptyCheck() {
		assertFalse(Collections.emptyCheck(studentNames));
	}
	

}
