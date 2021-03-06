package p1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreeMaps implements CommandLineRunner {
	public static void main(String[] args) throws Exception {
		TreeMaps collections=new TreeMaps();
		collections.run();
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}
	
	public static TreeMap<Integer, String> createTreeMap() {
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(23, "Sindhu");
		students.put(24, "Sahana");
		students.put(25, "Lakshmi");
		students.put(26, "Pooja");
		students.put(27, "Komi");
		return students;
	}
	
	public static Set<Integer> getAllKeys(TreeMap<Integer, String> students) {
		return students.keySet();

	}

	public static TreeMap<Integer, String> deleteAllElements(TreeMap<Integer, String> students) {
		students.clear();
		return students;

	}

	public static Set<Integer> sortKeys(TreeMap<Integer, String> students) {
		TreeMap<Integer, String> dummyMap = new TreeMap<Integer, String>();
		dummyMap.putAll(students);
		return dummyMap.keySet();
	}

	public static int getFirstKey(TreeMap<Integer, String> students) {
		return students.firstKey();
	}

	public static int getLastKey(TreeMap<Integer, String> students) {
		return students.lastKey();
	}

	public static Set<Integer> reverseOrderKeyView(TreeMap<Integer, String> students) {
		Set<Integer> keySet = new HashSet<Integer>(students.descendingKeySet());
		return keySet;
	}
}

class sort_key implements Comparator<Integer> {
	@Override
	public int compare(Integer key1, Integer key2) {
		return key1.compareTo(key2);
	}

	
}
