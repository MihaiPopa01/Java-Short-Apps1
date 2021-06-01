package homeworkJava_1_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int sum = 0;
		try {
			File inputFile = new File("src/InputFile");
			Scanner in = new Scanner(inputFile);
			ArrayList<Integer> integerArray = new ArrayList<>();
			while (in.hasNext()) {
				if (in.hasNextInt()) {
					integerArray.add(in.nextInt());
				} else {
					in.next();
				}
			}

			for (Integer integer : integerArray) {
				sum = sum + integer;

			}

		} catch (FileNotFoundException ex1) {
			System.out.println("FILE NOT FOUND!");
			ex1.printStackTrace();
		} catch (IOException ex2) {
			System.out.println("IOException!");
			ex2.printStackTrace();
		} finally {
			System.out.println("Sum of integers is: " + sum);
		}

	}
}