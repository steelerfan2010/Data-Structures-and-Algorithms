public class LargestRectangle {

	/* Given an array of strings find the largest rectangle
		that can enclose all of them */

	/* Example string: "X=10 Y=20 W=15 H=10" */
	/* Where (X,Y) represents the lower left corner */

	public static void main(String[] args) {
		LargestRectangle lr = new LargestRectangle();
		String str1 = "X=10 Y=15 W=20 H=25";
		String[] s = new String[1];
		s[0] = str1;
		System.out.println(getLargestEnclosingRectangle(s));
	}

	public static String getLargestEnclosingRectangle(String[] rectangles) {
		Rectangle a = parseString(rectangles[0]);

		int maxX = a.width;
		int maxY = a.height;
		int minX = a.x;
		int minY = a.y;

		for(int i = 1; i < rectangles.length; i++) {
			a = parseString(rectangles[i]);
				
			if(a.x < minX) {
				minX = a.x;
			}
			if(a.y < minY) {
				minY = a.y;
			}
			if((a.x + a.width) > maxX) {
				maxX = a.x + a.width;
			}
			if((a.y + a.height) > maxY) {
				maxY = a.y + a.height;
			}
		}

//		System.out.println(a);
		return ("X=" + minX + " Y=" + minY + " W=" 
			+ (maxX - minX) + " H=" + (maxY - minY));
	}

	public static Rectangle parseString(String str) {
		String[] parse = str.split("[a-zA-z]=");

		Rectangle rec = new Rectangle();
		rec.x = Integer.parseInt(parse[1].trim());
		rec.y = Integer.parseInt(parse[2].trim());
		rec.width = Integer.parseInt(parse[3].trim());
		rec.height = Integer.parseInt(parse[4].trim());

		return rec;
	}
}
