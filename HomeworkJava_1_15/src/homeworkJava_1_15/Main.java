package homeworkJava_1_15;

public class Main {

	public static void main(String[] args) {
		int a = 0, b = 0;
		System.out.println("Enter a and b:");
		try {
			a = readNumber.read();
		} catch (MyEquationException ex1) {
			ex1.printStackTrace();
			ex1.getMessage();
		}
		try {
			b = readNumber.read();
		} catch (MyEquationException ex2) {
			ex2.printStackTrace();
			ex2.getMessage();
		}
		Equation ecuation = new Equation(a, b);
		int x = ecuation.solve();
		if (b >= 0) {
			System.out.println("Equation result " + a + "x + " + b + " = 0 is " + x);
		} else {
			System.out.println("Equation result " + a + "x " + b + " = 0 is " + x);
		}
	}

}
