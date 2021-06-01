package homeworkJava_1_15;

public class Equation {
	private int a, b;

	public Equation(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int solve() {
		int x;
		try {
			x = -b / a;
		} catch (ArithmeticException e) {
			e.getMessage();
			x = -1;
		}

		return x;
	}

}
