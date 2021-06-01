package homeworkJava_1_12;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
	public static int readFromFile() {
		try {
			File inputFile = new File("src/InputFile");
			Scanner in = new Scanner(inputFile);
			return in.nextInt();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
			return 1;
		}

	}
}
