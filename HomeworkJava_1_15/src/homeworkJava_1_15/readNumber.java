package homeworkJava_1_15;

import java.util.Scanner;

public class readNumber {
	public static int read() throws MyEquationException {
		Scanner in = new Scanner(System.in);
		int x;
		x = in.nextInt();
		if (x == 0) {
			throw new MyEquationException("You entered 0!");
		}
		return x;
	}
}
