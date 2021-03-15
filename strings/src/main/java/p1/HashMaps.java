package p1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HashMaps implements CommandLineRunner {
	
	
	public static void main(String[] args) throws Exception {
		HashMaps collections=new HashMaps();
		collections.run();
	}
	@Override
	public void run(String... args) throws Exception {
		
	}

	public static void createHashMap() {
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "Sindhu");
		students.put(2, "Sahana");
		students.put(3, "Kavana");
		students.put(4, "Kavya");
		students.put(5, "Akshu");
		for (Map.Entry e : students.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	public static void iterateOverMap(HashMap<Integer, String> students) {
		for (Map.Entry e : students.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	public static String getValue(HashMap<Integer, String> students, int key) {
		String val = students.get(key);
		return val;
	}

	public static int getSize(HashMap<Integer, String> students) {
		return students.size();
	}

	public static HashMap<Integer, String> createCopy(HashMap<Integer, String> students) {
		HashMap<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.putAll(students);
		return newMap;

	}

	public static HashMap<Integer, String> removeAll(HashMap<Integer, String> students) {
		students.clear();
		return students;
	}

	public static boolean checkKeyMapping(HashMap<Integer, String> students, int key) {
		return students.containsKey(key);
	}

	public static boolean checkValueMapping(HashMap<Integer, String> students, String value) {
		return students.containsValue(value);
	}

	public static String getValueForKey(HashMap<Integer, String> students, int key) {
		return students.getOrDefault(key, "ABC");
	}

	public static Set<Integer> getSetView(HashMap<Integer, String> students) {
		Set<Integer> keyset = students.keySet();
		return keyset;

	}

	public static Collection<String> getCollectionView(HashMap<Integer, String> students) {
		return students.values();
	}
}
