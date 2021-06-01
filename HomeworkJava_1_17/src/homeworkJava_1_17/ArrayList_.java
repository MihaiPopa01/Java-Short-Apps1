package homeworkJava_1_17;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_ {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			arraylist.add(rand.nextInt(1000));
		}
		System.out.println("Arraylist is:");
		for (int counter : arraylist) {
			System.out.print(counter + " ");
		}

		/* Sorting of arraylist using Collections.sort */
		Collections.sort(arraylist);

		/* ArrayList after sorting */
		System.out.println("\n\nSorted Arraylist is:");
		for (int counter : arraylist) {
			System.out.print(counter + " ");
		}
	}
}
