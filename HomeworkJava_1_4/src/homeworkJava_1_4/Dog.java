package homeworkJava_1_4;

public abstract class Dog implements Domestic_Animal {

	@Override
	public void move() {
		System.out.println("Dog moves fast.");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats bones.");
	}

	@Override
	public void isFriendly() {
		System.out.println("Dog is friendly.");
	}

	abstract void habitat();
}
