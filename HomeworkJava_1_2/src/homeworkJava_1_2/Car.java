package homeworkJava_1_2;

public class Car {

	protected int speed;

	public void start() {
		System.out.println("Start!");
	}

	public void accelerate() {
		System.out.println("Accelerate!");
	}

	public void stop() {
		System.out.println("Stop!");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void startEngine() {
		System.out.println("Start engine!");
	}

	public void stopEngine() {
		System.out.println("Stop engine!");
	}

}
