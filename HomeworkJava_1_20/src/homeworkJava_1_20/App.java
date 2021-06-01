package homeworkJava_1_20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	Double readNumber() {
		Scanner in = new Scanner(System.in);
		Double nr;
		try {
			nr = in.nextDouble();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			return null;
		}
		return nr;
	}

	public static void main(String[] args) {

		System.out.println("Enter 2 numbers: ");
		App app1 = new App();
		Double nr1, nr2, sum;
		sum = 0.0;
		nr1 = app1.readNumber();
		if (nr1 != null) {
			sum += nr1;
		} else {
			System.err.println("Value is not a number");
		}

		nr2 = app1.readNumber();
		if (nr2 != null) {
			sum += nr2;
		} else {
			System.err.println("Value is not a number");
		}
		System.out.println("Suma:" + sum);
	}
}