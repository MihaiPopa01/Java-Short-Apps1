package homeworkJava_1_5;

public class Wheel implements Mechanism {
	@Override
	public void move() {
		System.out.println("Wheel -> move()");
	}

	public void goTo() {
		this.move();
		System.out.println("Wheel -> goTo()");
	}
}