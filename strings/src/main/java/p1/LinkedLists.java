package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinkedLists implements CommandLineRunner{
	
	public static void main(String[] args) throws Exception {
		LinkedLists collections=new LinkedLists();
		collections.run();
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
	}
	
	public static LinkedList<String> createLinkedList() {
		LinkedList<String> studentNames = new LinkedList<String>();

		studentNames.add("Sindhu");
		studentNames.add("Sahana");
		studentNames.add("Kavana");
		studentNames.add("Kavya"); 
		studentNames.add("Kiran"); 

		return studentNames;
		}
	
	public static void iterateLinkedList(LinkedList<String> studentNames) {

		Iterator<String> itr = studentNames.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static LinkedList<String> appendAtLast(LinkedList<String> studentNames, String newStudent) {

		studentNames.addLast(newStudent);
		return studentNames;
		}
 
	
	public static void iterateAtSpecifiedPosition(LinkedList<String> studentNames, int index) {

		
		ListIterator listItr = studentNames.listIterator(index);

		
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
	}

	
	public static void iterateInReverseOrder(LinkedList<String> studentNames) { 

		
		Iterator<String> listItr = studentNames.descendingIterator();
		
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
	}

	
	
	public static void insertAtSpecifiedPosition(LinkedList<String> studentNames, int index, String name) {
		studentNames.add(2, name);
	}

	
	public static LinkedList<String> insertAtFront(LinkedList<String> studentNames, String name) {

		studentNames.offerFirst(name);
		return studentNames;
	}

	
	public  static LinkedList<String> insertAtEnd(LinkedList<String> studentNames, String name) {
		studentNames.offerLast(name);
		return studentNames;
	}

	
	public static String removeFirstElement(LinkedList<String> studentNames) {
		return studentNames.removeFirst();
	}

	public static String removeLastElement(LinkedList<String> studentNames) {
		return studentNames.removeLast();
	}

	public static LinkedList<String> joinLinkedList(LinkedList<String> studentNames, LinkedList<String> studentSurnames) {
		studentNames.addAll(studentSurnames);
		return studentNames;

	}

	public static LinkedList<String> cloneLinkedList(LinkedList<String> studentNames) {
		LinkedList<String> students = (LinkedList<String>) studentNames.clone();
		return students;
	}

	public static LinkedList<String> removeFirst(LinkedList<String> studentNames) {
		studentNames.remove();
		return studentNames;

	}

	public static String retriveFirst(LinkedList<String> studentNames) {
		return studentNames.getFirst();

	}

	public static boolean existCheck(LinkedList<String> studentNames, String name) {
		return studentNames.contains(name);
	}

	public static ArrayList<String> linkedListToArrayList(LinkedList<String> studentNames) {
		ArrayList<String> students = new ArrayList<String>(studentNames);
		return students;
	}

	public static LinkedList<String> clearLinkedList(LinkedList<String> studentNames) {
		studentNames.clear();
		return studentNames;
	}


}
