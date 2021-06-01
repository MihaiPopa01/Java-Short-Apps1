package homeworkJava_1_17;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMap_ {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(4, "D");
		hashmap.put(1, "A");
		hashmap.put(8, "A");
		hashmap.put(2, "B");
		hashmap.put(3, "C");

		System.out.print("Hashmap is:\n" + hashmap);

		Map<Integer, String> map = new HashMap<Integer, String>();

		// using TreeMap constructor to sort the HashMap
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>(hashmap);
		System.out.print("\n\nSorted hashmap is:\n" + hashmap);

	}

}
