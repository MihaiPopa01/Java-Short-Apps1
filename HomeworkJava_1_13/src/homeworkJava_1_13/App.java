package homeworkJava_1_13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

	int readNumber() throws InputMismatchException {
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}

	public static void main(String[] args) {
		App app1 = new App();
		Integer nr, sum;
		sum = 0;
		boolean ok = false;
		while (ok == false) {
			try {
				nr = app1.readNumber();
				ok = true;
				sum += nr;

			} catch (InputMismatchException ex) {

				System.err.println("Value is not an integer number! Insert an integer number!");

			}
		}
		ok = false;
		while (ok == false) {
			try {
				nr = app1.readNumber();
				ok = true;
				sum += nr;

			} catch (InputMismatchException ex) {

				System.err.println("Value is not an integer number! Insert an integer number!");

			}
		}
		System.out.println("Suma:" + sum);
	}

}