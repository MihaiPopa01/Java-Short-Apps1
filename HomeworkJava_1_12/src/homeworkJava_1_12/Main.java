package homeworkJava_1_12;

public class Main {

	public static void main(String[] args) {

		int x = ReadFile.readFromFile();
		int result = 1;
		try {
			result = 2 * x;
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("The result is: " + result);
	}

}
