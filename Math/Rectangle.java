public class Rectangle {

	int x;
	int y;
	int width;
	int height;

	public Rectangle() {

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("X=" + x + " Y=" + y + " W=" + width + " H=" + height);
		return sb.toString();
	}

}
