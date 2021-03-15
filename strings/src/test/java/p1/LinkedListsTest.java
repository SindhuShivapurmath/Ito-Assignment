package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListsTest {

	private LinkedList<String> studentNames3;

	@BeforeEach
	void linkedListSetUp() {
		studentNames3 = new LinkedList<String>();
		studentNames3.add("Sindhu");
		studentNames3.add("Sahana");
		studentNames3.add("Kavana");
		studentNames3.add("Kavya"); 
		studentNames3.add("Kiran"); 
	}


	@Test
	void appendAtLastTest() {
		LinkedList<String> linkedList = LinkedLists.appendAtLast(studentNames3, "Komi");
		assertEquals("Komi", linkedList.getLast());
	}

	@Test
	void insertAtFrontTest() {
		assertEquals("Kirana", LinkedLists.insertAtFront(studentNames3,"Kirana").getFirst());
	}

	@Test
	void insertAtEndTest() {

		assertEquals("Rakshu", LinkedLists.insertAtEnd(studentNames3, "Rakshu").getLast());
	}

	
	@Test
	void removeFirstElementTest() {

		assertEquals("Sindhu", LinkedLists.removeFirstElement(studentNames3));
	}

	@Test
	void removeLastElementTest() {

		assertEquals("Kiran", LinkedLists.removeLastElement(studentNames3));
	}

	@Test
	void joinLinkedListTest() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Nitin");
		assertTrue(LinkedLists.joinLinkedList(studentNames3, linkedList).contains("Nitin"));
	}

	
	@Test
	void cloneLinkedListTest() {
		assertArrayEquals(studentNames3.toArray(), LinkedLists.cloneLinkedList(studentNames3).toArray());
	}

	

}
