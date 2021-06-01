package homeworkJava_1_1;

import java.util.Scanner;

class A {
	protected int x;

	public A(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public void displayX() {
		System.out.println("x=" + x);
	}

}

class B extends A {

	protected String s;

	public B(int x) {
		super(x);
	}

	public void readS() {
		Scanner in = new Scanner(System.in);
		this.s = in.nextLine();
		//in.close();
	}

	@Override
	public void displayX() {
		System.out.println("x=" + x);
	}

}

class C extends B {

	private float y;

	public C(int x) {
		super(x);
	}

	public void readY() {
		Scanner in = new Scanner(System.in);
		this.y = in.nextFloat();
	}

	public void readX() {
		Scanner in = new Scanner(System.in);
		this.x = in.nextInt();
	}

	public void displayXYS() {
		System.out.println("X = " + x + ", " + "Y = " + y + ", " + "S = " + s);
	}

}

public class Main {

	public static void main(String args[]) {
		C objC = new C(7);
		System.out.println("Introduceti un int, float, string de la tastatura: ");
		objC.readX();
		objC.readY();
		objC.readS();
		objC.displayX();
		objC.displayXYS();
		System.out.println(objC.getX());
	}
}