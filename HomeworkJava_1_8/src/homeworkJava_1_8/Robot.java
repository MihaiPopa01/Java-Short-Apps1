package homeworkJava_1_8;

public class Robot implements Computer, Mechanism {
	@Override
	public void on() {
		System.out.println("Device -> on");
	}

	@Override
	public void off() {
		System.out.println("Device -> off");
	}

	@Override
	public void boot() {
		System.out.println("Computer -> boot");
	}

	@Override
	public void move() {
		System.out.println("Mechanism -> move");
	}

	public void turnOnRobot() {
		on();
		boot();
		System.out.println("The robot turned on!");
	}

	public void moveRobot() {
		System.out.println("The robot moves!");
		move();
		move();
		move();
	}

	public void turnOffRobot() {
		off();
		System.out.println("The robot turned off!");
	}
}
