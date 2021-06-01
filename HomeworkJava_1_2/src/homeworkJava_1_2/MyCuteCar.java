package homeworkJava_1_2;

public class MyCuteCar extends Car {

	public void startRocketEngine() {
		startEngine();
		System.out.println("Start rocket engine!");
	}
	
	public void stopRocketEngine() {
		System.out.println("Stop rocket engine!");
		stopEngine();
	}
}