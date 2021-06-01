package homeworkJava_1_17;

import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		int[] array = new int[15];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
		System.out.println("Array is:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		Arrays.sort(array);
		
		System.out.println("\n\nSorted array is:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}
