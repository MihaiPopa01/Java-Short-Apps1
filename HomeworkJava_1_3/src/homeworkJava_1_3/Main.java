package homeworkJava_1_3;

class B {
	private int x, y, z;

	public B(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", z=" + z;
	}

}

public class Main {

	public static void main(String[] args) {
		B Bobj = new B(10, 5, 2);
		System.out.println(Bobj.toString());
	}

}
