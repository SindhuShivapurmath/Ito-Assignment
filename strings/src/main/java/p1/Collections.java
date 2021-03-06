package p1;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Collections implements CommandLineRunner{
	
	static ArrayList<String> studentNames = new ArrayList<String>();

	
	public static void main(String[] args) throws Exception {
		Collections collections=new Collections();
		collections.run();
	}
	@Override
	public void run(String... args) throws Exception {
		createArrayList();
		insertElementAtFirst(studentNames,"Kavya");
		retriveElement(studentNames, 0);
		updateElement( studentNames, 2, "Sindhu S M");
		removeElementFromThirdPosition(studentNames);
		searchElement(studentNames, "Sindhu S M");
		emptyCheck( studentNames);
	}
	
	
	static ArrayList<String> insertElementAtFirst(ArrayList<String> studentNames2, String  name) {
		studentNames.add(0, name);
		return studentNames;

	}
	public static ArrayList<String> createArrayList() {

		ArrayList<String> studentNames = new ArrayList<String>();

		// add student names to arraylist
		studentNames.add("Sindhu");
		studentNames.add("Sahana");
		studentNames.add("Kavana");
		studentNames.add("Raksha");
		studentNames.add("Akshu");

		// print the students list
		for (String name : studentNames) {
			System.out.println(name);
		}
		return studentNames;

	}
	public static String retriveElement(ArrayList<String> studentNames, int index) {
			return studentNames.get(index);
	}
	public static ArrayList<String> updateElement(ArrayList<String> studentNames, int index, String name) {

		// update element at specified position
		studentNames.set(index, name);
		return studentNames;

	}
	public static ArrayList<String> removeElementFromThirdPosition(ArrayList<String> studentNames) {

		// remove third element from arraylist
		studentNames.remove(3);
		return studentNames;
	}
	public static boolean searchElement(ArrayList<String> studentNames, String name) {

		// search element is present or not
		return studentNames.contains(name);

	}
	public static ArrayList<String> sortArrayList(ArrayList<String> studentNames) {
		// sort the array list in ascending order
		java.util.Collections.sort(studentNames);
		// System.out.println(studentNames);
		return studentNames;

	}
	public static boolean emptyCheck(ArrayList<String> studentNames) {
		return studentNames.isEmpty();

	}

}
