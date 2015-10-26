public class CondenseNames {

	/* Given a name, return the first and last name with the 
		middle names abbreviated 			 */

	/* EX: William Thomas Livesey -> William T. Livesey
	       John Bob Michael Scott -> John B. M. Scott     */	

	public static void main(String[] args) {
		System.out.println(condense("will thomas livesey"));
		System.out.println(condense("John bob michael scott"));
	}

	public static String condense(String name) {
		int numSpaces = countSpaces(name);
		StringBuilder result = new StringBuilder();	

		if(numSpaces < 2) {
			return name;
		}
		
		String[] eachName = name.split(" ");
		result.append(eachName[0] + " ");

		for(int i = 1; i < eachName.length - 1; i++) {
			result.append(eachName[i].charAt(0) + ". ");
		}		

		result.append(eachName[eachName.length-1]);

		return result.toString();
	}

	public static int countSpaces(String name) {
		int numberOfSpaces = 0;
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == ' ') {
				numberOfSpaces++;
			}
		}
		return numberOfSpaces;
	}	

}
