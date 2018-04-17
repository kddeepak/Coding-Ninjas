package L13;

public class ClassA {
	private int x;
	final int y = 100;
	final int y2;
	public int z;
	
	final static int r = 10;
	
	public ClassA(int y2) {
		this.y2 = y2;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int r, int password) {
		if(password != 123) {
			return;
		}
		if(r < 0) {
			return;
		}
		x = r;
	}
	
}
