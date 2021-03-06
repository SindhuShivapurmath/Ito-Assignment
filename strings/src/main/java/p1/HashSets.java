package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HashSets implements CommandLineRunner{
	public static void main(String[] args) throws Exception {
		HashSets collections=new HashSets();
		collections.run();
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}
	
	public HashSet<String> createHashSet() {
		HashSet<String> studentNames = new HashSet<String>();
		studentNames.add("Sindhu");
		studentNames.add("sahana");
		studentNames.add("Kavana");
		studentNames.add("Raksha");
		studentNames.add("Rakshu");

		// iterate through all elements in hash set
		Iterator<String> itr = studentNames.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		return studentNames;
	}

	public static HashSet<String> addElement(HashSet<String> studentNames, String name) {
		studentNames.add(name);
		return studentNames;

	}

	public static int getSize(HashSet<String> studentNames) {
		return studentNames.size();
	}

	public static HashSet<String> clearSet(HashSet<String> studentNames) {
		studentNames.clear();
		return studentNames;

	}

	public static Object[] SetToArray(HashSet<String> studentNames) {
		Object[] arr = studentNames.toArray();
		return arr;
	}

	public static ArrayList<String> SetToList(HashSet<String> studentNames) {
		ArrayList<String> students = new ArrayList<String>(studentNames);
		return students;

	}

	public static boolean compareHashSet(HashSet<String> studentNames, HashSet<String> hashSet) {
		return studentNames.equals(hashSet);

	}

	public static HashSet<String> getEqualElements(HashSet<String> studentNames, HashSet<String> newSet) {
		HashSet<String> commonSet = new HashSet<String>();
		for (String name : studentNames) {
			if (newSet.contains(name)) {
				commonSet.add(name);
			}
		}
		return commonSet;
	}
	

}
